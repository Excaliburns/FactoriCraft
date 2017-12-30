package Excaliburns.FactoriCraft.blocks.transportbelt;

import net.minecraft.init.Items;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

import java.util.ArrayList;
import java.util.List;

public class TileEntityBelt extends TileEntity {
    private List<Items> itemListLeft = new ArrayList<Items>();
    private List<Items> itemListRight = new ArrayList<Items>();

    public boolean isLeftFull(){
        return itemListLeft.size() < 4;
    }

    public boolean isRightFull(){
        return itemListRight.size() < 4;
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound){
        return super.writeToNBT(compound);
    }
}
