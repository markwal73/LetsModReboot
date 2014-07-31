package com.markwal.mcmod.letsmodreboot.handler;

import com.markwal.mcmod.letsmodreboot.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by mark on 6/30/14.
 */
public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {

        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }


    }

    private static void loadConfiguration() {
        // Load config settings
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL,false, "This is an example configuration value");

        if (configuration.hasChanged()) {
            // Save config settings
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            loadConfiguration();
        }
    }
}
