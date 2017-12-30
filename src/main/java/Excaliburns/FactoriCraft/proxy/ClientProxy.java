package Excaliburns.FactoriCraft.proxy;

import Excaliburns.FactoriCraft.FactoriCraft;
import Excaliburns.FactoriCraft.ModBlocks;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        OBJLoader.INSTANCE.addDomain(FactoriCraft.MODID);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        System.out.println("Registering Models");
        ModBlocks.initModels();
    }
}
