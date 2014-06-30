package com.markwal.mcmod.letsmodreboot;

import com.markwal.mcmod.letsmodreboot.proxy.IProxy;
import com.markwal.mcmod.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class LetsModReboot {

    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = "com.markwal.mcmod.letsmodreboot.proxy.ClientProxy", serverSide = "com.markwal.mcmod.letsmodreboot.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void  preInit(FMLPreInitializationEvent event) {
        // init items, blocks
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // recipes, tile entities, gui, event handlers
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // things to be done after other mod initialized
    }
}
