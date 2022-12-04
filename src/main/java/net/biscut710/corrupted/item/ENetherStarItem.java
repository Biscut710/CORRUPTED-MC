
package net.biscut710.corrupted.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.biscut710.corrupted.init.CorruptedMcModTabs;

public class ENetherStarItem extends Item {
	public ENetherStarItem() {
		super(new Item.Properties().tab(CorruptedMcModTabs.TAB_CORRUPED).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
