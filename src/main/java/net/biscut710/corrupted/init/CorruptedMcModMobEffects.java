
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.biscut710.corrupted.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.biscut710.corrupted.potion.MILKMobEffect;
import net.biscut710.corrupted.potion.EFFOVEMobEffect;
import net.biscut710.corrupted.CorruptedMcMod;

public class CorruptedMcModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CorruptedMcMod.MODID);
	public static final RegistryObject<MobEffect> EFFOVE = REGISTRY.register("effove", () -> new EFFOVEMobEffect());
	public static final RegistryObject<MobEffect> MILK = REGISTRY.register("milk", () -> new MILKMobEffect());
}
