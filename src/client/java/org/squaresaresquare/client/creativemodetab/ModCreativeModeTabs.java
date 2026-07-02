package org.squaresaresquare.client.creativemodetab;

import com.mojang.serialization.Codec;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import org.squaresaresquare.Architecture_blocks;
import org.squaresaresquare.client.block.ModBlocks;

import java.util.HashMap;
import java.util.Map;

public class ModCreativeModeTabs {
    public static final DataComponentType<@NotNull Integer> MY_INT_COMPONENT = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "my_integer"),
            DataComponentType.<Integer>builder()
                    .persistent(Codec.INT) // Makes sure the integer saves to the item NBT on disk
                    .build()
    );
    // 1. Create a registration key using your Mod ID
    public static final ResourceKey<@NotNull CreativeModeTab> ARCHITECTURE_BLOCK_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "architecture_block_tab")
    );
    public static final ResourceKey<@NotNull CreativeModeTab> DOUBLE_ARCHED_WINDOW_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "double_arched_window_tab")
    );
    public static final ResourceKey<@NotNull CreativeModeTab> TRIPLE_ARCHED_WINDOW_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "triple_arched_window_tab")
    );

    public static final ResourceKey<@NotNull CreativeModeTab> FOUR_ARCHED_WINDOW_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "four_arched_window_tab")
    );

    public static final CreativeModeTab ARCHITECTURE_BLOCK_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            ARCHITECTURE_BLOCK_TAB_KEY,
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MARBLE_PLINTH_BLOCK))
                    .title(Component.translatable("itemGroup." + Architecture_blocks.MOD_ID + ".architecture_block_tab"))
                    .displayItems((displayContext, output) -> {
                        output.accept(ModBlocks.MARBLE_PLINTH_BLOCK);
                        output.accept(ModBlocks.INVISIBLE);
                        output.accept(ModBlocks.MARBLE_BLOCK);
                        output.accept(ModBlocks.MARBLE_PILLAR);
                        output.accept(ModBlocks.OAK_LOG_BLOCK);
                        output.accept(ModBlocks.MARBLE_PILLAR_BASE);
                        output.accept(ModBlocks.PILLAR_CAP);
                        output.accept(ModBlocks.THATCH);
                        output.accept(ModBlocks.THATCH_PEAK);
                        output.accept(ModBlocks.HAY_BLOCK);
                        output.accept(ModBlocks.QUARTZ_BRICKS);
                        //::new architecture_block here
                    }).build());

    public static final CreativeModeTab DOUBLE_ARCHED_WINDOW_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            DOUBLE_ARCHED_WINDOW_TAB_KEY,
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable("itemGroup.architecture_blocks.double_arched_window_blocks_tab"))
            .icon(() -> new ItemStack(ModBlocks.DOUBLE_ARCHED_WINDOW_COMPLETE))
            .displayItems((displayContext, entries) -> {
                // create a grid of where I want to put items
                Map<Integer, Block> TabLayout = new HashMap<>();
                // create a grid of where I want to put items
                //TabLayout.put(1, ModBlocks.double_window_arch_row1_col1);
                //row1
                TabLayout.put(3, ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL1);
                TabLayout.put(4, ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL2);
                TabLayout.put(5, ModBlocks.INNER_ARCH_BLOCK);
                TabLayout.put(6, ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL4);
                TabLayout.put(7, ModBlocks.DOUBLE_WINDOW_ARCH_ROW1_COL5);
                //row2
                TabLayout.put(12, ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL1);
                TabLayout.put(13, ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL2);
                TabLayout.put(14, ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL3);
                TabLayout.put(15, ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL4);
                TabLayout.put(16, ModBlocks.DOUBLE_WINDOW_ARCH_ROW2_COL5);

                //row3
                TabLayout.put(21, ModBlocks.QUARTZ_BRICKS);
                TabLayout.put(20, ModBlocks.DOUBLE_WINDOW_ARCH_ROW3_COL2);
                TabLayout.put(21, ModBlocks.QUARTZ_BRICKS);
                TabLayout.put(20, ModBlocks.DOUBLE_ARCHED_WINDOW_6_4);
                TabLayout.put(21, ModBlocks.QUARTZ_BRICKS);


                int maxSlot = TabLayout.keySet().stream().max(Integer::compare).orElse(0);
                for (int slotIndex = 0; slotIndex <= maxSlot; slotIndex++) {
                    ItemStack stack = TabLayout.containsKey(slotIndex)
                            ? new ItemStack(TabLayout.get(slotIndex))
                            : new ItemStack(ModBlocks.INVISIBLE);

                    stack.set(MY_INT_COMPONENT, slotIndex);
                    entries.accept(stack);
                }
            }).build());

    public static final CreativeModeTab TRIPLE_WINDOWS_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            TRIPLE_ARCHED_WINDOW_TAB_KEY,
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable("itemGroup.architecture_blocks.triple_arched_window_blocks_tab"))
            .icon(() -> new ItemStack(ModBlocks.TRIPLE_WIND0W_COMPLETE))
            .displayItems((displayContext, entries) -> {
                // create a grid of where I want to put items
                Map<Integer, Block> TabLayout = new HashMap<>();
                //row 1 (0-8)
                TabLayout.put(2, ModBlocks.TRIPLE_WINDOW_5_0);     // Row 1, Slot 3
                TabLayout.put(3, ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL2);     // Row 1, Slot 4
                TabLayout.put(4, ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL3);     // Row 1, Slot 5
                TabLayout.put(5, ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL4);     // Row 1, Slot 6
                TabLayout.put(6, ModBlocks.TRIPLE_WINDOW_ARCH_ROW5_COL5);     // Row 1, Slot 7
                TabLayout.put(7, ModBlocks.TRIPLE_WINDOW_5_5);      // Row 1, Slot 8
                //row 2 (9-17)
                TabLayout.put(11, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL1);     // Row 1, Slot 3
                TabLayout.put(12, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL2);     // Row 1, Slot 4
                TabLayout.put(13, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL3);     // Row 1, Slot 5
                TabLayout.put(14, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL4);     // Row 1, Slot 6
                TabLayout.put(15, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL5);     // Row 1, Slot 7
                TabLayout.put(16, ModBlocks.TRIPLE_WINDOW_ARCH_ROW4_COL6);      // Row 1, Slot 8
                //row 2 (18-26)
                TabLayout.put(20, ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL1);
                TabLayout.put(21, ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL2);
                TabLayout.put(22, ModBlocks.TRIPLE_WINDOW_3_2);
                TabLayout.put(23, ModBlocks.TRIPLE_WINDOW_3_3);
                TabLayout.put(24, ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL5);
                TabLayout.put(25, ModBlocks.TRIPLE_WINDOW_ARCH_ROW2_COL6);
                //row 3 (27-35)
                TabLayout.put(29, ModBlocks.TRIPLE_WINDOW_ARCH_ROW1_COL1);
                TabLayout.put(30, ModBlocks.LEFT_END_CAP);
                TabLayout.put(31, ModBlocks.LEFT_PILLAR_CAP);
                TabLayout.put(32, ModBlocks.RIGHT_PILLAR_CAP);
                TabLayout.put(33, ModBlocks.RIGHT_END_CAP);
                TabLayout.put(34, ModBlocks.TRIPLE_WINDOW_ARCH_ROW1_COL6);
                //row 4 (36-44)
                TabLayout.put(38, ModBlocks.QUARTZ_BRICKS);
                TabLayout.put(39, ModBlocks.LEFT_END_MIDDLE);
                TabLayout.put(40, ModBlocks.LEFT_PILLAR_MIDDLE);
                TabLayout.put(41, ModBlocks.RIGHT_PILLAR_MIDDLE);
                TabLayout.put(42, ModBlocks.RIGHT_END_MIDDLE);
                TabLayout.put(43, ModBlocks.QUARTZ_BRICKS);
                //row 5 (45-53)
                TabLayout.put(47, ModBlocks.QUARTZ_BRICKS);
                TabLayout.put(48, ModBlocks.LEFT_END_BASE);
                TabLayout.put(49, ModBlocks.LEFT_PILLAR_BASE);
                TabLayout.put(50, ModBlocks.RIGHT_PILLAR_BASE);
                TabLayout.put(51, ModBlocks.RIGHT_END_BASE);
                TabLayout.put(52, ModBlocks.QUARTZ_BRICKS);

                // 2. Find the highest slot index used to determine where to stop the loop
                int maxSlot = TabLayout.keySet().stream().max(Integer::compare).orElse(0);
                for (int slotIndex = 0; slotIndex <= maxSlot; slotIndex++) {
                    ItemStack stack = TabLayout.containsKey(slotIndex)
                            ? new ItemStack(TabLayout.get(slotIndex))
                            : new ItemStack(ModBlocks.INVISIBLE);

                    stack.set(MY_INT_COMPONENT, slotIndex);
                    entries.accept(stack);
                }
            }).build());

    public static final CreativeModeTab FOUR_ARCHED_WINDOW_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            FOUR_ARCHED_WINDOW_TAB_KEY,
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable("itemGroup.architecture_blocks.four_arched_window_blocks_tab"))
            .icon(() -> new ItemStack(ModBlocks.FOUR_ARCHED_WINDOW_COMPLETE))
            .displayItems((displayContext, entries) -> {
                // create a grid of where I want to put items
                Map<Integer, Block> TabLayout = new HashMap<>();
                // create a grid of where I want to put items
                TabLayout.put(1, ModBlocks.QUARTZ_BRICKS);
                TabLayout.put(2, ModBlocks.LEFT_END_BASE);
                TabLayout.put(3, ModBlocks.RIGHT_PILLAR_BASE);
                TabLayout.put(4, ModBlocks.RIGHT_HALF_PILLAR_BASE);
                TabLayout.put(5, ModBlocks.LEFT_HALF_PILLAR_BASE);
                TabLayout.put(6, ModBlocks.LEFT_PILLAR_BASE);
                TabLayout.put(7, ModBlocks.RIGHT_END_BASE);
                TabLayout.put(8, ModBlocks.QUARTZ_BRICKS);

                //row 2
                TabLayout.put(10, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL1);
                TabLayout.put(11, ModBlocks.LEFT_END_MIDDLE);
                TabLayout.put(12, ModBlocks.RIGHT_PILLAR_MIDDLE);
                TabLayout.put(13, ModBlocks.RIGHT_HALF_PILLAR_MIDDLE);
                TabLayout.put(14, ModBlocks.LEFT_HALF_PILLAR_MIDDLE);
                TabLayout.put(15, ModBlocks.LEFT_PILLAR_MIDDLE);
                TabLayout.put(16, ModBlocks.RIGHT_END_MIDDLE);
                TabLayout.put(17, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL8);

                //row3
                TabLayout.put(19, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL1);
                TabLayout.put(20, ModBlocks.LEFT_END_CAP);
                TabLayout.put(21, ModBlocks.RIGHT_PILLAR_CAP);
                TabLayout.put(22, ModBlocks.RIGHT_HALF_PILLAR_CAP);
                TabLayout.put(23, ModBlocks.LEFT_HALF_PILLAR_CAP);
                TabLayout.put(24, ModBlocks.LEFT_PILLAR_CAP);
                TabLayout.put(25, ModBlocks.RIGHT_END_CAP);
                TabLayout.put(26, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL8);

                //row4
                TabLayout.put(28, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL1);
                TabLayout.put(29, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL2);
                TabLayout.put(30, ModBlocks.INNER_ARCH_BLOCK);
                TabLayout.put(31, ModBlocks.INNER_ARCH_BLOCK);
                TabLayout.put(32, ModBlocks.INNER_ARCH_BLOCK);
                TabLayout.put(33, ModBlocks.INNER_ARCH_BLOCK);
                TabLayout.put(34, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL7);
                TabLayout.put(35, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW2_COL8);

                //row5
                TabLayout.put(37, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL1);
                TabLayout.put(38, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL2);
                TabLayout.put(39, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL3);
                TabLayout.put(40, ModBlocks.INNER_ARCH_BLOCK);
                TabLayout.put(41, ModBlocks.INNER_ARCH_BLOCK);
                TabLayout.put(42, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL6);
                TabLayout.put(43, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL7);
                TabLayout.put(44, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW3_COL8);

                //row6
                TabLayout.put(46, ModBlocks.QUARTZ_BRICKS);
                TabLayout.put(47, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL2);
                TabLayout.put(48, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL3);
                TabLayout.put(49, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL4);
                TabLayout.put(50, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL5);
                TabLayout.put(51, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL6);
                TabLayout.put(52, ModBlocks.QUADRUPLE_WINDOW_ARCH_ROW1_COL7);
                TabLayout.put(53, ModBlocks.QUARTZ_BRICKS);

                //row7
                TabLayout.put(18, ModBlocks.CENTER_PILLAR_BASE);
                TabLayout.put(27, ModBlocks.CENTER_PILLAR_MIDDLE);
                TabLayout.put(36, ModBlocks.CENTER_PILLAR_CAP);

                int maxSlot = TabLayout.keySet().stream().max(Integer::compare).orElse(0);
                for (int slotIndex = 0; slotIndex <= maxSlot; slotIndex++) {
                    ItemStack stack = TabLayout.containsKey(slotIndex)
                            ? new ItemStack(TabLayout.get(slotIndex))
                            : new ItemStack(ModBlocks.INVISIBLE);

                    stack.set(MY_INT_COMPONENT, slotIndex);
                    entries.accept(stack);
                }
            }).build());

    public static void registerModCreativeModeTabs() {
        Architecture_blocks.LOGGER.info("Registering Creative Mode Tabs for " + Architecture_blocks.MOD_ID);
    }
}
