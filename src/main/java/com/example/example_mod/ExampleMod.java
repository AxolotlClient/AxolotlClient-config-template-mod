package com.example.example_mod;

import com.example.example_mod.config.ExampleConfig;
import io.github.axolotlclient.AxolotlclientConfig.AxolotlClientConfigManager;
import io.github.axolotlclient.AxolotlclientConfig.options.BooleanOption;
import io.github.axolotlclient.AxolotlclientConfig.options.ColorOption;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Example Mod");

	public static final String modid = "example_mod";

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());

		ExampleConfig config = new ExampleConfig();
		config.getCategories().forEach(optionCategory -> {
			optionCategory.add(new BooleanOption("someBooleanOption", false),
					new ColorOption("Some Color Option", "#FF335500"),
					new BooleanOption("Some Boolean Option with callback",
							value -> System.out.println("Callback option changed to: "+value),
							false));
		});

		AxolotlClientConfigManager.registerConfig(modid, config);
        AxolotlClientConfigManager.save(modid);
	}
}
