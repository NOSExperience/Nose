package tk.fmmc.nose.main;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tk.fmmc.nose.network.beta.PacketHandler;

public class CommonProxy {

	@EventHandler
	void preInit(FMLPreInitializationEvent e) throws Exception {
		PacketHandler.preInit();		
	}
	
	@EventHandler
	void init(FMLInitializationEvent e) {
	}
	
	@EventHandler
	void postInit(FMLPostInitializationEvent e) throws Exception {
	}
	
}
