package com.mresuoh.aquaticodyssey.init;

import com.mresuoh.aquaticodyssey.AquaticOdysseyMod;
import com.mresuoh.aquaticodyssey.entities.DragonGobyEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, AquaticOdysseyMod.MOD_ID);

    public static final RegistryObject<EntityType<DragonGobyEntity>> DRAGON_GOBY = ENTITY_TYPES
            .register("dragon_goby", () -> EntityType.Builder.<DragonGobyEntity>create(DragonGobyEntity::new, EntityClassification.WATER_CREATURE)
                    .size(0.9f, 0.6f)
                    .build(new ResourceLocation(AquaticOdysseyMod.MOD_ID, "dragon_goby").toString()));

}
