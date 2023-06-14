
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cz.blackdragoncz.minedimension.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MineDimensionModTabs {
	public static CreativeModeTab TAB_M_DIM_TAB;

	public static void load() {
		TAB_M_DIM_TAB = new CreativeModeTab("tabm_dim_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MineDimensionModBlocks.PORTAL_FRAME.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
