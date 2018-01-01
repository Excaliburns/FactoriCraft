package Excaliburns.FactoriCraft;

import Excaliburns.FactoriCraft.blocks.transportbelt.BlockBelt;
import Excaliburns.FactoriCraft.blocks.transportbelt.BlockBeltFast;
import Excaliburns.FactoriCraft.blocks.transportbelt.BlockBeltSlow;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
    @GameRegistry.ObjectHolder("factoricraft:beltslow")
    public static BlockBeltSlow beltSlow;

    @GameRegistry.ObjectHolder("factoricraft:belt")
    public static BlockBelt belt;

    @GameRegistry.ObjectHolder("factoricraft:beltfast")
    public static BlockBeltFast beltFast;


    @SideOnly(Side.CLIENT)
    public static void initModels(){
        beltSlow.initModel();
        belt.initModel();
        beltFast.initModel();
    }
}
