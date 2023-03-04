
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.biscut710.corrupted.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.biscut710.corrupted.item.RedCrystalItem;
import net.biscut710.corrupted.item.PureNetheriteSwordItem;
import net.biscut710.corrupted.item.PureNetheriteShovelItem;
import net.biscut710.corrupted.item.PureNetheritePickaxeItem;
import net.biscut710.corrupted.item.PureNetheriteIngotItem;
import net.biscut710.corrupted.item.PureNetheriteHoeItem;
import net.biscut710.corrupted.item.PureNetheriteAxeItem;
import net.biscut710.corrupted.item.PureNetheriteArmorItem;
import net.biscut710.corrupted.item.LGlOWINGOBIItem;
import net.biscut710.corrupted.item.GLOWINGOBIDIMItem;
import net.biscut710.corrupted.item.ENetherStarItem;
import net.biscut710.corrupted.CorruptedMcMod;

public class CorruptedMcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CorruptedMcMod.MODID);
	public static final RegistryObject<Item> TRUE_RESRVED_6 = block(CorruptedMcModBlocks.TRUE_RESRVED_6, CorruptedMcModTabs.TAB_CORRUPED);
	public static final RegistryObject<Item> GLOWING_OBSIDIAN = block(CorruptedMcModBlocks.GLOWING_OBSIDIAN, CorruptedMcModTabs.TAB_CORRUPED);
	public static final RegistryObject<Item> L_GL_OWINGOBI_BUCKET = REGISTRY.register("l_gl_owingobi_bucket", () -> new LGlOWINGOBIItem());
	public static final RegistryObject<Item> GLOWINGOBIDIM = REGISTRY.register("glowingobidim", () -> new GLOWINGOBIDIMItem());
	public static final RegistryObject<Item> RED_CRYSTAL = REGISTRY.register("red_crystal", () -> new RedCrystalItem());
	public static final RegistryObject<Item> RED_CRYSTAL_ORE = block(CorruptedMcModBlocks.RED_CRYSTAL_ORE, CorruptedMcModTabs.TAB_CORRUPED);
	public static final RegistryObject<Item> RED_CRYSTAL_BLOCK = block(CorruptedMcModBlocks.RED_CRYSTAL_BLOCK, CorruptedMcModTabs.TAB_CORRUPED);
	public static final RegistryObject<Item> E_NETHER_STAR = REGISTRY.register("e_nether_star", () -> new ENetherStarItem());
	public static final RegistryObject<Item> PURE_NETHERITE_BLOCK = block(CorruptedMcModBlocks.PURE_NETHERITE_BLOCK, CorruptedMcModTabs.TAB_CORRUPED);
	public static final RegistryObject<Item> PURE_NETHERITE_INGOT = REGISTRY.register("pure_netherite_ingot", () -> new PureNetheriteIngotItem());
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
	public static final RegistryObject<Item> BITENF = block(CorruptedMcModBlocks.BITENF, CorruptedMcModTabs.TAB_CORRUPED);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
