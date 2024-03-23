package net.timeworndevs.quin.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.timeworndevs.quin.common.CommonItemRegistry;
import org.jetbrains.annotations.Nullable;

public class TreeTapBlock extends HorizontalDirectionalBlock {

    public static final IntegerProperty FILL_LEVEL = IntegerProperty.create("fill_level", 0, 2);


    public TreeTapBlock(FabricBlockSettings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH)).with(FILL_LEVEL, 0));
    }

    public boolean hasRandomTicks(BlockState state) {
        return (Integer)state.get(FILL_LEVEL) < 3;
    }

    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, Random random) {
        if (world.random.nextInt(5) == 0) {
            int i = (Integer)state.get(FILL_LEVEL);
            if (i < 2) {
                world.setBlockState(pos, (BlockState)state.with(FILL_LEVEL, i + 1), 2);
            }
        }

    }

    public static void dropResin(Level world, BlockPos pos) {
        dropStack(world, pos, new ItemStack(CommonItemRegistry.RESIN, 1));
    }

    public InteractionResult onUse(BlockState state, Level world, BlockPos pos, Player player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        int i = (Integer)state.get(FILL_LEVEL);
        if (i >= 2) {
            Item item = itemStack.getItem();
            if (itemStack.isOf(CommonItemRegistry.RESIN_CHISEL)) {
                world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.BLOCK_BEEHIVE_SHEAR, SoundCategory.BLOCKS, 1.0f, 1.0f);
                dropResin(world, pos);
                itemStack.damage(1, player, (playerx)-> {
                    playerx.sendToolBreakStatus(hand);
                });
                world.emitGameEvent(player, GameEvent.SHEAR, pos);
            } else if (itemStack.isOf(Items.GLASS_BOTTLE)) {
                itemStack.decrement(1);
                world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                if (itemStack.isEmpty()) {
                    player.setStackInHand(hand, new ItemStack(CommonItemRegistry.SAP_BOTTLE));
                } else if (!player.getInventory().insertStack(new ItemStack(CommonItemRegistry.SAP_BOTTLE))) {
                    player.dropItem(new ItemStack(CommonItemRegistry.SAP_BOTTLE), false);
                }

                world.emitGameEvent(player, GameEvent.FLUID_PICKUP, pos);
            }if (!world.isClient()) {
                player.incrementStat(Stats.USED.getOrCreateStat(item));
            }
            world.setBlockState(pos, state.with(FILL_LEVEL, 0));
            return ActionResult.SUCCESS;
        } else {
            return ActionResult.FAIL;
        }
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos.offset((Direction) state.get(FACING)));
        return blockState.isIn(BlockTags.LOGS);
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = this.getDefaultState();
        WorldView worldView = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        Direction[] var5 = ctx.getPlacementDirections();
        int var6 = var5.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            Direction direction = var5[var7];
            if (direction.getAxis().isHorizontal()) {
                blockState = (BlockState)blockState.with(FACING, direction);
                if (blockState.canPlaceAt(worldView, blockPos)) {
                    return blockState;
                }
            }
        }

        return null;
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return direction == state.get(FACING) && !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        world.setBlockState(pos, (BlockState)state.with(FILL_LEVEL, (Integer)state.get(FILL_LEVEL) + 1), 2);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder){
        builder.add(new Property[]{FACING, FILL_LEVEL});
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }
}
