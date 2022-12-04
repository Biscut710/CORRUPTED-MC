
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.biscut710.corrupted.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.biscut710.corrupted.fluid.LGlOWINGOBIFluid;
import net.biscut710.corrupted.CorruptedMcMod;

public class CorruptedMcModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, CorruptedMcMod.MODID);
	public static final RegistryObject<FlowingFluid> L_GL_OWINGOBI = REGISTRY.register("l_gl_owingobi", () -> new LGlOWINGOBIFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_L_GL_OWINGOBI = REGISTRY.register("flowing_l_gl_owingobi",
			() -> new LGlOWINGOBIFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(L_GL_OWINGOBI.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_L_GL_OWINGOBI.get(), RenderType.translucent());
		}
	}
}
