package com.misadivision.mcmoddevaddblock.block.basic;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public final class BasicBlockDefinitions {
    public static final String RUBY_BLOCK_ID = "ruby_block";
    public static final String GLOWING_QUARTZ_SLAB_ID = "glowing_quartz_slab";

    private BasicBlockDefinitions() {
    }

    public static Block createRubyBlock() {
        return new Block(BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_RED)
                .strength(5.0F, 6.0F)
                .requiresCorrectToolForDrops()
                .sound(SoundType.METAL));
    }

    public static SlabBlock createGlowingQuartzSlab() {
        return new SlabBlock(BlockBehaviour.Properties.of()
                .mapColor(MapColor.QUARTZ)
                .strength(0.8F)
                .requiresCorrectToolForDrops()
                .sound(SoundType.STONE)
                .lightLevel(state -> 12));
    }
}
