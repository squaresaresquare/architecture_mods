package org.squaresaresquare.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.squaresaresquare.Architecture_blocks;
import org.squaresaresquare.block.entity.ModBlockEntities;
import org.squaresaresquare.Architecture_blocks.*;

public class WindowBlankEntity extends BlockEntity {
    public static final Logger LOGGER = LoggerFactory.getLogger(Architecture_blocks.MOD_ID);

    public WindowBlankEntity(BlockPos pos, BlockState state) {
        System.out.print("the WINDOW_BLANK_ENTITY class\n");
        LOGGER.debug("The window entity class\n");
        super(ModBlockEntities.WINDOW_BLANK_ENTITY, pos, state);
    }
}
        
