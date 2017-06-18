package tk.fmmc.nose.registration;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Registrar {

	private static Material DEFAULT_MATERIAL = Material.ROCK;
	private static CreativeTabs DEFAULT_INVENTORY_TAB = CreativeTabs.MISC;
	
	public static void register(ItemSpecification spec) {
		if(spec.getItemType() == ItemType.BLOCK) {
			registerBlock(spec);
		} else if(spec.getItemType() == ItemType.ITEM) {
			registerItem(spec);
		}
	}
	
	private static void registerBlock(ItemSpecification spec) {
		if(spec.getRegistryName() == null) {
			return; //Fails
		}
		
		Material mat = DEFAULT_MATERIAL;
		
		if(spec.getMaterialName() != null) {
			mat = parseMaterial(spec.getMaterialName());
		}
		
		Block block = new Block(mat)
					.setRegistryName(spec.getRegistryName());
		
		GameRegistry.register(block);
		
//		try {
//			ItemBlock item = new ItemBlock(block);
//			//item.setRegistryName(spec.getRegistryName());
//			if(spec.getInventoryTab() != null) {
//				item.setCreativeTab(parseInventoryTab(spec.getInventoryTab()));
//			}
//			item.setUnlocalizedName(spec.getRegistryName());
//			
//			GameRegistry.register(item);
//		} catch(Exception e) {
//			System.err.println(e.getMessage());
//			e.printStackTrace();
//		}
	}
	
	private static void registerItem(ItemSpecification spec) {
		
	}
	
	private static Material parseMaterial(String matStr) {
		if(matStr.equals("grass")) {
			return Material.GRASS;
		} else if(matStr.equals("ground")) {
			return Material.GROUND;
		} else if(matStr.equals("wood")) {
			return Material.WOOD;
		} else if(matStr.equals("rock")) {
			return Material.ROCK;
		} else if(matStr.equals("iron")) {
			return Material.IRON;
		} else if(matStr.equals("anvil")) {
			return Material.ANVIL;
		} else if(matStr.equals("water")) {
			return Material.WATER;
		} else if(matStr.equals("lava")) {
			return Material.LAVA;
		} else if(matStr.equals("leaves")) {
			return Material.LEAVES;
		} else if(matStr.equals("plants")) {
			return Material.PLANTS;
		} else if(matStr.equals("vine")) {
			return Material.VINE;
		} else if(matStr.equals("sponge")) {
			return Material.SPONGE;
		} else if(matStr.equals("cloth")) {
			return Material.CLOTH;
		} else if(matStr.equals("fire")) {
			return Material.FIRE;
		} else if(matStr.equals("sand")) {
			return Material.SAND;
		} else if(matStr.equals("circuits")) {
			return Material.CIRCUITS;
		} else if(matStr.equals("materialCarpet")) {
			return Material.CARPET;
		} else if(matStr.equals("glass")) {
			return Material.GLASS;
		} else if(matStr.equals("redstoneLight")) {
			return Material.REDSTONE_LIGHT;
		} else if(matStr.equals("tnt")) {
			return Material.TNT;
		} else if(matStr.equals("coral")) {
			return Material.CORAL;
		} else if(matStr.equals("ice")) {
			return Material.ICE;
		} else if(matStr.equals("snow")) {
			return Material.SNOW;
		} else {
			return DEFAULT_MATERIAL;
		}
	}
	
	private static CreativeTabs parseInventoryTab(String tabStr) {
		if(tabStr.equals("blocks")) {
			return CreativeTabs.BUILDING_BLOCKS;
		} else if(tabStr.equals("decoration")) {
			return CreativeTabs.DECORATIONS;
		} else if(tabStr.equals("redstone")) {
			return CreativeTabs.REDSTONE;
		} else if(tabStr.equals("transportation")) {
			return CreativeTabs.TRANSPORTATION;
		} else if(tabStr.equals("misc")) {
			return CreativeTabs.MISC;
		} else if(tabStr.equals("food")) {
			return CreativeTabs.FOOD;
		} else if(tabStr.equals("tools")) {
			return CreativeTabs.TOOLS;
		} else if(tabStr.equals("combat")) {
			return CreativeTabs.COMBAT;
		} else if(tabStr.equals("brewing")) {
			return CreativeTabs.BREWING;
		} else if(tabStr.equals("materials")) {
			return CreativeTabs.MATERIALS;
		} else {
			return DEFAULT_INVENTORY_TAB;
		}
	}
}
