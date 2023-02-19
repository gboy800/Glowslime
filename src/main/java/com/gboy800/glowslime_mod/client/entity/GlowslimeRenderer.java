package com.gboy800.glowslime_mod.client.entity;

import com.gboy800.glowslime_mod.GlowslimeMod;
import com.gboy800.glowslime_mod.client.renderer.entity.layers.GlowslimeCoreLayer;
import com.gboy800.glowslime_mod.common.entity.Glowslime;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.SlimeGelLayer;
import net.minecraft.client.renderer.entity.model.SlimeModel;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class GlowslimeRenderer extends MobRenderer<Glowslime, SlimeModel<Glowslime>> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(GlowslimeMod.MOD_ID, "textures/entity/glowslime/glowslime.png");

    public GlowslimeRenderer(EntityRendererManager manager) {
        super(manager, new SlimeModel<>(16), 0.7f);
        this.addLayer(new GlowslimeCoreLayer<>(this));
        this.addLayer(new SlimeGelLayer<>(this));
    }



    @Override
    public void render(Glowslime entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        this.shadowRadius = 0.25F * (float)entityIn.getSize();
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
    }

    @Override
    protected void scale(Glowslime entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        float f = 0.999F;
        matrixStackIn.scale(f, f, f);
        matrixStackIn.translate(0.0D, (double)0.001F, 0.0D);
        float f1 = (float)entitylivingbaseIn.getSize();
        float f2 = MathHelper.lerp(partialTickTime, entitylivingbaseIn.oSquish, entitylivingbaseIn.squish) / (f1 * 0.5F + 1.0F);
        float f3 = 1.0F / (f2 + 1.0F);
        matrixStackIn.scale(f3 * f1, 1.0F / f3 * f1, f3 * f1);
    }

    @Override
    public ResourceLocation getTextureLocation(Glowslime entity) {
        return TEXTURE;
    }

}