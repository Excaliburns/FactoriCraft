package Excaliburns.FactoriCraft.worldgen;
import net.minecraftforge.event.world.WorldEvent.PotentialSpawns;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class WorldGenBase
{
    @SubscribeEvent
    public void disableMobGen(PotentialSpawns event)
    {
        event.setCanceled(true);
    }
}

