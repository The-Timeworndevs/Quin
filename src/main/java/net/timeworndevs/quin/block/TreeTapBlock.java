package net.timeworndevs.quin.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.timeworndevs.quin.common.CommonItemRegistry;
import org.jetbrains.annotations.Nullable;

public class TreeTapBlock extends HorizontalDirectionalBlock {

    public static final IntegerProperty FILL_LEVEL = IntegerProperty.create("fill_level", 0, 2);


    public TreeTapBlock(FabricBlockSettings settings) {
        super(settings);
        this.registerDefaultState(defaultBlockState().setValue(FACING, Direction.NORTH).setValue(FILL_LEVEL, 0));
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return state.getValue(FILL_LEVEL) < 3;
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (random.nextInt(5) == 0) {
            int i = state.getValue(FILL_LEVEL);
            if (i < 2) {
                level.setBlock(pos, state.setValue(FILL_LEVEL, i + 1), 2);
            }
        }
    }

    public static void dropResin(Level world, BlockPos pos) {
        popResource(world, pos, new ItemStack(CommonItemRegistry.RESIN, 1));
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getItemInHand(hand);
        int i = state.getValue(FILL_LEVEL);
        if (i >= 2) {
            if (itemStack.is(CommonItemRegistry.RESIN_CHISEL)) {
                level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.BEEHIVE_SHEAR, SoundSource.BLOCKS, 1.0f, 1.0f);
                dropResin(level, pos);
                itemStack.hurtAndBreak(1, player, (playerx)-> {
                    playerx.broadcastBreakEvent(hand);
                });
                level.gameEvent(player, GameEvent.SHEAR, pos);
            } else if (itemStack.is(Items.GLASS_BOTTLE)) {
                itemStack.shrink(1);
                level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
                if (itemStack.isEmpty()) {
                    player.setItemInHand(hand, new ItemStack(CommonItemRegistry.SAP_BOTTLE));
                } else {
                    player.getInventory().placeItemBackInInventory(new ItemStack(CommonItemRegistry.SAP_BOTTLE));
                }

                level.gameEvent(player, GameEvent.FLUID_PICKUP, pos);
            }if (!level.isClientSide()) {
                player.awardStat(Stats.ITEM_USED.get(itemStack.getItem()));
            }
            level.setBlockAndUpdate(pos, state.setValue(FILL_LEVEL, 0));
            return InteractionResult.SUCCESS;
        } else {
            return InteractionResult.FAIL;
        }
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockState blockState = level.getBlockState(pos.relative(state.getValue(FACING)));
        return blockState.is(BlockTags.LOGS);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState blockState = this.defaultBlockState();
        for (Direction dir : context.getNearestLookingDirections()) {
            if (dir.getAxis().isHorizontal()) {
                blockState = blockState.setValue(FACING, dir);
                if (blockState.canSurvive(context.getLevel(), context.getClickedPos())) {
                    return blockState;
                }
            }
        }

        return null;
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        return direction == state.getValue(FACING) && !state.canSurvive(level, pos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }

    @Override
    public boolean isPathfindable(BlockState state, BlockGetter level, BlockPos pos, PathComputationType type) {
        return false;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, FILL_LEVEL);
    }
}
