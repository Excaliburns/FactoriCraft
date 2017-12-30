package Excaliburns.FactoriCraft;

import Excaliburns.FactoriCraft.*;
import Excaliburns.FactoriCraft.blocks.conveyorbelt.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Blocks {

    @GameRegistry.ObjectHolder("factoricraft:conveyorslow")
    public static ConveyorSlow conveyorSlow;

    @GameRegistry.ObjectHolder("factoricraft:conveyor")
    public static Conveyor conveyor;

    @GameRegistry.ObjectHolder("factoricraft:conveyorfast")
    public static ConveyorFast conveyorFast;
}
