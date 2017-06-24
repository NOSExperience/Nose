package tk.fmmc.nose.network.message;

import java.io.IOException;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import tk.fmmc.nose.network.Downloader;
import tk.fmmc.nose.registration.Discoverer;

public class Wrapper {
	
	public static final SimpleNetworkWrapper INSTANCE =
			NetworkRegistry.INSTANCE.newSimpleChannel("nose");
	
	public static void init() {
		INSTANCE.registerMessage(NoseRefreshHandler.class, NoseRefresh.class, 0, Side.CLIENT);
	}
	
	public static void pushUpdate() {
		INSTANCE.sendToAll(new NoseRefresh(0));
		
		try {
			Downloader.download();
			
			Discoverer ds = new Discoverer();
			ds.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
