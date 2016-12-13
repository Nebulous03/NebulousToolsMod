package com.nebulous.nebulousTools.blocks;

import com.nebulous.nebulousTools.items.ItemBase;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
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
	protected short cooldown = 0;
	
	public FlightRing(String name) {
		super(name);
	}
	
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
		if(cooldown > 0) cooldown--;
		super.onUpdate(stack, world, entity, itemSlot, isSelected);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer player, EnumHand hand) {
		if(player.capabilities.allowFlying)player.fallDistance = 0.0f;
		if(cooldown == 0){
			enabled = !enabled;
			System.out.println("Enabled: " + enabled);
			player.capabilities.allowFlying = enabled;
			cooldown = 10;
		} return super.onItemRightClick(itemStack, world, player, hand);
	}
}
