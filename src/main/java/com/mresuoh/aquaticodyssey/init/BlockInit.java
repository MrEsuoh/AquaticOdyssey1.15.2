package com.mresuoh.aquaticodyssey.init;

import com.mresuoh.aquaticodyssey.AquaticOdysseyMod;
import com.mresuoh.aquaticodyssey.objects.blocks.MangroveButtonBlock;
import com.mresuoh.aquaticodyssey.objects.blocks.MangroveDoorBlock;
import com.mresuoh.aquaticodyssey.objects.blocks.MangrovePressurePlateBlock;
import com.mresuoh.aquaticodyssey.objects.blocks.MangroveTrapDoorBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, AquaticOdysseyMod.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> MANGROVE_SAPLING = BLOCKS.register("mangrove_sapling",
            () -> new Block(Block.Properties.from(Blocks.OAK_SAPLING).sound(SoundType.PLANT)));

    public static final RegistryObject<Block> MANGROVE_LEAVES = BLOCKS.register("mangrove_leaves",
            () -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES).sound(SoundType.PLANT)));

    public static final RegistryObject<Block> MANGROVE_LOG = BLOCKS.register("mangrove_log",
            () -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> MANGROVE_WOOD = BLOCKS.register("mangrove_wood",
            () -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_MANGROVE_WOOD = BLOCKS.register("stripped_mangrove_wood",
            () -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG = BLOCKS.register("stripped_mangrove_log",
            () -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> MANGROVE_PLANKS = BLOCKS.register("mangrove_planks",
            () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> MANGROVE_SLAB = BLOCKS.register("mangrove_slab",
            () -> new SlabBlock(Block.Properties.from(Blocks.OAK_SLAB)));

    public static final RegistryObject<Block> MANGROVE_STAIRS = BLOCKS.register("mangrove_stairs",
            () -> new StairsBlock(() -> BlockInit.MANGROVE_PLANKS.get().getDefaultState(), Block.Properties.from(Blocks.OAK_STAIRS)));

    public static final RegistryObject<Block> MANGROVE_FENCE = BLOCKS.register("mangrove_fence",
            () -> new FenceBlock(Block.Properties.from(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> MANGROVE_FENCE_GATE = BLOCKS.register("mangrove_fence_gate",
            () -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));

    public static final RegistryObject<Block> MANGROVE_BUTTON = BLOCKS.register("mangrove_button",
            () -> new MangroveButtonBlock(Block.Properties.from(Blocks.OAK_BUTTON)));

    public static final RegistryObject<Block> MANGROVE_PRESSURE_PLATE = BLOCKS.register("mangrove_pressure_plate",
            () -> new MangrovePressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.from(Blocks.OAK_PRESSURE_PLATE)));

    public static final RegistryObject<Block> MANGROVE_TRAPDOOR = BLOCKS.register("mangrove_trapdoor",
            () -> new MangroveTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> MANGROVE_DOOR = BLOCKS.register("mangrove_door",
            () -> new MangroveDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));
}
