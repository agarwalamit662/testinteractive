package testinteractive;

import java.util.ArrayList;
import java.util.List;

public enum ItemType {
	DEPARTMENTAL("Departmental"),
	PROJECT_SPECIFIC("Project");
	
	private String itemCode;
	
	private ItemType(String dbCode){
		this.itemCode = dbCode;
	}
	
	public String getItemCode() {
		return itemCode;
	}
	
	
	

}

class Box{
	
	public Box(int a){
		
	}
	
	public Box(int a,int b){
		
	}
	
}

class Tree extends Plant{
	
	
	
}

class Plant{
	
}
class Test{
	public static void main(String[] args){
		//ItemType it = new ItemType("Project");
		
		ItemType it = ItemType.valueOf("DEPARTMENTAL");
		ItemType its = ItemType.values()[0];
		ItemType itss = ItemType.DEPARTMENTAL;
		
		/*List<Plant> plants = new ArrayList<Plant>();
		plants.add(new Plant());
		
		List<? extends Plant> trees = plants;
		Plant plant = trees.get(0);*/
		
		List<Tree> trees = new ArrayList<Tree>();
		trees.add(new Tree());
		
		List<? extends Plant> plants = trees;
		Tree tree = (Tree) plants.get(0);
		
		//Box b = new Box();
		
	}
	
	
	
}
