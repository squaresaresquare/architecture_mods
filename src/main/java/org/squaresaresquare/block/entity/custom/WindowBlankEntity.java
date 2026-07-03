package org.squaresaresquare.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.squaresaresquare.block.entity.ModBlockEntities;

public class WindowBlankEntity extends BlockEntity {
    public WindowBlankEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.WINDOW_BLANK_ENTITY, pos, state);
    }
}
        
