package mhj.expmm.block;

import mhj.expmm.CreativeTabEXPMM;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * @Author: ManualHuaJi
 */
public abstract class BlockEXPMM extends Block {
    public BlockEXPMM(Material materialIn,String name) {
        super(materialIn);
        this.setUnlocalizedName(name).setRegistryName(name).setCreativeTab(CreativeTabEXPMM.TAB_EXPMM);
    }
}