package com.nebulous.nebulousTools.blocks;

import com.nebulous.nebulousTools.items.ItemBase;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SparkyStick extends ItemBase {

	public SparkyStick(String name) {
		super(name);
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		
		System.out.println("SPARKY!!!!!!");
		EntityLightningBolt bolt = new EntityLightningBolt(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, false);
		worldIn.spawnEntityInWorld(bolt);
		bolt.setPosition(playerIn.posX, playerIn.posY, playerIn.posZ);
		
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
	
}
