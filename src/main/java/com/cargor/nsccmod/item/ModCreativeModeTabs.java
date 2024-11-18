package com.cargor.nsccmod.item;

import com.cargor.nsccmod.NsccMod;
import com.cargor.nsccmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NsccMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NSCC_TAB = CREATIVE_MODE_TABS.register("nscc_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NUGGET_ITEM.get()))
                    .title(Component.translatable("creativetab.nscc_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.NUGGET_ITEM.get());

                        // adding armour to the creative mode tab
                        pOutput.accept(ModItems.NUGGET_HELMET.get());
                        pOutput.accept(ModItems.NUGGET_CHESTPLATE.get());
                        pOutput.accept(ModItems.NUGGET_LEGGINGS.get());
                        pOutput.accept(ModItems.NUGGET_BOOTS.get());

                        // adding the blocks to the creative mode tab
                        pOutput.accept(ModBlocks.NUGGET_BLOCK.get());
                        pOutput.accept(ModBlocks.NUGGET_ORE_BLOCK.get());

                        // adding tools to the creative mode tab
                        pOutput.accept(ModItems.NUGGET_SWORD.get());
                        pOutput.accept(ModItems.NUGGET_PICKAXE.get());
                        pOutput.accept(ModItems.NUGGET_AXE.get());
                        pOutput.accept(ModItems.NUGGET_SHOVEL.get());
                        pOutput.accept(ModItems.NUGGET_HOE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
