package com.mresuoh.aquaticodyssey.entity.model;// Made with Blockbench 3.7.1
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mresuoh.aquaticodyssey.entities.DragonGobyEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class DragonGobyModel<T extends DragonGobyEntity> extends EntityModel<T> {
	private final ModelRenderer Head;
	private final ModelRenderer ArmFinL_r1;
	private final ModelRenderer ArmFinR_r1;
	private final ModelRenderer Torso_r1;
	private final ModelRenderer Torso;
	private final ModelRenderer DorsalFin1;
	private final ModelRenderer TorsoTailBodyTransition;
	private final ModelRenderer TorsoTailEnd;
	private final ModelRenderer TailFin;
	private final ModelRenderer DorsalFin2;
	private final ModelRenderer ArmFinR;
	private final ModelRenderer ArmFinL;

	public DragonGobyModel() {
		textureWidth = 64;
		textureHeight = 32;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 24.0F, -6.4F);
		Head.setTextureOffset(0, 1).addBox(-2.0F, -2.7F, -5.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);

		ArmFinL_r1 = new ModelRenderer(this);
		ArmFinL_r1.setRotationPoint(0.0F, -1.0F, 1.0F);
		Head.addChild(ArmFinL_r1);
		setRotationAngle(ArmFinL_r1, 0.7285F, 0.0F, 1.5708F);
		

		ArmFinR_r1 = new ModelRenderer(this);
		ArmFinR_r1.setRotationPoint(0.0F, -1.0F, 1.0F);
		Head.addChild(ArmFinR_r1);
		setRotationAngle(ArmFinR_r1, -0.7285F, 0.0F, 1.5708F);
		

		Torso_r1 = new ModelRenderer(this);
		Torso_r1.setRotationPoint(0.0F, -1.2F, 0.0F);
		Head.addChild(Torso_r1);
		setRotationAngle(Torso_r1, 0.0F, 0.0F, 1.5708F);
		

		Torso = new ModelRenderer(this);
		Torso.setRotationPoint(0.0F, -1.2F, 0.0F);
		Head.addChild(Torso);
		setRotationAngle(Torso, 0.0F, 0.0F, 1.5708F);
		Torso.setTextureOffset(28, 0).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, true);

		DorsalFin1 = new ModelRenderer(this);
		DorsalFin1.setRotationPoint(-0.8F, 0.0F, 0.0F);
		Torso.addChild(DorsalFin1);
		DorsalFin1.setTextureOffset(0, 11).addBox(-1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 8.0F, 0.0F, true);

		TorsoTailBodyTransition = new ModelRenderer(this);
		TorsoTailBodyTransition.setRotationPoint(0.0F, 0.0F, 8.0F);
		Torso.addChild(TorsoTailBodyTransition);
		TorsoTailBodyTransition.setTextureOffset(28, 0).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, true);

		TorsoTailEnd = new ModelRenderer(this);
		TorsoTailEnd.setRotationPoint(0.0F, 0.2F, 7.4F);
		TorsoTailBodyTransition.addChild(TorsoTailEnd);
		TorsoTailEnd.setTextureOffset(43, 4).addBox(-1.05F, -1.05F, 0.0F, 2.0F, 2.0F, 7.0F, 0.0F, true);

		TailFin = new ModelRenderer(this);
		TailFin.setRotationPoint(-0.1F, 0.0F, 0.0F);
		TorsoTailEnd.addChild(TailFin);
		TailFin.setTextureOffset(4, 11).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 8.0F, 0.0F, true);

		DorsalFin2 = new ModelRenderer(this);
		DorsalFin2.setRotationPoint(-0.6F, 0.0F, -8.0F);
		TorsoTailEnd.addChild(DorsalFin2);
		DorsalFin2.setTextureOffset(0, 11).addBox(-1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 8.0F, 0.0F, true);

		ArmFinR = new ModelRenderer(this);
		ArmFinR.setRotationPoint(0.0F, -1.0F, 1.0F);
		Head.addChild(ArmFinR);
		setRotationAngle(ArmFinR, -0.7285F, 0.0F, 1.5708F);
		ArmFinR.setTextureOffset(28, 0).addBox(-1.4F, 2.0F, 0.0F, 2.0F, 0.0F, 3.0F, 0.0F, true);

		ArmFinL = new ModelRenderer(this);
		ArmFinL.setRotationPoint(0.0F, -1.0F, 1.0F);
		Head.addChild(ArmFinL);
		setRotationAngle(ArmFinL, 0.7285F, 0.0F, 1.5708F);
		ArmFinL.setTextureOffset(28, 0).addBox(-1.4F, -2.0F, 0.0F, 2.0F, 0.0F, 3.0F, 0.0F, true);
	}

	@Override
	public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public ModelRenderer getHead(){
		return Head;
	}

	public ModelRenderer getArmFinL_r1(){
		return ArmFinL_r1;
	}

	public ModelRenderer getArmFinR_r1(){
		return ArmFinR_r1;
	}

	public ModelRenderer getTorso_r1(){
		return Torso_r1;
	}

	public ModelRenderer getTorso(){
		return Torso;
	}

	public ModelRenderer getDorsalFin1(){
		return DorsalFin1;
	}

	public ModelRenderer getTorsoTailBodyTransition(){
		return TorsoTailBodyTransition;
	}

	public ModelRenderer getTorsoTailEnd(){
		return TorsoTailEnd;
	}

	public ModelRenderer getTailFin(){
		return TailFin;
	}

	public ModelRenderer getDorsalFin2(){
		return DorsalFin2;
	}

	public ModelRenderer getArmFinR(){
		return ArmFinR;
	}

	public ModelRenderer getArmFinL(){
		return ArmFinL;
	}
}