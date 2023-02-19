package com.gboy800.glowslime_mod.core.itemgroup;

import com.gboy800.glowslime_mod.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GlowslimeItemGroup extends ItemGroup {

    public static final GlowslimeItemGroup GLOWSLIME_ITEM_GROUP = new GlowslimeItemGroup(ItemGroup.TABS.length, "glowslime_mod");

    public GlowslimeItemGroup(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemInit.GLOWING_SLIMEBALL.get());
    }
}
