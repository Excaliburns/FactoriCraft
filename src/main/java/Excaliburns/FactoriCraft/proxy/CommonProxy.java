package Excaliburns.FactoriCraft.proxy;

import Excaliburns.FactoriCraft.ModBlocks;
import Excaliburns.FactoriCraft.blocks.transportbelt.Belt;
import Excaliburns.FactoriCraft.blocks.transportbelt.BeltFast;
import Excaliburns.FactoriCraft.blocks.transportbelt.BeltSlow;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber
public class CommonProxy {


    public void preInit(FMLPreInitializationEvent e) {

    }
    public void init(FMLInitializationEvent e) {

    }
    public void postInit(FMLPostInitializationEvent e) {

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                new BeltSlow(),
                new Belt(),
                new BeltFast()
        );
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new ItemBlock(ModBlocks.beltSlow).setRegistryName(ModBlocks.beltSlow.getRegistryName()),
                new ItemBlock(ModBlocks.belt).setRegistryName(ModBlocks.belt.getRegistryName()),
                new ItemBlock(ModBlocks.beltFast).setRegistryName(ModBlocks.beltFast.getRegistryName())
        );
    }
}
