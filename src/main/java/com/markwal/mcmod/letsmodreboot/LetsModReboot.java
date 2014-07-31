package com.markwal.mcmod.letsmodreboot;

import com.markwal.mcmod.letsmodreboot.handler.ConfigurationHandler;
import com.markwal.mcmod.letsmodreboot.init.ModItems;
import com.markwal.mcmod.letsmodreboot.proxy.IProxy;
import com.markwal.mcmod.letsmodreboot.reference.Reference;
import com.markwal.mcmod.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot {

    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void  preInit(FMLPreInitializationEvent event) {
        // init items, blocks, load configuration

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // recipes, tile entities, gui, event handlers
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // things to be done after other mod initialized
        LogHelper.info("Post Initialization Complete!");
    }
}
