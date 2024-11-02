package com.cargor.nsccmod.item;

import com.cargor.nsccmod.NsccMod;
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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NUGGET.get()))
                    .title(Component.translatable("creativetab.nscc_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.NUGGET.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
