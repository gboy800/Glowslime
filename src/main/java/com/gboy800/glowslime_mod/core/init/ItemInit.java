package com.gboy800.glowslime_mod.core.init;

import com.gboy800.glowslime_mod.GlowslimeMod;

import com.gboy800.glowslime_mod.common.item.CustomSpawnEggItem;
import com.gboy800.glowslime_mod.core.itemgroup.GlowslimeItemGroup;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GlowslimeMod.MOD_ID);

    public static final RegistryObject<Item> GLOWING_SLIMEBALL = ITEMS.register("glowing_slimeball",
            () -> new Item(new Item.Properties().tab(GlowslimeItemGroup.GLOWSLIME_ITEM_GROUP)));

    public static final RegistryObject<CustomSpawnEggItem> GLOWSLIME_SPAWN_EGG = ITEMS.register("glowslime_spawn_egg",
            () -> new CustomSpawnEggItem(EntityInit.GLOWSLIME, 0x02B4D4, 0x048BA4, new Item.Properties().tab(GlowslimeItemGroup.GLOWSLIME_ITEM_GROUP)));
}


