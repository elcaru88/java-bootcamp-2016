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
		int i = 0;
		
		for (Item position : scart){
			
			if (position.getItemId() == item.getItemId()){
				scart.remove(i);
			}
			i++;
		}

		total -= item.getItemPrice();

	}

	public void clearCart() {

		ArrayList<Item> scart = ShoppingCartServiceImp.getInstance();

		scart.clear();
		
		total = 0;
		
	}

	public int viewCart() {
	
		ArrayList<Item> scart = ShoppingCartServiceImp.getInstance();

		if(scart.isEmpty()) {
			System.out.println("Cart is empty.");
			return -1;
		} else {
		for (Item position : scart){
			System.out.println(position.toString());
		}
		}
		return 0;
	}
	
	public int getTotal() {
		
		return total;
	}
	
}
