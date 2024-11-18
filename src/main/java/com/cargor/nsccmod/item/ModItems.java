package com.cargor.nsccmod.item;

import com.cargor.nsccmod.NsccMod;
import com.cargor.nsccmod.item.custom.ModArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.*;
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

    // ---------------------------- armour

    // ----------- helmet

    public static final RegistryObject<ArmorItem> NUGGET_HELMET = ITEMS.register("nugget_helmet",
            () -> new ModArmorItem(ModArmorMaterials.NUGGET_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()));

    // ----------- chestplate

    public static final RegistryObject<ArmorItem> NUGGET_CHESTPLATE = ITEMS.register("nugget_chestplate",
            () -> new ArmorItem(ModArmorMaterials.NUGGET_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    // ----------- leggings

    public static final RegistryObject<ArmorItem> NUGGET_LEGGINGS = ITEMS.register("nugget_leggings",
            () -> new ArmorItem(ModArmorMaterials.NUGGET_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    // ----------- boots
    public static final RegistryObject<ArmorItem> NUGGET_BOOTS = ITEMS.register("nugget_boots",
            () -> new ArmorItem(ModArmorMaterials.NUGGET_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()));

    // ---------------------------- tools

    // ----------- sword

    public static final RegistryObject<Item> NUGGET_SWORD = ITEMS.register("nugget_sword",
            () -> new SwordItem(ModToolTiers.NUGGET, 3, -2.3f, new Item.Properties())
    );

    // ----------- shovel

    public static final RegistryObject<Item> NUGGET_SHOVEL = ITEMS.register("nugget_shovel",
            () -> new ShovelItem(ModToolTiers.NUGGET, 0, -3.0f, new Item.Properties())
    );

    // ----------- pickaxe

    public static final RegistryObject<Item> NUGGET_PICKAXE = ITEMS.register("nugget_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NUGGET, 0, -3.0f, new Item.Properties())
    );

    // ----------- axe

    public static final RegistryObject<Item> NUGGET_AXE = ITEMS.register("nugget_axe",
            () -> new AxeItem(ModToolTiers.NUGGET, 5, -3.0f, new Item.Properties())
    );

    // ----------- hoe

    public static final RegistryObject<Item> NUGGET_HOE = ITEMS.register("nugget_hoe",
            () -> new HoeItem(ModToolTiers.NUGGET, 0, -3.0f, new Item.Properties())
    );


    public static void register(IEventBus eventBus) {
        // registers the registry
        ITEMS.register(eventBus);
    }
}
