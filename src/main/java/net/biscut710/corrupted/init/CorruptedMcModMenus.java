
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.biscut710.corrupted.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.biscut710.corrupted.world.inventory.BITENFGUIMenu;
import net.biscut710.corrupted.CorruptedMcMod;

public class CorruptedMcModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CorruptedMcMod.MODID);
	public static final RegistryObject<MenuType<BITENFGUIMenu>> BITENFGUI = REGISTRY.register("bitenfgui",
			() -> IForgeMenuType.create(BITENFGUIMenu::new));
}
