package com.misadivision.mcmoddevaddblock.registry;

import com.misadivision.mcmoddevaddblock.McModDevAddBlock;
import com.misadivision.mcmoddevaddblock.block.basic.BasicBlockDefinitions;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(McModDevAddBlock.MOD_ID);

    public static final DeferredBlock<Block> RUBY_BLOCK = BLOCKS.register(
            BasicBlockDefinitions.RUBY_BLOCK_ID,
            BasicBlockDefinitions::createRubyBlock
    );

    private ModBlocks() {
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
