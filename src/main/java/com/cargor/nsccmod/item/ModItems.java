package com.cargor.nsccmod.item;

import com.cargor.nsccmod.NsccMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            // creates a long list of items that are registered when forge loads items
            DeferredRegister.create(ForgeRegistries.ITEMS, NsccMod.MOD_ID);

    public static final RegistryObject<Item> NUGGET_ITEM = ITEMS.register("nugget",
            () -> new Item(new Item.Properties().food(ModFoods.NUGGET_FOOD)));

    public static void register(IEventBus eventBus) {
        // registers the registry
        ITEMS.register(eventBus);
    }
}
