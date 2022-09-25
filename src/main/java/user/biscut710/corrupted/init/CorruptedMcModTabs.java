
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package user.biscut710.corrupted.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CorruptedMcModTabs {
	public static CreativeModeTab TAB_CORRUPED;

	public static void load() {
		TAB_CORRUPED = new CreativeModeTab("tabcorruped") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CorruptedMcModBlocks.TRUE_RESRVED_6.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
