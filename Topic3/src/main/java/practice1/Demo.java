package practice1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShoppingCartServiceImp scart = new ShoppingCartServiceImp();
		
		Item item1 = new Item("dsfsf",10,"3");
		
		scart.addItem(item1);
		
		scart.viewCart();
		int a = scart.updateCart();
		System.out.println(a);
	}

}
