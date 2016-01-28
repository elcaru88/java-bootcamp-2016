package practice1;

import java.util.ArrayList;

public class ShoppingCartServiceImp implements ShoppingCartService {

	protected ShoppingCartServiceImp() {
		super();
	}

	private static int total;
	
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
		
		updateCart();
	}

	public void removeItem(int itemId) {

		ArrayList<Item> scart = ShoppingCartServiceImp.getInstance();
		
		scart.remove(itemId);
		
		updateCart();
	}

	public void updateCart() {
		
		ArrayList<Item> scart = ShoppingCartServiceImp.getInstance();
		
		while (scart.iterator().hasNext()){
			total += scart.iterator().next().getItemPrice();
		}
	}

	public void clearCart() {

		ArrayList<Item> scart = ShoppingCartServiceImp.getInstance();

		scart.clear();
		
	}

	public void viewCart() {
	
		ArrayList<Item> scart = ShoppingCartServiceImp.getInstance();

		scart.toArray();
		
		System.out.println("Total cart:" + total);
		
	}
			
}
