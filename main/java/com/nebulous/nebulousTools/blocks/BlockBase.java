package com.nebulous.nebulousTools.blocks;

import com.nebulous.nebulousTools.NebulousTools;
import com.nebulous.nebulousTools.items.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockBase extends Block implements ItemModelProvider{
	
	protected String name;

	public BlockBase(Material materialIn, String name) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.name = name;
	}

	@Override
	public void registerItemModel(Item itemBlock) {
		NebulousTools.proxy.registerItemRenderer(itemBlock, 0, name);
		
	}
	
	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
