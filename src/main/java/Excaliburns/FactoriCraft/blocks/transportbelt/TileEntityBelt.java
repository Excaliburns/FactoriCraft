package Excaliburns.FactoriCraft.blocks.transportbelt;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBelt extends TileEntity{

    private ItemStack[] inventory;
    private final int DELAY;

    public TileEntityBelt(int delay) {
        this.inventory = new ItemStack[8];
        this.DELAY = delay;
    }
}
