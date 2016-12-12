package com.nebulous.nebulousTools.blocks;

import com.nebulous.nebulousTools.NebulousTools;
import com.nebulous.nebulousTools.items.ItemModelProvider;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockContainerBase extends BlockContainer implements ItemModelProvider{

	protected String name;

	public BlockContainerBase(Material materialIn, String name) {
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
	public BlockContainerBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return null;
	}
	
}
