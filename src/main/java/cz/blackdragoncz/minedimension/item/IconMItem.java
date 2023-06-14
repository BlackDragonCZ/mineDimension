
package cz.blackdragoncz.minedimension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IconMItem extends Item {
	public IconMItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
	}
}
