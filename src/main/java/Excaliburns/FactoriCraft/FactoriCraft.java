package Excaliburns.FactoriCraft;

import Excaliburns.FactoriCraft.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.logging.Logger;

@Mod(
        modid = FactoriCraft.MODID,
        name = "FactoriCraft",
        version = "0.0.1",
        useMetadata = true,
        acceptedMinecraftVersions = "[1.12.2]")
public class FactoriCraft {
    public static final String MODID = "factoricraft";

    @Mod.Instance
    public static FactoriCraft instance;

    @SidedProxy(clientSide = "Excaliburns.FactoriCraft.proxy.ClientProxy", serverSide = "Excaliburns.FactoriCraft.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
}
}