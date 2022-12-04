
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.biscut710.corrupted.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.biscut710.corrupted.world.biome.GlowingObsidianFieldLandsBiome;
import net.biscut710.corrupted.CorruptedMcMod;

public class CorruptedMcModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, CorruptedMcMod.MODID);
	public static final RegistryObject<Biome> GLOWING_OBSIDIAN_FIELD_LANDS = REGISTRY.register("glowing_obsidian_field_lands",
			GlowingObsidianFieldLandsBiome::createBiome);
}
