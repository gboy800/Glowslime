package com.gboy800.glowslime_mod.core.init;

import com.gboy800.glowslime_mod.GlowslimeMod;
import com.gboy800.glowslime_mod.common.entity.Glowslime;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = GlowslimeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityInit {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
            GlowslimeMod.MOD_ID);

    public static final RegistryObject<EntityType<Glowslime>> GLOWSLIME = ENTITY_TYPES.register("glowslime",
            () -> EntityType.Builder.of(Glowslime::new, EntityClassification.MONSTER)
                    .setShouldReceiveVelocityUpdates(true)
                    .setUpdateInterval(5)
                    .setTrackingRange(64)
                    .sized(2.04F, 2.04F)
                    .build(new ResourceLocation(GlowslimeMod.MOD_ID, "glowslime").toString()));

    @SubscribeEvent
    public static void registerEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(GLOWSLIME.get(), Glowslime.setAttributes().build());
    }

}
