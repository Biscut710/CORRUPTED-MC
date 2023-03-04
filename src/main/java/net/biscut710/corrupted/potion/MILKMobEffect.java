
package net.biscut710.corrupted.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.biscut710.corrupted.procedures.MILKEffectStartedappliedProcedure;

public class MILKMobEffect extends MobEffect {
	public MILKMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3342337);
	}

	@Override
	public String getDescriptionId() {
		return "effect.corrupted_mc.milk";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		MILKEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
