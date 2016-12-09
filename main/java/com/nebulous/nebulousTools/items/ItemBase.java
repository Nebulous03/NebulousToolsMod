package com.nebulous.nebulousTools.items;

import com.nebulous.nebulousTools.NebulousTools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements ItemModelProvider{
	 
	 protected String name;
	 
	 public ItemBase(String name) {
		 this.name = name;
		 setUnlocalizedName(name);
		 setRegistryName(name);
	 }
	 
	 @Override
	 public void registerItemModel(Item item) {
		 NebulousTools.proxy.registerItemRenderer(this, 0, name);
	 }
	 
	 @Override
	 public ItemBase setCreativeTab(CreativeTabs tab) {
		 super.setCreativeTab(tab);
		 return this;
	 }

}
