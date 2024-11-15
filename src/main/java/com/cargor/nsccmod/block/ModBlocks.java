package com.cargor.nsccmod.block;

import com.cargor.nsccmod.NsccMod;
import com.cargor.nsccmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            // creates a list of blocks to be loaded when forge loads blocks
            DeferredRegister.create(ForgeRegistries.BLOCKS, NsccMod.MOD_ID);

    public static final RegistryObject<Block> NUGGET_ORE_BLOCK = registerBlock("nugget_ore_block", () ->
            // properties of nuggetonium ore block are copied from diamond ore
            new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));

    public static final RegistryObject<Block> NUGGET_BLOCK = registerBlock("nugget_block", () ->
            // properties of nuggetonium ore block are copied from diamond block
            new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
            // registering the block
            RegistryObject<T> objToReturn = BLOCKS.register(name, block);

            // registering the corresponding item
            registerBlockItem(name, objToReturn);
            return objToReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
            // registering the block item in the items register
            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        // registers the registry
        BLOCKS.register(eventBus);
    }
}
