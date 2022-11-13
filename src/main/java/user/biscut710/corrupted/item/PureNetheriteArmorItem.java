
package user.biscut710.corrupted.item;

import user.biscut710.corrupted.init.CorruptedMcModTabs;
import user.biscut710.corrupted.init.CorruptedMcModItems;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public abstract class PureNetheriteArmorItem extends ArmorItem {
	public PureNetheriteArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 60;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{8, 24, 20, 8}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 36;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CorruptedMcModItems.PURE_NETHERITE_INGOT.get()));
			}

			@Override
			public String getName() {
				return "pure_netherite_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends PureNetheriteArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CorruptedMcModTabs.TAB_CORRUPED).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "corrupted_mc:textures/models/armor/purenetherite_layer_1.png";
		}
	}

	public static class Chestplate extends PureNetheriteArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CorruptedMcModTabs.TAB_CORRUPED).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "corrupted_mc:textures/models/armor/purenetherite_layer_1.png";
		}
	}

	public static class Leggings extends PureNetheriteArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CorruptedMcModTabs.TAB_CORRUPED).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "corrupted_mc:textures/models/armor/purenetherite_layer_2.png";
		}
	}

	public static class Boots extends PureNetheriteArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CorruptedMcModTabs.TAB_CORRUPED).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "corrupted_mc:textures/models/armor/purenetherite_layer_1.png";
		}
	}
}
