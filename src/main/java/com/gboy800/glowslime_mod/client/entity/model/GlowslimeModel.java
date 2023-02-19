package com.gboy800.glowslime_mod.client.entity.model;
// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.entity.LivingEntity;

public class GlowslimeModel<T extends LivingEntity> extends EntityModel<T> {
    private final ModelRenderer bb_main;

    public GlowslimeModel() {
        texWidth = 64;
        texHeight = 32;

        bb_main = new ModelRenderer(this);
        bb_main.setPos(0.0F, 24.0F, 0.0F);
        bb_main.texOffs(0, 0).addBox(-8.0F, -8.0F, 0.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        bb_main.texOffs(0, 16).addBox(-7.0F, -7.0F, 1.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
        bb_main.texOffs(32, 0).addBox(-2.75F, -6.0F, 0.75F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        bb_main.texOffs(32, 4).addBox(-7.25F, -6.0F, 0.75F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        bb_main.texOffs(32, 8).addBox(-4.0F, -3.0F, 0.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {

    }


    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    @Override
    public void renderToBuffer(MatrixStack p_225598_1_, IVertexBuilder p_225598_2_, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {

    }
}