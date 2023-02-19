package com.gboy800.glowslime_mod.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.SlimeEntity;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biomes;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class Glowslime extends SlimeEntity {

    public Glowslime(EntityType<? extends SlimeEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected boolean spawnCustomParticles() {
        return true;
    }

    public static boolean checkSlimeSpawnRules(EntityType<SlimeEntity> p_223366_0_, IWorld p_223366_1_, SpawnReason p_223366_2_, BlockPos p_223366_3_, Random p_223366_4_) {
        if (p_223366_1_.getDifficulty() != Difficulty.PEACEFUL) {
            if (Objects.equals(p_223366_1_.getBiomeName(p_223366_3_), Optional.of(Biomes.SWAMP)) && p_223366_3_.getY() > 50 && p_223366_3_.getY() < 70 && p_223366_4_.nextFloat() < 0.5F && p_223366_4_.nextFloat() < p_223366_1_.getMoonBrightness() && p_223366_1_.getMaxLocalRawBrightness(p_223366_3_) <= p_223366_4_.nextInt(8)) {
                return checkMobSpawnRules(p_223366_0_, p_223366_1_, p_223366_2_, p_223366_3_, p_223366_4_);
            }

            if (!(p_223366_1_ instanceof ISeedReader)) {
                return false;
            }

            ChunkPos chunkpos = new ChunkPos(p_223366_3_);
            boolean flag = SharedSeedRandom.seedSlimeChunk(chunkpos.x, chunkpos.z, ((ISeedReader)p_223366_1_).getSeed(), 987234911L).nextInt(10) == 0;
            if (p_223366_4_.nextInt(10) == 0 && flag && p_223366_3_.getY() < 40) {
                return checkMobSpawnRules(p_223366_0_, p_223366_1_, p_223366_2_, p_223366_3_, p_223366_4_);
            }
        }
        return false;
    }

    public static AttributeModifierMap.MutableAttribute setAttributes() {
        return MonsterEntity.createMonsterAttributes();
    }
    
    //TODO: Make this mob included in advancements
}
