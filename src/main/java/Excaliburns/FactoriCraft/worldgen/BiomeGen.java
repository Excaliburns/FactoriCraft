package Excaliburns.FactoriCraft.worldgen;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDesert;
import net.minecraft.world.biome.BiomePlains;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.BiomeEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Iterator;
import java.util.List;

public class BiomeGen
{
    @SubscribeEvent
    public void disableBiomeDecoration(Decorate event)
    {
        if(event.getType() != Decorate.EventType.TREE && event.getType() != Decorate.EventType.FLOWERS && event.getType() != Decorate.EventType.GRASS && event.getType() != Decorate.EventType.DEAD_BUSH)
            event.setResult(Event.Result.DENY);


    }

    @SubscribeEvent
    public void biomeCaller(){}
    public void destroyBiomes()
    {
        List<BiomeManager.BiomeEntry> icyBiomes = BiomeManager.getBiomes(BiomeManager.BiomeType.ICY);
        for(int x = 0; x < icyBiomes.size(); x++)
        {
            if (icyBiomes.get(x).biome != Biome.getBiome(1) || icyBiomes.get(x).biome != Biome.getBiome(2))
            {
                BiomeManager.removeBiome(BiomeManager.BiomeType.ICY, icyBiomes.get(x));
            }
        }
        List<BiomeManager.BiomeEntry> desertBiomes = BiomeManager.getBiomes(BiomeManager.BiomeType.DESERT);
        for(int x = 0; x < desertBiomes.size(); x++)
        {
            if (desertBiomes.get(x).biome != Biome.getBiome(1) || desertBiomes.get(x).biome != Biome.getBiome(2))
            {
                BiomeManager.removeBiome(BiomeManager.BiomeType.DESERT, desertBiomes.get(x));
            }
        }
        List<BiomeManager.BiomeEntry> warmBiomes = BiomeManager.getBiomes(BiomeManager.BiomeType.WARM);
        for(int x = 0; x < warmBiomes.size(); x++)
        {
            if (warmBiomes.get(x).biome != Biome.getBiome(1) || warmBiomes.get(x).biome != Biome.getBiome(2))
            {
                BiomeManager.removeBiome(BiomeManager.BiomeType.WARM, warmBiomes.get(x));
            }
        }
        List<BiomeManager.BiomeEntry> coolBiomes = BiomeManager.getBiomes(BiomeManager.BiomeType.COOL);
        for(int x = 0; x < coolBiomes.size(); x++)
        {
            if (coolBiomes.get(x).biome != Biome.getBiome(1) || coolBiomes.get(x).biome != Biome.getBiome(2))
            {
                BiomeManager.removeBiome(BiomeManager.BiomeType.COOL ,coolBiomes.get(x));
            }
        }

    }
}
