package com.gboy800.glowslime_mod;

import com.gboy800.glowslime_mod.common.item.CustomSpawnEggItem;
import com.gboy800.glowslime_mod.core.init.BlockInit;
import com.gboy800.glowslime_mod.core.init.EntityInit;
import com.gboy800.glowslime_mod.core.init.ItemInit;
import com.gboy800.glowslime_mod.core.init.PotionInit;
import com.gboy800.glowslime_mod.core.itemgroup.GlowslimeItemGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("glowslime_mod")
@Mod.EventBusSubscriber(modid = GlowslimeMod.MOD_ID, bus = Bus.MOD)
public class GlowslimeMod {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "glowslime_mod";

    public GlowslimeMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        EntityInit.ENTITY_TYPES.register(bus);
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        PotionInit.POTIONS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }



    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            event.getRegistry().register(new BlockItem(block, new Item.Properties()
                    .tab(GlowslimeItemGroup.GLOWSLIME_ITEM_GROUP))
                    .setRegistryName(block.getRegistryName()));
        });
    }

    @SubscribeEvent
    public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
        CustomSpawnEggItem.initSpawnEgg();
    }

    @SubscribeEvent
    public static void onRegisterPotions(final RegistryEvent.Register<Potion> event) {
        System.out.println("Setting Up Stuff!");
        PotionInit.AddPotionRecipes();
        System.out.println("Potion Recipes Called!");
    }
}

