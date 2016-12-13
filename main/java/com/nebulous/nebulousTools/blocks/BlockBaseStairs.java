package com.nebulous.nebulousTools.blocks;

import com.nebulous.nebulousTools.NebulousTools;
import com.nebulous.nebulousTools.items.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockBaseStairs extends BlockStairs implements ItemModelProvider{

	protected String name;
	
	public BlockBaseStairs(IBlockState modelState, String name) {
		super(modelState);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	@Override
	public void registerItemModel(Item itemBlock) {
		NebulousTools.proxy.registerItemRenderer(itemBlock, 0, name);
		
	}
	
	@Override
	public Block setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
