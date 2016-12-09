package com.nebulous.nebulousTools.proxy;

import com.nebulous.nebulousTools.NebulousTools;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerItemRenderer(Item item, int meta, String path) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(NebulousTools.MODID + ":" + path, "inventory"));
	}
	
}
