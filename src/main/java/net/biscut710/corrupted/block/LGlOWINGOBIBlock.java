
package net.biscut710.corrupted.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.biscut710.corrupted.init.CorruptedMcModFluids;

public class LGlOWINGOBIBlock extends LiquidBlock {
	public LGlOWINGOBIBlock() {
		super(() -> CorruptedMcModFluids.L_GL_OWINGOBI.get(),
				BlockBehaviour.Properties.of(Material.LAVA).strength(100f).noCollission().noLootTable());
	}
}
