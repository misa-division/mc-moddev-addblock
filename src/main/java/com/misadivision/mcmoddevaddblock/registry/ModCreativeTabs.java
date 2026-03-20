package com.misadivision.mcmoddevaddblock.registry;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

public final class ModCreativeTabs {
    private ModCreativeTabs() {
    }

    public static void register(IEventBus eventBus) {
        eventBus.addListener(ModCreativeTabs::addCreative);
    }

    private static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModItems.SMOOTH_GLOWING_QUARTZ_SLAB_ITEM);
        }
    }
}
