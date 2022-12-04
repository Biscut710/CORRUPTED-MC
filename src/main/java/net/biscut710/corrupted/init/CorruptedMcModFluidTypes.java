
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.biscut710.corrupted.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.biscut710.corrupted.fluid.types.LGlOWINGOBIFluidType;
import net.biscut710.corrupted.CorruptedMcMod;

public class CorruptedMcModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CorruptedMcMod.MODID);
	public static final RegistryObject<FluidType> L_GL_OWINGOBI_TYPE = REGISTRY.register("l_gl_owingobi", () -> new LGlOWINGOBIFluidType());
}
