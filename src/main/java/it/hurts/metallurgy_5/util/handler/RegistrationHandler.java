package it.hurts.metallurgy_5.util.handler;

import it.hurts.metallurgy_5.block.ModBlocks;
import it.hurts.metallurgy_5.fluid.ModFluids;
import it.hurts.metallurgy_5.item.ModItems;
import it.hurts.metallurgy_5.item.armor.ModArmors;
import it.hurts.metallurgy_5.item.tool.ModTools;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 21/11/2018 / 01:39
 * Class: RegistrationHandler
 * Project: Metallurgy_5
 * Copyright - � - Davoleo - 2018
 **************************************************/

@Mod.EventBusSubscriber
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ModItems.register(event.getRegistry());
        ModBlocks.registerItemBlocks(event.getRegistry());
        ModArmors.register(event.getRegistry());
        ModTools.register(event.getRegistry());
        ModFluids.registerFluids();
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        ModBlocks.register(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModItems.registerModels();
        ModBlocks.registerModels();
        ModArmors.registerModels();
        ModTools.registerModels();
    }

}