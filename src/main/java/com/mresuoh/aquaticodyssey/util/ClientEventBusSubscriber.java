package com.mresuoh.aquaticodyssey.util;

import com.mresuoh.aquaticodyssey.AquaticOdysseyMod;
import com.mresuoh.aquaticodyssey.entity.render.DragonGobyRender;
import com.mresuoh.aquaticodyssey.init.BlockInit;
import com.mresuoh.aquaticodyssey.init.ModEntityTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = AquaticOdysseyMod.MOD_ID)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockInit.MANGROVE_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.MANGROVE_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.MANGROVE_SAPLING.get(), RenderType.getCutout());
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.DRAGON_GOBY.get(), DragonGobyRender::new);
    }
}

