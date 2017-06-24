package tk.fmmc.nose.network.message;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class NoseRefreshHandler implements IMessageHandler<NoseRefresh, IMessage> {

	public NoseRefreshHandler() {}
	
	@Override
	public IMessage onMessage(NoseRefresh message, MessageContext ctx) {
		//EntityPlayerMP serverPlayer = ctx.getServerHandler().playerEntity;
		
		//int amount = message.toSend;
		//serverPlayer.inventory.addItemStackToInventory(new ItemStack(Items.DIAMOND, amount));
		
		System.out.println("TEST: NoseRefreshHandler");
		
		return null;
	}
}
