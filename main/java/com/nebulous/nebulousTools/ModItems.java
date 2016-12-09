package com.nebulous.nebulousTools;

import com.nebulous.nebulousTools.blocks.SparkyStick;
import com.nebulous.nebulousTools.items.ItemBase;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static void addItems(){
		ItemBase nebulousIngot;
		SparkyStick nebulousSparky;
		nebulousIngot = register(new ItemBase("nebulous_ingot"));
		nebulousSparky = register(new SparkyStick("nebulous_sparky"));
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel(item);
		}

		return item;
	}

}
