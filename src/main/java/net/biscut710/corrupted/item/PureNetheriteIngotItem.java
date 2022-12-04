
package net.biscut710.corrupted.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.biscut710.corrupted.init.CorruptedMcModTabs;

public class PureNetheriteIngotItem extends Item {
	public PureNetheriteIngotItem() {
		super(new Item.Properties().tab(CorruptedMcModTabs.TAB_CORRUPED).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
