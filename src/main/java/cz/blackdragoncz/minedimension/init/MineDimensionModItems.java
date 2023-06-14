
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cz.blackdragoncz.minedimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import cz.blackdragoncz.minedimension.item.VortexiteItem;
import cz.blackdragoncz.minedimension.item.MiningDimensionItem;
import cz.blackdragoncz.minedimension.item.IconMItem;
import cz.blackdragoncz.minedimension.MineDimensionMod;

public class MineDimensionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MineDimensionMod.MODID);
	public static final RegistryObject<Item> PORTAL = block(MineDimensionModBlocks.PORTAL, null);
	public static final RegistryObject<Item> PORTAL_FRAME = block(MineDimensionModBlocks.PORTAL_FRAME, MineDimensionModTabs.TAB_M_DIM_TAB);
	public static final RegistryObject<Item> MINING_DIMENSION = REGISTRY.register("mining_dimension", () -> new MiningDimensionItem());
	public static final RegistryObject<Item> VORTEXITE_ORE = block(MineDimensionModBlocks.VORTEXITE_ORE, MineDimensionModTabs.TAB_M_DIM_TAB);
	public static final RegistryObject<Item> VORTEXITE = REGISTRY.register("vortexite", () -> new VortexiteItem());
	public static final RegistryObject<Item> ICON_M = REGISTRY.register("icon_m", () -> new IconMItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
