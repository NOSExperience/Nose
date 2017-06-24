package tk.fmmc.nose.network.message;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class Wrapper {
	
	public static final SimpleNetworkWrapper INSTANCE =
			NetworkRegistry.INSTANCE.newSimpleChannel("nose");
	
	public static void init() {
		INSTANCE.registerMessage(NoseRefreshHandler.class, NoseRefresh.class, 0, Side.CLIENT);
	}
	
}
