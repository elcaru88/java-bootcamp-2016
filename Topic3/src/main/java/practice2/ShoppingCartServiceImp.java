package practice2;

import java.util.ArrayList;

import practice1.Item;
import practice1.ShoppingCartService;

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
		
		total += item.getItemPrice();
	}
	
	
	public void removeItem(Item item) {

		ArrayList<Item> scart = ShoppingCartServiceImp.getInstance();
		
		total -= item.getItemPrice();
		
		scart.remove(item);
				
	}

	public void clearCart() {

		ArrayList<Item> scart = ShoppingCartServiceImp.getInstance();

		scart.removeAll(scart);
		
	
		
	}

	public int viewCart() {
	
		ArrayList<Item> scart = ShoppingCartServiceImp.getInstance();

		for (Item position : scart){
			System.out.println(position.toString());
		}
		
		return 0;
	}
	
	public int getTotal() {
		
		return total;
	}
	
}
