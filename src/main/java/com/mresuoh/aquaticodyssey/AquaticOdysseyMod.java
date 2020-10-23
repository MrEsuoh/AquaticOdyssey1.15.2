package com.mresuoh.aquaticodyssey;

import com.mresuoh.aquaticodyssey.init.BlockInit;
import com.mresuoh.aquaticodyssey.init.ItemInit;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("aquaticodyssey")
@Mod.EventBusSubscriber(modid = AquaticOdysseyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AquaticOdysseyMod
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final  String MOD_ID = "aquaticodyssey";
    public static AquaticOdysseyMod instance;

    public AquaticOdysseyMod() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    public static class AOItemGroup extends ItemGroup {
        public static final AOItemGroup instance = new AOItemGroup(ItemGroup.GROUPS.length, "aquaticodysseytab");
        private AOItemGroup(int length, String aquaticodyssey)
        {
            super("aquaticodysseytab");
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.KELP_SHAKE.get());
        }
    }

}
