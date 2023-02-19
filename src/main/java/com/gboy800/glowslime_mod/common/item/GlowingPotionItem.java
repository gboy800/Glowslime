package com.gboy800.glowslime_mod.common.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import static net.minecraft.potion.Effects.GLOWING;

public class GlowingPotionItem extends Item {

    public GlowingPotionItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        EffectInstance effect = playerIn.getEffect(GLOWING);
        if (effect != null) {
            int amplifier = effect.getAmplifier();
        }
        return super.use(worldIn, playerIn, handIn);
    }
}
