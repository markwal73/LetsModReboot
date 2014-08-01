package com.markwal.mcmod.letsmodreboot.creativetab;

import com.markwal.mcmod.letsmodreboot.init.ModItems;
import com.markwal.mcmod.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by mark on 7/31/14.
 */
public class CreativeTabLMRB {

    public static final CreativeTabs LMBR_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {

        @Override
        public Item getTabIconItem() {
            return ModItems.mapleLeaf;
        }

    };

}
