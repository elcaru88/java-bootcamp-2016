package practice1;

public interface ShoppingCartService {

	public void addItem(Item item);
	public void removeItem(int itemId);
	public int updateCart();
	public void clearCart();
	public void viewCart();
	
}
