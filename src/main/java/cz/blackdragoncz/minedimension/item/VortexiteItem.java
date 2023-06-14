
package cz.blackdragoncz.minedimension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import cz.blackdragoncz.minedimension.init.MineDimensionModTabs;

public class VortexiteItem extends Item {
	public VortexiteItem() {
		super(new Item.Properties().tab(MineDimensionModTabs.TAB_M_DIM_TAB).stacksTo(16).rarity(Rarity.COMMON));
	}
}
