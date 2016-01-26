package shoppingCartService;

public class CartServiceMainClass {
 
	    public static void main(String[] args) {  
	    	
	        CartService service = FactoryCartService.getLocalService();  
	        service.addShop();  

	        CartService service1 = FactoryCartService.getLocalService();  
	        service1.endShop();  
	        
	    }  
	  
	}

