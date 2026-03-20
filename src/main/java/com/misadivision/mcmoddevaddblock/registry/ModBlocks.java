package com.misadivision.mcmoddevaddblock.registry;

import com.misadivision.mcmoddevaddblock.McModDevAddBlock;
import com.misadivision.mcmoddevaddblock.block.basic.BasicBlockDefinitions;
import net.minecraft.world.level.block.SlabBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(McModDevAddBlock.MOD_ID);

    public static final DeferredBlock<SlabBlock> SMOOTH_GLOWING_QUARTZ_SLAB = BLOCKS.register(
            BasicBlockDefinitions.SMOOTH_GLOWING_QUARTZ_SLAB_ID,
            BasicBlockDefinitions::createSmoothGlowingQuartzSlab
    );

    private ModBlocks() {
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
