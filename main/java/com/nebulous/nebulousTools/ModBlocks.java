package com.nebulous.nebulousTools;

import com.nebulous.nebulousTools.blocks.BlockBase;
import com.nebulous.nebulousTools.items.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static void addBlocks(){
		BlockBase testBlock;
		testBlock = register(new BlockBase(Material.ANVIL, "nebulous_block").setCreativeTab(CreativeTabs.REDSTONE));
	}
	
	 private static <T extends Block> T register (T block, ItemBlock itemBlock) {
		 
		 GameRegistry.register(block);
		 if(itemBlock != null) {
		 GameRegistry.register(itemBlock);
		 }
		 
		 if(block instanceof ItemModelProvider) {
		 ((ItemModelProvider)block).registerItemModel(itemBlock);
		 }
		 
		 return block;
		 }
		 
		 private static <T extends Block> T register(T block) {
		 ItemBlock itemBlock = new ItemBlock(block);
		 itemBlock.setRegistryName(block.getRegistryName());
		 return register(block, itemBlock);
	}
}
