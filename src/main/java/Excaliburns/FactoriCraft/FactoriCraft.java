package Excaliburns.FactoriCraft;

import Excaliburns.FactoriCraft.blocks.transportbelt.TileEntityBelt;
import Excaliburns.FactoriCraft.proxy.CommonProxy;

import Excaliburns.FactoriCraft.worldgen.BiomeGen;
import Excaliburns.FactoriCraft.worldgen.MobGen;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDesert;
import net.minecraft.world.biome.BiomePlains;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Iterator;
import java.util.List;
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

        MinecraftForge.EVENT_BUS.register(new MobGen());
        // MinecraftForge.TERRAIN_GEN_BUS.register(new BiomeGen());

        GameRegistry.registerTileEntity(TileEntityBelt.class, FactoriCraft.MODID + ".TileEntityBelt");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        proxy.postInit(e);
    }

}