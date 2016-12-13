package com.nebulous.nebulousTools.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockBaseSlab_Double extends BlockBaseSlab{

	public BlockBaseSlab_Double(Material material, String name) {
		super(material, name);
	}

	@Override
	public boolean isDouble() {
		return true;
	}


}
