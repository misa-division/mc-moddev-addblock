package com.misadivision.mcmoddevaddblock.registry;

import com.misadivision.mcmoddevaddblock.McModDevAddBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(McModDevAddBlock.MOD_ID);

    public static final DeferredItem<BlockItem> RUBY_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(
            ModBlocks.RUBY_BLOCK.getId().getPath(),
            ModBlocks.RUBY_BLOCK,
            new Item.Properties()
    );

    public static final DeferredItem<BlockItem> GLOWING_QUARTZ_SLAB_ITEM = ITEMS.registerSimpleBlockItem(
            ModBlocks.GLOWING_QUARTZ_SLAB.getId().getPath(),
            ModBlocks.GLOWING_QUARTZ_SLAB,
            new Item.Properties()
    );

    private ModItems() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
