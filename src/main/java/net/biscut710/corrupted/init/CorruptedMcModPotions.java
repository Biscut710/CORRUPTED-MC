
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.biscut710.corrupted.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.biscut710.corrupted.CorruptedMcMod;

public class CorruptedMcModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, CorruptedMcMod.MODID);
	public static final RegistryObject<Potion> POTOVE = REGISTRY.register("potove",
			() -> new Potion(new MobEffectInstance(CorruptedMcModMobEffects.EFFOVE.get(), 500, 0, false, true)));
	public static final RegistryObject<Potion> POTMILK = REGISTRY.register("potmilk",
			() -> new Potion(new MobEffectInstance(CorruptedMcModMobEffects.MILK.get(), 20, 0, false, true)));
}
