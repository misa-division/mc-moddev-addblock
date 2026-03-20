package com.misadivision.mcmoddevaddblock.block.basic;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public final class BasicBlockDefinitions {
    public static final String RUBY_BLOCK_ID = "ruby_block";

    private BasicBlockDefinitions() {
    }

    public static Block createRubyBlock() {
        return new Block(BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_RED)
                .strength(5.0F, 6.0F)
                .requiresCorrectToolForDrops()
                .sound(SoundType.METAL));
    }
}
