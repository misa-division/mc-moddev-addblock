package com.misadivision.mcmoddevaddblock.registry;

import com.misadivision.mcmoddevaddblock.McModDevAddBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(McModDevAddBlock.MOD_ID);

    public static final DeferredItem<BlockItem> SMOOTH_GLOWING_QUARTZ_SLAB_ITEM = ITEMS.registerSimpleBlockItem(
            ModBlocks.SMOOTH_GLOWING_QUARTZ_SLAB.getId().getPath(),
            ModBlocks.SMOOTH_GLOWING_QUARTZ_SLAB,
            new Item.Properties()
    );

    private ModItems() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
