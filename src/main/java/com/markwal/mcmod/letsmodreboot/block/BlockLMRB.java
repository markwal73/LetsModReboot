package com.markwal.mcmod.letsmodreboot.block;

import com.markwal.mcmod.letsmodreboot.creativetab.CreativeTabLMRB;
import com.markwal.mcmod.letsmodreboot.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by mark on 7/31/14.
 */
public class BlockLMRB extends Block {

    public BlockLMRB(Material material) {
        super(material);
    }

    public BlockLMRB() {

        this(Material.rock);
        this.setCreativeTab(CreativeTabLMRB.LMBR_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
