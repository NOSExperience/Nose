package tk.fmmc.nose.main;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	@Override
	void preInit(FMLPreInitializationEvent e) throws Exception {
		super.preInit(e);
		
		System.out.println("\n\n\nPREINIT\n\n\n");
		
		/*
		Block b = new Block(Material.GROUND).setRegistryName("test");
		b.setUnlocalizedName("test");
		b.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		GameRegistry.register(b);
		ItemBlock i = new ItemBlock(b);
		i.setRegistryName("test");
		//i.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		GameRegistry.register(i);
		
		Item i2 = new Item();
		i2.setRegistryName("testitem2");
		i2.setUnlocalizedName("testitem2");
		i2.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		GameRegistry.register(i2);
		*/
	}

	@Override
	void init(FMLInitializationEvent e) {
		super.init(e);
	}

	@Override
	void postInit(FMLPostInitializationEvent e) throws Exception {
		super.postInit(e);
	}
}
