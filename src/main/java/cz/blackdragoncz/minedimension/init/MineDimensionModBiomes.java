
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cz.blackdragoncz.minedimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import cz.blackdragoncz.minedimension.world.biome.MWorldBiome;
import cz.blackdragoncz.minedimension.MineDimensionMod;

public class MineDimensionModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, MineDimensionMod.MODID);
	public static final RegistryObject<Biome> M_WORLD = REGISTRY.register("m_world", MWorldBiome::createBiome);
}
