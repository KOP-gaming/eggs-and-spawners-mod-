
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eggs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.eggs.block.ReinforceddarkmagicblockBlock;
import net.mcreator.eggs.block.EggmanipulatorBlock;
import net.mcreator.eggs.block.Dark_magicOreBlock;
import net.mcreator.eggs.block.Dark_magicBlockBlock;
import net.mcreator.eggs.EggsMod;

public class EggsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EggsMod.MODID);
	public static final RegistryObject<Block> DARK_MAGIC_ORE = REGISTRY.register("dark_magic_ore", () -> new Dark_magicOreBlock());
	public static final RegistryObject<Block> DARK_MAGIC_BLOCK = REGISTRY.register("dark_magic_block", () -> new Dark_magicBlockBlock());
	public static final RegistryObject<Block> REINFORCEDDARKMAGICBLOCK = REGISTRY.register("reinforceddarkmagicblock",
			() -> new ReinforceddarkmagicblockBlock());
	public static final RegistryObject<Block> EGGMANIPULATOR = REGISTRY.register("eggmanipulator", () -> new EggmanipulatorBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ReinforceddarkmagicblockBlock.registerRenderLayer();
		}
	}
}
