
package user.biscut710.corrupted.item;

import user.biscut710.corrupted.init.CorruptedMcModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RedCrystalItem extends Item {
	public RedCrystalItem() {
		super(new Item.Properties().tab(CorruptedMcModTabs.TAB_CORRUPED).stacksTo(64).rarity(Rarity.COMMON));
	}
}
