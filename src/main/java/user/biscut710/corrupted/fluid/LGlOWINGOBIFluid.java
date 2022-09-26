
package user.biscut710.corrupted.fluid;

import user.biscut710.corrupted.init.CorruptedMcModItems;
import user.biscut710.corrupted.init.CorruptedMcModFluids;
import user.biscut710.corrupted.init.CorruptedMcModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;

public abstract class LGlOWINGOBIFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(CorruptedMcModFluids.L_GL_OWINGOBI,
			CorruptedMcModFluids.FLOWING_L_GL_OWINGOBI,
			FluidAttributes
					.builder(new ResourceLocation("corrupted_mc:blocks/glowing-obsidean"),
							new ResourceLocation("corrupted_mc:blocks/glowing-obsidean"))

					.rarity(Rarity.UNCOMMON))
			.explosionResistance(100f)

			.bucket(CorruptedMcModItems.L_GL_OWINGOBI_BUCKET).block(() -> (LiquidBlock) CorruptedMcModBlocks.L_GL_OWINGOBI.get());

	private LGlOWINGOBIFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LGlOWINGOBIFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LGlOWINGOBIFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
