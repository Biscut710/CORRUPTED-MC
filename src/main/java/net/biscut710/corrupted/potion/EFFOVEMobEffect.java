
package net.biscut710.corrupted.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.biscut710.corrupted.procedures.EFFOVEOnEffectActiveTickProcedure;

public class EFFOVEMobEffect extends MobEffect {
	public EFFOVEMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -65485);
	}

	@Override
	public String getDescriptionId() {
		return "effect.corrupted_mc.effove";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EFFOVEOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
