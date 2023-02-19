package com.gboy800.glowslime_mod.common.events;

import com.gboy800.glowslime_mod.GlowslimeMod;
import com.gboy800.glowslime_mod.core.init.EntityInit;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.common.world.MobSpawnInfoBuilder;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GlowslimeMod.MOD_ID)
public class EntityEvents {
    @SubscribeEvent
    public static void onBiomeLoad(final BiomeLoadingEvent event) {
        if (event.getName() == null) {
            return;
        }
        MobSpawnInfoBuilder spawns = event.getSpawns();
        spawns.addSpawn(EntityClassification.MONSTER,
                new MobSpawnInfo.Spawners(EntityInit.GLOWSLIME.get(), 2, 1, 3));

    }

}
