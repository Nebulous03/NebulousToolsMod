package com.nebulous.nebulousTools.events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModEvents {
	
	@SubscribeEvent
	public void onLivingFallEvent(LivingFallEvent event) {
//		if (event.getEntity() != null && event.getEntity() instanceof EntityPlayer) {
//				EntityPlayer player = (EntityPlayer)event.getEntity();
//				event.setCanceled(true);
//		}
	}

}
