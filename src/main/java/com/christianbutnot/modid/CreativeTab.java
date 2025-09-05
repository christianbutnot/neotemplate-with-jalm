package com.christianbutnot.progressionutils;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTab {

	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
			.create(Registries.CREATIVE_MODE_TAB, Main.MODID);

	public static final RegistryObject<CreativeModeTab> PROGRESSIONUTILS_TAB = CREATIVE_MODE_TABS.register(
			"progressionutils_tab",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemInit.JAR_OF_RED_SAND.get()))
					.title(Component.translatable("creativetab.progressionutils_tab"))
					.displayItems((pParameters, pOutput) -> {
						for (RegistryObject<Item> item : ItemInit.ITEMS.getEntries()) {
							pOutput.accept(item.get());
						}

					}).build());

	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TABS.register(eventBus);
	}
}
