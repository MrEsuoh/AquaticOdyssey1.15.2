package com.mresuoh.aquaticodyssey.init;

import com.mresuoh.aquaticodyssey.AquaticOdysseyMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, AquaticOdysseyMod.MOD_ID);

    //Blocks
    public static final RegistryObject<BlockItem> MANGROVE_SAPLING = ITEMS.register("mangrove_sapling",
            () -> new BlockItem(BlockInit.MANGROVE_SAPLING.get(), new Item.Properties().group(AquaticOdysseyMod.AOItemGroup.instance)));

    public static final RegistryObject<BlockItem> MANGROVE_LEAVES = ITEMS.register("mangrove_leaves",
            () -> new BlockItem(BlockInit.MANGROVE_LEAVES.get(), new Item.Properties().group(AquaticOdysseyMod.AOItemGroup.instance)));

    public static final RegistryObject<BlockItem> MANGROVE_LOG = ITEMS.register("mangrove_log",
            () -> new BlockItem(BlockInit.MANGROVE_LOG.get(), new Item.Properties().group(AquaticOdysseyMod.AOItemGroup.instance)));

    public static final RegistryObject<BlockItem> MANGROVE_WOOD = ITEMS.register("mangrove_wood",
            () -> new BlockItem(BlockInit.MANGROVE_WOOD.get(), new Item.Properties().group(AquaticOdysseyMod.AOItemGroup.instance)));

    public static final RegistryObject<BlockItem> STRIPPED_MANGROVE_WOOD = ITEMS.register("stripped_mangrove_wood",
            () -> new BlockItem(BlockInit.STRIPPED_MANGROVE_WOOD.get(), new Item.Properties().group(AquaticOdysseyMod.AOItemGroup.instance)));

    public static final RegistryObject<BlockItem> STRIPPED_MANGROVE_LOG = ITEMS.register("stripped_mangrove_log",
            () -> new BlockItem(BlockInit.STRIPPED_MANGROVE_LOG.get(), new Item.Properties().group(AquaticOdysseyMod.AOItemGroup.instance)));

    public static final RegistryObject<BlockItem> MANGROVE_PLANKS = ITEMS.register("mangrove_planks",
            () -> new BlockItem(BlockInit.MANGROVE_PLANKS.get(), new Item.Properties().group(AquaticOdysseyMod.AOItemGroup.instance)));

    public static final RegistryObject<BlockItem> MANGROVE_SLAB = ITEMS.register("mangrove_slab",
            () -> new BlockItem(BlockInit.MANGROVE_SLAB.get(), new Item.Properties().group(AquaticOdysseyMod.AOItemGroup.instance)));

    public static final RegistryObject<BlockItem> MANGROVE_STAIRS = ITEMS.register("mangrove_stairs",
            () -> new BlockItem(BlockInit.MANGROVE_STAIRS.get(), new Item.Properties().group(AquaticOdysseyMod.AOItemGroup.instance)));

    public static final RegistryObject<BlockItem> MANGROVE_FENCE = ITEMS.register("mangrove_fence",
            () -> new BlockItem(BlockInit.MANGROVE_FENCE.get(), new Item.Properties().group(AquaticOdysseyMod.AOItemGroup.instance)));

    public static final RegistryObject<BlockItem> MANGROVE_FENCE_GATE = ITEMS.register("mangrove_fence_gate",
            () -> new BlockItem(BlockInit.MANGROVE_FENCE_GATE.get(), new Item.Properties().group(AquaticOdysseyMod.AOItemGroup.instance)));

    public static final RegistryObject<BlockItem> MANGROVE_BUTTON = ITEMS.register("mangrove_button",
            () -> new BlockItem(BlockInit.MANGROVE_BUTTON.get(), new Item.Properties().group(AquaticOdysseyMod.AOItemGroup.instance)));

    public static final RegistryObject<BlockItem> MANGROVE_PRESSURE_PLATE = ITEMS.register("mangrove_pressure_plate",
            () -> new BlockItem(BlockInit.MANGROVE_PRESSURE_PLATE.get(), new Item.Properties().group(AquaticOdysseyMod.AOItemGroup.instance)));

    public static final RegistryObject<BlockItem> MANGROVE_TRAPDOOR = ITEMS.register("mangrove_trapdoor",
            () -> new BlockItem(BlockInit.MANGROVE_TRAPDOOR.get(), new Item.Properties().group(AquaticOdysseyMod.AOItemGroup.instance)));

    public static final RegistryObject<BlockItem> MANGROVE_DOOR = ITEMS.register("mangrove_door",
            () -> new BlockItem(BlockInit.MANGROVE_DOOR.get(), new Item.Properties().group(AquaticOdysseyMod.AOItemGroup.instance)));

    //Food
    public static final RegistryObject<Item> KELP_SHAKE = ITEMS.register("kelp_shake",
            () -> new Item(new Item.Properties().group(AquaticOdysseyMod.AOItemGroup.instance).food(new Food.Builder().hunger(6).saturation(0.5f).build())));


}
