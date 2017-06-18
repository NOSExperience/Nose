package tk.fmmc.nose.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import tk.fmmc.nose.network.Downloader;
import tk.fmmc.nose.registration.Discoverer;

public class GetCommand implements ICommand {

	@Override
	public int compareTo(ICommand arg0) {
		return 0;
	}

	@Override
	public String getName() {
		return "get";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return "/get";
	}

	@Override
	public List<String> getAliases() {
		return new ArrayList<>();
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		sender.sendMessage(new TextComponentString("Downloading..."));
		
		try {
			Downloader.download();
			
			Discoverer ds = new Discoverer();
			ds.run();
		} catch (Exception e) {
			throw new CommandException("Error downloading", "err");
		}
	}

	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
		return true;
	}

	@Override
	public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args,
			BlockPos targetPos) {
		return new ArrayList<>();
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		return false;
	}

}
