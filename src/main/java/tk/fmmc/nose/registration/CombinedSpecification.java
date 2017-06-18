package tk.fmmc.nose.registration;

import java.util.List;

public class CombinedSpecification {

	private List<ItemSpecification> items;
	private List<ItemSpecification> blocks;
	
	public CombinedSpecification(List<ItemSpecification> itemList, List<ItemSpecification> blockList) {
		this.items = itemList;
		this.blocks = blockList;
	}
	
	public List<ItemSpecification> getItems() {
		return items;
	}
	
	public void selfRegister() {
		for(ItemSpecification i : items) {
			//System.out.println("Item : " + i.getRegistryName() + ": " + i.getEnglishName());
			System.out.println("Item : " + i.getRegistryName());
			
			Registrar.register(i);
		}
		
		for(ItemSpecification i : blocks) {
			//System.out.println("Block: " + i.getRegistryName() + ": " + i.getEnglishName() + " [" + i.getMaterialName() + "]");
			System.out.println("Block: " + i.getRegistryName() + " [" + i.getMaterialName() + "]");
			
			Registrar.register(i);
		}
	}
}
