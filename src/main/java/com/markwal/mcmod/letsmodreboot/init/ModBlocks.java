package com.markwal.mcmod.letsmodreboot.init;

import com.markwal.mcmod.letsmodreboot.block.BlockFlag;
import com.markwal.mcmod.letsmodreboot.block.BlockLMRB;
import com.markwal.mcmod.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by mark on 7/31/14.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockLMRB flag = new BlockFlag();

    public static void init() {
        GameRegistry.registerBlock(flag, "flag");
    }


}
