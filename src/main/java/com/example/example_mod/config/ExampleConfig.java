package com.example.example_mod.config;

import com.example.example_mod.ExampleMod;
import io.github.axolotlclient.AxolotlclientConfig.ConfigHolder;
import io.github.axolotlclient.AxolotlclientConfig.options.OptionCategory;

import java.util.ArrayList;
import java.util.List;

public class ExampleConfig extends ConfigHolder {

	public static final OptionCategory exampleCategory = new OptionCategory(ExampleMod.modid);
	public static final OptionCategory exampleCategory2 = new OptionCategory("Other "+ ExampleMod.modid);
	public static final OptionCategory exampleCategory3 = new OptionCategory("Other "+ "Other "+ExampleMod.modid);
	public static final OptionCategory exampleCategory4 = new OptionCategory("Other "+"Other "+"Other "+ExampleMod.modid);

	@Override
	public List<OptionCategory> getCategories() {
		ArrayList<OptionCategory> list = new ArrayList<>();
		list.add(exampleCategory);
		list.add(exampleCategory2);
		list.add(exampleCategory3);
		list.add(exampleCategory4);
		return list;
	}
}
