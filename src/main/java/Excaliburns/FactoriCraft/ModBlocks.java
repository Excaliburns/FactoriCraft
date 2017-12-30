package Excaliburns.FactoriCraft;

import Excaliburns.FactoriCraft.blocks.transportbelt.Belt;
import Excaliburns.FactoriCraft.blocks.transportbelt.BeltFast;
import Excaliburns.FactoriCraft.blocks.transportbelt.BeltSlow;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
    @GameRegistry.ObjectHolder("factoricraft:beltslow")
    public static BeltSlow beltSlow;

    @GameRegistry.ObjectHolder("factoricraft:belt")
    public static Belt belt;

    @GameRegistry.ObjectHolder("factoricraft:beltfast")
    public static BeltFast beltFast;


    @SideOnly(Side.CLIENT)
    public static void initModels(){
        beltSlow.initModel();
        belt.initModel();
        beltFast.initModel();
    }
}
