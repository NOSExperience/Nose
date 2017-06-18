package tk.fmmc.nose.registration;

public class ItemSpecification {

	private ItemType itemType;
	private String registryName;
	private String materialName;
	private String inventoryTab;
	
	public ItemSpecification(ItemType iType, String rName, String mName, String iTab) {
		this.itemType = iType;
		this.registryName = rName;
		this.materialName = mName;
		inventoryTab = iTab;
	}

	public ItemType getItemType() {
		return itemType;
	}
	
	public String getRegistryName() {
		return registryName;
	}

	public String getMaterialName() {
		return materialName;
	}
	
	public String getInventoryTab(){
		return inventoryTab;
	}
}
