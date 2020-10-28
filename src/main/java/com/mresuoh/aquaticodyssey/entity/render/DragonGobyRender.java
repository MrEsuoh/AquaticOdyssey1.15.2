package com.mresuoh.aquaticodyssey.entity.render;

import com.mresuoh.aquaticodyssey.AquaticOdysseyMod;
import com.mresuoh.aquaticodyssey.entities.DragonGobyEntity;
import com.mresuoh.aquaticodyssey.entity.model.DragonGobyModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DragonGobyRender extends MobRenderer<DragonGobyEntity, DragonGobyModel<DragonGobyEntity>> {
    protected static final ResourceLocation TEXTURE = new ResourceLocation(AquaticOdysseyMod.MOD_ID,
            "textures/entity/dragon_goby.png");

    public DragonGobyRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DragonGobyModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(DragonGobyEntity entity) {
        return TEXTURE;
    }

}
