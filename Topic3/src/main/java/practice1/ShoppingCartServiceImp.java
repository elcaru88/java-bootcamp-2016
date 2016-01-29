package practice1;

import java.util.ArrayList;



import practice2.ActionsItem;

public class ShoppingCartServiceImp implements ShoppingCartService {

	public ShoppingCartServiceImp() {
		super();
	}

	private static int total;
	
	protected ActionsItem actionsItem;
	
	public ActionsItem getItem() {
		return actionsItem;
	}
	public void setActionsItem(ActionsItem actionsItem) {
		this.actionsItem = actionsItem;
	}
	
	static ArrayList<Item> scart;
	
	public static ArrayList<Item> getInstance(){
		if (scart==null){
			scart = new ArrayList<Item>();
			total = 0;
		}
		return scart;
	}
	
	
	public void addItem(Item item) {
	
		ArrayList<Item> scart = ShoppingCartServiceImp.getInstance();
		
		scart.add(item);
						
	}
	
	
	public void removeItem(int itemId) {

		ArrayList<Item> scart = ShoppingCartServiceImp.getInstance();
		
		scart.remove(itemId);
		
	
	}

	public int updateCart() {
		
		ArrayList<Item> scart = ShoppingCartServiceImp.getInstance();
		
		for (Item position : scart){
			total += position.getItemPrice();
		}
		
		return total;
	}

	public void clearCart() {

		ArrayList<Item> scart = ShoppingCartServiceImp.getInstance();

		scart.clear();
		
	}

	public ArrayList<Item> viewCart() {
	
		ArrayList<Item> scart = ShoppingCartServiceImp.getInstance();

		System.out.println("Total price cart: " + total);
		
		return scart;
	}
	
				
}
