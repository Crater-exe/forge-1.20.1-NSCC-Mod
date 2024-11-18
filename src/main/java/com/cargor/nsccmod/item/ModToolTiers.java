package com.cargor.nsccmod.item;

import com.cargor.nsccmod.NsccMod;
import com.cargor.nsccmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier NUGGET = TierSortingRegistry.registerTier(
            // tag for tier of tools that are added by the mod
            // tier is currently placed between diamond and netherite
            new ForgeTier(5, 1500, 8.0f, 3, 15,
                    ModTags.Blocks.NEEDS_NUGGET_TOOL, () -> Ingredient.of(ModItems.NUGGET.get())),
            new ResourceLocation(NsccMod.MOD_ID, "nugget"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE)
    );
}
