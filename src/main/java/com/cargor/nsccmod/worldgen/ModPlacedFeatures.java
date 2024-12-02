package com.cargor.nsccmod.worldgen;

import com.cargor.nsccmod.NsccMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    // resource key for nugget ore
    public static final ResourceKey<PlacedFeature> NUGGET_ORE_PLACED_KEY = registerKey("nugget_ore_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        // adding placement modifiers to nugget ore similar to that of diamond
        register(context, NUGGET_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NUGGET_ORE_KEY),
                ModOrePlacement.commonOrePlacement(10, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-30), VerticalAnchor.aboveBottom(100))));


    }

    // method to create resource keys with a given name
    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(NsccMod.MOD_ID, name));
    }

    // method to register created resource keys within a bootstap context
    public static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                Holder<ConfiguredFeature<?, ?>> configuration,
                                List<PlacementModifier> modifiers) {

        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
