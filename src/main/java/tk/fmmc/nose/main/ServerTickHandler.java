package tk.fmmc.nose.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ServerTickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import tk.fmmc.nose.network.Downloader;
import tk.fmmc.nose.network.message.Wrapper;

@SideOnly(Side.SERVER)
public class ServerTickHandler {
	
	private static final int 	RESPONSE_TIME = 150;
	private static final String SCRIPT = "priv/getupdate.php";
	
	private int x = 0;
	
	@SubscribeEvent
	public void onServerTick(ServerTickEvent e) {
		x++;
		
		if(x % RESPONSE_TIME == 0) {
			respond();
		}
	}
	
	private void respond() {
		try {
			BufferedReader flag = new BufferedReader(
					new InputStreamReader(
						new URL(Downloader.SITE + SCRIPT).openStream()
					)
			);
			
			String response = flag.readLine();
			if(response.equals("1")) {
				System.out.println("NEEDS UPDATE");
				
				Wrapper.pushUpdate();
			}
		} catch(Exception e) {
			System.err.println("Failed to check for update!: " + e.getMessage());
		}
	}
}
