package com.gboy800.glowslime_mod.core.init;

import com.gboy800.glowslime_mod.GlowslimeMod;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.gboy800.glowslime_mod.core.init.ItemInit.GLOWING_SLIMEBALL;
import static net.minecraft.potion.Effects.GLOWING;

public class PotionInit {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister
            .create(ForgeRegistries.POTION_TYPES, GlowslimeMod.MOD_ID);

    public static final RegistryObject<Potion> GLOWING_POTION = POTIONS.register("glowing_potion",
            () -> new Potion(new EffectInstance(GLOWING, 1200)));

    public static final RegistryObject<Potion> LONG_GLOWING_POTION = POTIONS.register("long_glowing_potion",
            () -> new Potion(new EffectInstance(GLOWING, 2400)));

    public static void AddPotionRecipes() {
        BrewingRecipeRegistry.addRecipe(
                Ingredient.of(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.AWKWARD)),
                Ingredient.of(GLOWING_SLIMEBALL.get()),
                PotionUtils.setPotion(new ItemStack(Items.POTION), GLOWING_POTION.get()));
        BrewingRecipeRegistry.addRecipe(
                Ingredient.of(PotionUtils.setPotion(new ItemStack(Items.POTION), GLOWING_POTION.get())),
                Ingredient.of(Items.REDSTONE),
                PotionUtils.setPotion(new ItemStack(Items.POTION), LONG_GLOWING_POTION.get()));
    }

}
