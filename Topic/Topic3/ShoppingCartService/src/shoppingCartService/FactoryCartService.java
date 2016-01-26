package shoppingCartService;

public class FactoryCartService {
	 
	    private FactoryCartService() {}  
	  
	    public static CartService getLocalService(){ 
	    	
	        return new CartServiceImp();  
	        
	    } 

}
