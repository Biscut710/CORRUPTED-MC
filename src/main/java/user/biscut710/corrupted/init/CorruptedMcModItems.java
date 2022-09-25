
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package user.biscut710.corrupted.init;

import user.biscut710.corrupted.item.RedCrystalItem;
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

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
