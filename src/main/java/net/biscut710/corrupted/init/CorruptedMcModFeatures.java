
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.biscut710.corrupted.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.biscut710.corrupted.world.features.ores.RedCrystalOreFeature;
import net.biscut710.corrupted.world.features.lakes.LGlOWINGOBIFeature;
import net.biscut710.corrupted.CorruptedMcMod;

@Mod.EventBusSubscriber
public class CorruptedMcModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CorruptedMcMod.MODID);
	public static final RegistryObject<Feature<?>> L_GL_OWINGOBI = REGISTRY.register("l_gl_owingobi", LGlOWINGOBIFeature::feature);
	public static final RegistryObject<Feature<?>> RED_CRYSTAL_ORE = REGISTRY.register("red_crystal_ore", RedCrystalOreFeature::feature);
}
