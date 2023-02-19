package com.gboy800.glowslime_mod.core.init;

import com.gboy800.glowslime_mod.GlowslimeMod;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            GlowslimeMod.MOD_ID);

    public static final RegistryObject<Block> GLOWSLIME_BLOCK = BLOCKS.register("glowslime_block",
            () -> new SlimeBlock(AbstractBlock.Properties.of(Material.CLAY, MaterialColor.COLOR_LIGHT_BLUE)
                    .friction(0.8f)
                    .sound(SoundType.SLIME_BLOCK)
                    .lightLevel((p_235464_0_) -> {
                        return 15;
                    })
                    .noOcclusion()));
}
