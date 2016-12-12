package com.nebulous.nebulousTools;

import com.nebulous.nebulousTools.events.ModEvents;
import com.nebulous.nebulousTools.proxy.CommonProxy;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = NebulousTools.NAME, modid = NebulousTools.MODID, version = NebulousTools.VERSION)

public class NebulousTools{
	
	public static final String NAME = "NebulousTools";
    public static final String MODID = "nebuloustools";
    public static final String VERSION = "0.1";
    
    @Mod.Instance(MODID)
	public static NebulousTools instance;
    
    @SidedProxy(serverSide = "com.nebulous.nebulousTools.proxy.CommonProxy", clientSide = "com.nebulous.nebulousTools.proxy.ClientProxy")
    public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(NAME + " is (pre)initializing...");
		ModItems.addItems();
		ModBlocks.addBlocks();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModEvents events = new ModEvents();
		FMLCommonHandler.instance().bus().register(events);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
