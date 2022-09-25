
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package user.biscut710.corrupted.init;

import user.biscut710.corrupted.block.TrueResrved6Block;
import user.biscut710.corrupted.CorruptedMcMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class CorruptedMcModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CorruptedMcMod.MODID);
	public static final RegistryObject<Block> TRUE_RESRVED_6 = REGISTRY.register("true_resrved_6", () -> new TrueResrved6Block());
}
