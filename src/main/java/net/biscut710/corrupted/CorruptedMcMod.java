/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.biscut710.corrupted;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.biscut710.corrupted.init.CorruptedMcModTabs;
import net.biscut710.corrupted.init.CorruptedMcModPotions;
import net.biscut710.corrupted.init.CorruptedMcModMobEffects;
import net.biscut710.corrupted.init.CorruptedMcModMenus;
import net.biscut710.corrupted.init.CorruptedMcModItems;
import net.biscut710.corrupted.init.CorruptedMcModFluids;
import net.biscut710.corrupted.init.CorruptedMcModFluidTypes;
import net.biscut710.corrupted.init.CorruptedMcModFeatures;
import net.biscut710.corrupted.init.CorruptedMcModBlocks;
import net.biscut710.corrupted.init.CorruptedMcModBlockEntities;
import net.biscut710.corrupted.init.CorruptedMcModBiomes;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.List;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("corrupted_mc")
public class CorruptedMcMod {
	public static final Logger LOGGER = LogManager.getLogger(CorruptedMcMod.class);
	public static final String MODID = "corrupted_mc";

	public CorruptedMcMod() {
		MinecraftForge.EVENT_BUS.register(this);
		CorruptedMcModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		CorruptedMcModBlocks.REGISTRY.register(bus);
		CorruptedMcModItems.REGISTRY.register(bus);

		CorruptedMcModBlockEntities.REGISTRY.register(bus);
		CorruptedMcModFeatures.REGISTRY.register(bus);
		CorruptedMcModFluids.REGISTRY.register(bus);
		CorruptedMcModFluidTypes.REGISTRY.register(bus);

		CorruptedMcModMobEffects.REGISTRY.register(bus);
		CorruptedMcModPotions.REGISTRY.register(bus);

		CorruptedMcModMenus.REGISTRY.register(bus);
		CorruptedMcModBiomes.REGISTRY.register(bus);
	}

	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final List<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ArrayList<>();

	public static void queueServerWork(int tick, Runnable action) {
		workQueue.add(new AbstractMap.SimpleEntry(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
