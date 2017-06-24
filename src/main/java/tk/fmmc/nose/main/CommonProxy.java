package tk.fmmc.nose.main;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tk.fmmc.nose.network.Downloader;
import tk.fmmc.nose.network.message.Wrapper;
import tk.fmmc.nose.registration.Discoverer;

public class CommonProxy {

	@EventHandler
	void preInit(FMLPreInitializationEvent e) throws Exception {
		Wrapper.init();
		
		Downloader.download();
		
		Discoverer ds = new Discoverer();
		ds.run();
	}
	
	@EventHandler
	void init(FMLInitializationEvent e) {
	}
	
	@EventHandler
	void postInit(FMLPostInitializationEvent e) throws Exception {
	}
	
}
