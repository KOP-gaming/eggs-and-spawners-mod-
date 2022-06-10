
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eggs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.eggs.item.EmptyspawneggItem;
import net.mcreator.eggs.item.Dark_magicIngotItem;
import net.mcreator.eggs.EggsMod;

public class EggsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EggsMod.MODID);
	public static final RegistryObject<Item> DARK_MAGIC_INGOT = REGISTRY.register("dark_magic_ingot", () -> new Dark_magicIngotItem());
	public static final RegistryObject<Item> DARK_MAGIC_ORE = block(EggsModBlocks.DARK_MAGIC_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DARK_MAGIC_BLOCK = block(EggsModBlocks.DARK_MAGIC_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> EMPTYSPAWNEGG = REGISTRY.register("emptyspawnegg", () -> new EmptyspawneggItem());
	public static final RegistryObject<Item> REINFORCEDDARKMAGICBLOCK = block(EggsModBlocks.REINFORCEDDARKMAGICBLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> EGGMANIPULATOR = block(EggsModBlocks.EGGMANIPULATOR, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
