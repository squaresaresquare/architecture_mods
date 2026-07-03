package org.squaresaresquare.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.squaresaresquare.block.entity.ModBlockEntities;

public class StoneBlockEntity extends BlockEntity {
    public StoneBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.STONE_BLOCK_ENTITY, pos, state);
    }
}
        
