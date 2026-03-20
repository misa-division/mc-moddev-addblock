package com.misadivision.mcmoddevaddblock;

import com.misadivision.mcmoddevaddblock.registry.ModBlocks;
import com.misadivision.mcmoddevaddblock.registry.ModCreativeTabs;
import com.misadivision.mcmoddevaddblock.registry.ModItems;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(McModDevAddBlock.MOD_ID)
public final class McModDevAddBlock {
    public static final String MOD_ID = "mcmoddevaddblock";
    public static final Logger LOGGER = LogUtils.getLogger();

    public McModDevAddBlock(IEventBus modEventBus, ModContainer modContainer) {
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);

        LOGGER.info("Loaded mod {}", MOD_ID);
    }
}
