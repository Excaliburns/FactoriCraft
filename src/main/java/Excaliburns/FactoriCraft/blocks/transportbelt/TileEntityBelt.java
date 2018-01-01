package Excaliburns.FactoriCraft.blocks.transportbelt;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBelt extends TileEntity{

    private ItemStack[] inventory;

    public TileEntityBelt() {
        this.inventory = new ItemStack[8];
    }
}
