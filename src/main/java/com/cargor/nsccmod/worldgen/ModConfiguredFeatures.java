package com.cargor.nsccmod.worldgen;

import com.cargor.nsccmod.NsccMod;
import com.cargor.nsccmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> NUGGET_ORE_KEY = registerKey("nugget_ore");

    // creating bootstap context
    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        // adding rule for nugget ore to be able to replace stone and stone ores
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);

        // registering rule with nugget ore
        register(context, NUGGET_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceable,
                ModBlocks.NUGGET_ORE_BLOCK.get().defaultBlockState(), 6));
    }

    // method to create resource keys with a given name
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(NsccMod.MOD_ID, name));
    }

    // method to register given resource keys within a "BootStap" context (bootstap is likely a typo)
    public static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                         ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }





}
