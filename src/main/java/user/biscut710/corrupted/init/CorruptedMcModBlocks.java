
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package user.biscut710.corrupted.init;

import user.biscut710.corrupted.block.TrueResrved6Block;
import user.biscut710.corrupted.block.RedCrystalOreBlock;
import user.biscut710.corrupted.block.RedCrystalBlockBlock;
import user.biscut710.corrupted.block.PureNetheriteOreBlock;
import user.biscut710.corrupted.block.PureNetheriteBlockBlock;
import user.biscut710.corrupted.block.GlowingObsidianBlock;
import user.biscut710.corrupted.CorruptedMcMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class CorruptedMcModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CorruptedMcMod.MODID);
	public static final RegistryObject<Block> TRUE_RESRVED_6 = REGISTRY.register("true_resrved_6", () -> new TrueResrved6Block());
	public static final RegistryObject<Block> GLOWING_OBSIDIAN = REGISTRY.register("glowing_obsidian", () -> new GlowingObsidianBlock());
	public static final RegistryObject<Block> RED_CRYSTAL_ORE = REGISTRY.register("red_crystal_ore", () -> new RedCrystalOreBlock());
	public static final RegistryObject<Block> RED_CRYSTAL_BLOCK = REGISTRY.register("red_crystal_block", () -> new RedCrystalBlockBlock());
	public static final RegistryObject<Block> PURE_NETHERITE_ORE = REGISTRY.register("pure_netherite_ore", () -> new PureNetheriteOreBlock());
	public static final RegistryObject<Block> PURE_NETHERITE_BLOCK = REGISTRY.register("pure_netherite_block", () -> new PureNetheriteBlockBlock());
}
