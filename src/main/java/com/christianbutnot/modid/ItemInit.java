package com.christianbutnot.progressionutils;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);
	
	
	public static final RegistryObject<Item> WOOD_CHIP = ITEMS.register("wood_chip",
            () -> new Item(new Item.Properties()));
	
	
	
	
	
	
	public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
