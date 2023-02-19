package com.gboy800.glowslime_mod.core.util;

import com.gboy800.glowslime_mod.GlowslimeMod;
import com.gboy800.glowslime_mod.client.entity.GlowslimeRenderer;
import com.gboy800.glowslime_mod.core.init.EntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = GlowslimeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
            RenderingRegistry.registerEntityRenderingHandler(EntityInit.GLOWSLIME.get(), GlowslimeRenderer::new);
    }
}
