package Excaliburns.FactoriCraft.worldgen;

import net.minecraft.entity.EntityLiving;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.world.WorldEvent.PotentialSpawns;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobGen
{
    @SubscribeEvent
    public void disablePotentialSpawns(PotentialSpawns event)
    {
        event.setCanceled(true);
    }

    @SubscribeEvent
    public void disableStructureSpawns(EntityJoinWorldEvent entityJoinEvent)
    {
        if(entityJoinEvent.getEntity() instanceof EntityLiving)
            entityJoinEvent.setCanceled(true);
    }
}
