package Excaliburns.FactoriCraft.blocks.transportbelt;


import Excaliburns.FactoriCraft.FactoriCraft;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BeltFast extends BeltBase implements ITileEntityProvider{

    public int delay = 1;

    public BeltFast(){
        this.setCreativeTab(CreativeTabs.REDSTONE);
        setUnlocalizedName(FactoriCraft.MODID + ".beltfast");
        setRegistryName("beltfast");

    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta){
        return new TileEntityBelt();
    }
}
