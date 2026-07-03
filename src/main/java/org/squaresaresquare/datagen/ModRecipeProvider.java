package org.squaresaresquare.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import org.squaresaresquare.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super();
    }


    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.MARBLE_PILLAR, ModBlocks.MARBLE_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.INNER_ARCH_BLOCK, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.CENTER_PILLAR_BASE, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.CENTER_PILLAR_CAP, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.CENTER_PILLAR_MIDDLE, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_END_BASE, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_END_CAP, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_END_MIDDLE, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_HALF_PILLAR_BASE, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_HALF_PILLAR_CAP, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_HALF_PILLAR_MIDDLE, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_PILLAR_BASE, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_PILLAR_CAP, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LEFT_PILLAR_MIDDLE, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_END_BASE, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_END_CAP, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_END_MIDDLE, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_HALF_PILLAR_BASE, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_HALF_PILLAR_CAP, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_HALF_PILLAR_MIDDLE, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_PILLAR_BASE, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_PILLAR_CAP, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.RIGHT_PILLAR_MIDDLE, ModBlocks.WINDOW_BLANK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL1, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL2, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL4, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL5, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL1, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL2, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL3, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL4, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL5, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW3_COL2, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW3_COL3, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DOUBLE_WINDOW_ARCH_ROW3_COL4, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL1, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL2, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL3, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL4, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL5, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL6, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL7, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL8, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL1, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL2, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL7, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL8, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL1, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL2, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL3, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL6, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL7, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL8, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW1_COL1, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW1_COL6, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL1, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL2, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL5, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL6, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL1, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL2, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL3, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL4, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL5, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL6, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL2, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL3, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL4, ModBlocks.QUARTZ_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS,ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL5, ModBlocks.QUARTZ_BRICKS);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_BLOCK, 3)
                        .define('0', Blocks.POLISHED_DIORITE)
                        .define('1', Blocks.QUARTZ_BLOCK)
                        .pattern("'   '")
                        .pattern("' 01'")
                        .pattern("'   '")
                        .unlockedBy("has_polished_diorite", this.has(Blocks.POLISHED_DIORITE))
                        .unlockedBy("has_marble_block", this.has(ModBlocks.MARBLE_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_PILLAR, 1)
                        .define('0', ModBlocks.MARBLE_BLOCK)
                        .pattern("' 0 '")
                        .pattern("' 0 '")
                        .pattern("'111'")
                        .unlockedBy("has_marble_block", this.has(ModBlocks.MARBLE_BLOCK))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_PILLAR_BASE, 1)
                        .define('0', Blocks.SMOOTH_SANDSTONE)
                        .define('1', ModBlocks.MARBLE_PILLAR)
                        .pattern("'   '")
                        .pattern("' 1 '")
                        .pattern("' 0 '")
                        .unlockedBy("has_smooth_sandstone", this.has(Blocks.SMOOTH_SANDSTONE))
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PILLAR_CAP, 1)
                        .define('0', Items.GLAZED_TERRACOTTA.lightBlue())
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_glazed_terracotta", this.has(Items.GLAZED_TERRACOTTA.lightBlue()))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.THATCH, 3)
                        .define('0', Blocks.HAY_BLOCK)
                        .pattern("'0  '")
                        .pattern("'00 '")
                        .pattern("'000'")
                        .unlockedBy("has_hay_block", this.has(Blocks.HAY_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.THATCH_PEAK, 4)
                        .define('0', Blocks.HAY_BLOCK)
                        .pattern("' 0 '")
                        .pattern("'000'")
                        .pattern("'   '")
                        .unlockedBy("has_hay_block", this.has(Blocks.HAY_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HAY_BLOCK, 1)
                        .define('0', Blocks.WHEAT)
                        .pattern("'000'")
                        .pattern("'000'")
                        .pattern("'000'")
                        .unlockedBy("has_wheat", this.has(Blocks.WHEAT))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICKS, 4)
                        .define('0', Blocks.QUARTZ_BLOCK)
                        .pattern("'00 '")
                        .pattern("'00 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_blocks", this.has(Blocks.QUARTZ_BLOCK))
                        .save(this.output);
                //::new block here
            }
        };
    }

    public String getName() {
        return "Architecture_blocks Recipes";
    }

}
