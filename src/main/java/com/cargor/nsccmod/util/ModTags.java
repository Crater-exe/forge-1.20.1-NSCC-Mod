package com.cargor.nsccmod.util;

import com.cargor.nsccmod.NsccMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_NUGGET_TOOL = tag("needs_nugget_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(NsccMod.MOD_ID, name));
        }
    }
}
