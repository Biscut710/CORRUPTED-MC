
package net.biscut710.corrupted.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.biscut710.corrupted.init.CorruptedMcModTabs;
import net.biscut710.corrupted.init.CorruptedMcModFluids;

public class LGlOWINGOBIItem extends BucketItem {
	public LGlOWINGOBIItem() {
		super(CorruptedMcModFluids.L_GL_OWINGOBI,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(CorruptedMcModTabs.TAB_CORRUPED));
	}
}
