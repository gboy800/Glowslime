package com.gboy800.glowslime_mod.client.renderer.entity.layers;

import com.gboy800.glowslime_mod.client.entity.model.GlowslimeModel;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.layers.AbstractEyesLayer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.SlimeModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GlowslimeCoreLayer<T extends LivingEntity> extends AbstractEyesLayer<T, SlimeModel<T>> {

    private static final RenderType GLOWSLIME_CORE = RenderType.eyes(new ResourceLocation("textures/entity/glowslime/glowslime_core.png"));

    public GlowslimeCoreLayer(IEntityRenderer<T, SlimeModel<T>> p_i50939_1_) {
        super(p_i50939_1_);
    }

    public RenderType renderType() {
        return GLOWSLIME_CORE;
    }

}
