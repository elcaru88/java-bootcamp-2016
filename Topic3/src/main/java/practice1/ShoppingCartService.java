package practice1;

public interface ShoppingCartService {

	public void addItem(Item item);
	public int removeItem(Item item);
	public void clearCart();
	public int viewCart();
	public int getTotal();
	
}
