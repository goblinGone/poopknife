package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("poop_knife");

	public static final Item RAW_POOP = new Item(new FabricItemSettings().group(ItemGroup.MISC));

	public static final Item POOP_KNIFE = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier("poopknife", "raw_poop"), RAW_POOP);
		Registry.register(Registry.ITEM, new Identifier("poopknife", "poop_knife"), POOP_KNIFE);

		LOGGER.info("Poop Knife is Initialising!");
	}
}
