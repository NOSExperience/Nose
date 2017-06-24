package tk.fmmc.nose.main;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy extends CommonProxy {

	@Override
	void preInit(FMLPreInitializationEvent e) throws Exception {
		super.preInit(e);
	}

	@Override
	void init(FMLInitializationEvent e) {
		super.init(e);
		MinecraftForge.EVENT_BUS.register(new ServerTickHandler());
	}

	@Override
	void postInit(FMLPostInitializationEvent e) throws Exception {
		super.postInit(e);
	}

}
