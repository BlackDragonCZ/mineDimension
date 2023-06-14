
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cz.blackdragoncz.minedimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import cz.blackdragoncz.minedimension.world.features.ores.VortexiteOreFeature;
import cz.blackdragoncz.minedimension.MineDimensionMod;

@Mod.EventBusSubscriber
public class MineDimensionModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MineDimensionMod.MODID);
	public static final RegistryObject<Feature<?>> VORTEXITE_ORE = REGISTRY.register("vortexite_ore", VortexiteOreFeature::feature);
}
