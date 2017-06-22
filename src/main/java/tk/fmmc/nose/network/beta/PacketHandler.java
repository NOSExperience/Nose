package tk.fmmc.nose.network.beta;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class PacketHandler {
	public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel("nose");
	
	private static int id = 0;
	
	public PacketHandler() {}
	
	public static void preInit() {
		INSTANCE.registerMessage(NoseRefresh.MessageHandler.class, NoseRefresh.class, id++, Side.CLIENT);
	}
}

