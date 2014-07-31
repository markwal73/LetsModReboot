package com.markwal.mcmod.letsmodreboot.init;

import com.markwal.mcmod.letsmodreboot.item.ItemLMRB;
import com.markwal.mcmod.letsmodreboot.item.ItemMapleLeaf;
import com.markwal.mcmod.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by mark on 7/31/14.
 */
public class ModItems {

    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
