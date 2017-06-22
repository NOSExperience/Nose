package tk.fmmc.nose.network.beta;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.resources.data.IMetadataSectionSerializer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class NoseRefresh implements IMessage {

	public NoseRefresh() {}
	
	private int toSend;
	public NoseRefresh(int toSend) {
		this.toSend = toSend;
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		buf.writeInt(toSend);	//Stupid Int (tm)	
	}

	@Override
	public void toBytes(ByteBuf buf) {
		toSend = buf.readInt();		
	}
	
	public class MessageHandler implements IMessageHandler<NoseRefresh, IMessage> {
		public MessageHandler() {}
		
		@Override
		public IMessage onMessage(NoseRefresh message, MessageContext ctx) {
			EntityPlayerMP serverPlayer = ctx.getServerHandler().playerEntity;
			
			int value = message.toSend;
			serverPlayer.inventory.addItemStackToInventory(new ItemStack(Items.DIAMOND, value));
			
			return null;
		}
	}
}