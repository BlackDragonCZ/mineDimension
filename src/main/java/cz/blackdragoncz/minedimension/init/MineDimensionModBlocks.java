
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cz.blackdragoncz.minedimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import cz.blackdragoncz.minedimension.block.VortexiteOreBlock;
import cz.blackdragoncz.minedimension.block.PortalFrameBlock;
import cz.blackdragoncz.minedimension.block.PortalBlock;
import cz.blackdragoncz.minedimension.block.MiningDimensionPortalBlock;
import cz.blackdragoncz.minedimension.MineDimensionMod;

public class MineDimensionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MineDimensionMod.MODID);
	public static final RegistryObject<Block> PORTAL = REGISTRY.register("portal", () -> new PortalBlock());
	public static final RegistryObject<Block> PORTAL_FRAME = REGISTRY.register("portal_frame", () -> new PortalFrameBlock());
	public static final RegistryObject<Block> MINING_DIMENSION_PORTAL = REGISTRY.register("mining_dimension_portal", () -> new MiningDimensionPortalBlock());
	public static final RegistryObject<Block> VORTEXITE_ORE = REGISTRY.register("vortexite_ore", () -> new VortexiteOreBlock());
}
