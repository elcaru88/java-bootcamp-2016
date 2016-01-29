package practice1;

public interface ShoppingCartService {

	public void addItem(Item item);
	public void removeItem(Item item);
	public void clearCart();
	public int viewCart();
	public int getTotal();
	
}
