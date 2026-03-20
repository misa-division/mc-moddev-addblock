package com.misadivision.mcmoddevaddblock.block.basic;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public final class BasicBlockDefinitions {
    public static final String SMOOTH_GLOWING_QUARTZ_SLAB_ID = "smooth_glowing_quartz_slab";

    private BasicBlockDefinitions() {
    }

    public static SlabBlock createSmoothGlowingQuartzSlab() {
        return new SlabBlock(BlockBehaviour.Properties.of()
                .mapColor(MapColor.QUARTZ)
                .strength(0.8F)
                .requiresCorrectToolForDrops()
                .sound(SoundType.STONE)
                .lightLevel(state -> 15));
    }
}
