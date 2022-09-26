
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package user.biscut710.corrupted.init;

import user.biscut710.corrupted.item.RedCrystalItem;
import user.biscut710.corrupted.item.PureNetheriteSwordItem;
import user.biscut710.corrupted.item.PureNetheriteShovelItem;
import user.biscut710.corrupted.item.PureNetheritePickaxeItem;
import user.biscut710.corrupted.item.PureNetheriteIngotItem;
import user.biscut710.corrupted.item.PureNetheriteHoeItem;
import user.biscut710.corrupted.item.PureNetheriteAxeItem;
import user.biscut710.corrupted.item.PureNetheriteArmorItem;
import user.biscut710.corrupted.CorruptedMcMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class CorruptedMcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CorruptedMcMod.MODID);
	public static final RegistryObject<Item> TRUE_RESRVED_6 = block(CorruptedMcModBlocks.TRUE_RESRVED_6, CorruptedMcModTabs.TAB_CORRUPED);
	public static final RegistryObject<Item> GLOWING_OBSIDIAN = block(CorruptedMcModBlocks.GLOWING_OBSIDIAN, CorruptedMcModTabs.TAB_CORRUPED);
	public static final RegistryObject<Item> RED_CRYSTAL = REGISTRY.register("red_crystal", () -> new RedCrystalItem());
	public static final RegistryObject<Item> RED_CRYSTAL_ORE = block(CorruptedMcModBlocks.RED_CRYSTAL_ORE, CorruptedMcModTabs.TAB_CORRUPED);
	public static final RegistryObject<Item> RED_CRYSTAL_BLOCK = block(CorruptedMcModBlocks.RED_CRYSTAL_BLOCK, CorruptedMcModTabs.TAB_CORRUPED);
	public static final RegistryObject<Item> PURE_NETHERITE_INGOT = REGISTRY.register("pure_netherite_ingot", () -> new PureNetheriteIngotItem());
	public static final RegistryObject<Item> PURE_NETHERITE_BLOCK = block(CorruptedMcModBlocks.PURE_NETHERITE_BLOCK, CorruptedMcModTabs.TAB_CORRUPED);
	public static final RegistryObject<Item> PURE_NETHERITE_PICKAXE = REGISTRY.register("pure_netherite_pickaxe",
			() -> new PureNetheritePickaxeItem());
	public static final RegistryObject<Item> PURE_NETHERITE_AXE = REGISTRY.register("pure_netherite_axe", () -> new PureNetheriteAxeItem());
	public static final RegistryObject<Item> PURE_NETHERITE_SWORD = REGISTRY.register("pure_netherite_sword", () -> new PureNetheriteSwordItem());
	public static final RegistryObject<Item> PURE_NETHERITE_SHOVEL = REGISTRY.register("pure_netherite_shovel", () -> new PureNetheriteShovelItem());
	public static final RegistryObject<Item> PURE_NETHERITE_HOE = REGISTRY.register("pure_netherite_hoe", () -> new PureNetheriteHoeItem());
	public static final RegistryObject<Item> PURE_NETHERITE_ARMOR_HELMET = REGISTRY.register("pure_netherite_armor_helmet",
			() -> new PureNetheriteArmorItem.Helmet());
	public static final RegistryObject<Item> PURE_NETHERITE_ARMOR_CHESTPLATE = REGISTRY.register("pure_netherite_armor_chestplate",
			() -> new PureNetheriteArmorItem.Chestplate());
	public static final RegistryObject<Item> PURE_NETHERITE_ARMOR_LEGGINGS = REGISTRY.register("pure_netherite_armor_leggings",
			() -> new PureNetheriteArmorItem.Leggings());
	public static final RegistryObject<Item> PURE_NETHERITE_ARMOR_BOOTS = REGISTRY.register("pure_netherite_armor_boots",
			() -> new PureNetheriteArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
