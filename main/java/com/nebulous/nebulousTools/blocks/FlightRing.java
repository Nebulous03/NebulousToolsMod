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

public class FlightRing extends ItemBase {
	
	protected boolean enabled = false;
	protected short cooldown = 100;

	public FlightRing(String name) {
		super(name);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		
		playerIn.setNoGravity(!enabled);
		System.out.println("Enabled: " + enabled);
		
		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}
}
