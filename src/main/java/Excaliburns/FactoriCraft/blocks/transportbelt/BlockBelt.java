package Excaliburns.FactoriCraft.blocks.transportbelt;


import Excaliburns.FactoriCraft.FactoriCraft;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBelt extends BlockBeltBase implements ITileEntityProvider{

    public int delay = 2;

    public BlockBelt(){
        this.setCreativeTab(CreativeTabs.REDSTONE);
        setUnlocalizedName(FactoriCraft.MODID + ".belt");
        setRegistryName("belt");

    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta){
        return new TileEntityBelt(delay);
    }
}
