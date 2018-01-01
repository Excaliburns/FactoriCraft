package Excaliburns.FactoriCraft.blocks.transportbelt;

import Excaliburns.FactoriCraft.FactoriCraft;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockBelt extends BlockBeltBase{

    public final int DELAY = 2;

    public BlockBelt(){
        this.setCreativeTab(CreativeTabs.REDSTONE);
        setUnlocalizedName(FactoriCraft.MODID + ".belt");
        setRegistryName("belt");

    }

    @Override
    public boolean hasTileEntity(){return true;}

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityBelt(DELAY);
    }

}
