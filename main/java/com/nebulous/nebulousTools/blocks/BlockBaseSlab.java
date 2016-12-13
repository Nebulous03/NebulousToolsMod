package com.nebulous.nebulousTools.blocks;

import com.nebulous.nebulousTools.NebulousTools;
import com.nebulous.nebulousTools.items.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockBaseSlab extends BlockSlab implements ItemModelProvider{

	protected String name;
	
	public BlockBaseSlab(Material material, String name) {
		super(material);
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

	@Override
	public String getUnlocalizedName(int meta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDouble() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IProperty<?> getVariantProperty() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		// TODO Auto-generated method stub
		return null;
	}

}
