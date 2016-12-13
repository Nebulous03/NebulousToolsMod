package com.nebulous.nebulousTools;

import com.nebulous.nebulousTools.blocks.FlightRing;
import com.nebulous.nebulousTools.blocks.SparkyStick;
import com.nebulous.nebulousTools.items.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static void addItems(){
		ItemBase nebulousIngot = (ItemBase) register(new ItemBase("nebulous_ingot").setCreativeTab(CreativeTabs.REDSTONE));
		SparkyStick nebulousSparky = (SparkyStick) register(new SparkyStick("nebulous_sparky").setCreativeTab(CreativeTabs.REDSTONE));
		FlightRing flightRing = (FlightRing) register(new FlightRing("nebulous_flightRing").setCreativeTab(CreativeTabs.REDSTONE));
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel(item);
		}

		return item;
	}

}
