package Excaliburns.FactoriCraft.blocks.transportbelt;


import Excaliburns.FactoriCraft.FactoriCraft;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBeltFast extends BlockBeltBase implements ITileEntityProvider{

    public int delay = 1;

    public BlockBeltFast(){
        this.setCreativeTab(CreativeTabs.REDSTONE);
        setUnlocalizedName(FactoriCraft.MODID + ".beltfast");
        setRegistryName("beltfast");

    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta){
        return new TileEntityBelt(delay);
    }
}
