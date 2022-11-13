
package user.biscut710.corrupted.block;

import user.biscut710.corrupted.init.CorruptedMcModFluids;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

public class LGlOWINGOBIBlock extends LiquidBlock {
	public LGlOWINGOBIBlock() {
		super(() -> (FlowingFluid) CorruptedMcModFluids.L_GL_OWINGOBI.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f)

		);
	}
}
