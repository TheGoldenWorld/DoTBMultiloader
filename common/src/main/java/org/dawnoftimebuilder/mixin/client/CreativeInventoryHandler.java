package org.dawnoftimebuilder.mixin.client;

import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.minecraft.world.item.CreativeModeTab;
//import org.dawnoftimebuilder.HandlerClient;

@SuppressWarnings("unused")
public class CreativeInventoryHandler {
    private CreativeInventoryHandler() {}
    public static void onCreativeTabChange(CreativeModeInventoryScreen screen, CreativeModeTab tab) {
        // TODO: Reimplement
//        HandlerClient.onCreativeTabChange(screen, tab);
    }
}
