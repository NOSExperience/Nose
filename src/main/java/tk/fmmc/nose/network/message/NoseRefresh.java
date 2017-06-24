package tk.fmmc.nose.network.message;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class NoseRefresh implements IMessage {

	public int toSend;
	
	public NoseRefresh() {}

	public NoseRefresh(int toSend) {
		this.toSend = toSend;
	}
	
	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(toSend);
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		toSend = buf.readInt();
	}
}
