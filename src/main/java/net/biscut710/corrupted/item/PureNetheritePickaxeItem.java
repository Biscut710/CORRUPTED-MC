
package net.biscut710.corrupted.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.biscut710.corrupted.init.CorruptedMcModTabs;
import net.biscut710.corrupted.init.CorruptedMcModItems;

public class PureNetheritePickaxeItem extends PickaxeItem {
	public PureNetheritePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1741;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 8;
			}

			public int getEnchantmentValue() {
				return 56;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CorruptedMcModItems.PURE_NETHERITE_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CorruptedMcModTabs.TAB_CORRUPED).fireResistant());
	}
}
