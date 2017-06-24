package tk.fmmc.nose.network.message;

import javax.xml.parsers.ParserConfigurationException;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import tk.fmmc.nose.network.Downloader;
import tk.fmmc.nose.registration.Discoverer;

public class NoseRefreshHandler implements IMessageHandler<NoseRefresh, IMessage> {

	public NoseRefreshHandler() {}
	
	@Override
	public IMessage onMessage(NoseRefresh message, MessageContext ctx) {
		//EntityPlayerMP serverPlayer = ctx.getServerHandler().playerEntity;
		
		//int amount = message.toSend;
		//serverPlayer.inventory.addItemStackToInventory(new ItemStack(Items.DIAMOND, amount));
		
		System.out.println("TEST: NoseRefreshHandler");
		
		try {
			Downloader.download();
			
			Discoverer ds = new Discoverer();
			ds.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}
}
