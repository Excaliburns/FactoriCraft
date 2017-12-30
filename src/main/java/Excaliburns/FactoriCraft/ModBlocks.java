package Excaliburns.FactoriCraft;

import Excaliburns.FactoriCraft.blocks.conveyorbelt.Conveyor;
import Excaliburns.FactoriCraft.blocks.conveyorbelt.ConveyorFast;
import Excaliburns.FactoriCraft.blocks.conveyorbelt.ConveyorSlow;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("factoricraft:conveyorslow")
    public static ConveyorSlow conveyorSlow;

    @GameRegistry.ObjectHolder("factoricraft:conveyor")
    public static Conveyor conveyor;

    @GameRegistry.ObjectHolder("factoricraft:conveyorfast")
    public static ConveyorFast conveyorFast;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        conveyorSlow.initModel();
        conveyor.initModel();
        conveyorFast.initModel();
    }
}
