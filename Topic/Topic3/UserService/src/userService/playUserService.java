package userService;

public class playUserService {
		
	    public static void main(String[] args) {  
	    	
	    	CrudOperationsImp insert = new CrudOperationsImp(); 
	        insert.insert_statement();
	        
	    	CrudOperationsImp update = new CrudOperationsImp(); 
	        update.update_statement();
	        
	    	CrudOperationsImp select = new CrudOperationsImp(); 
	        select.select_statement();
	        
	    	CrudOperationsImp delete = new CrudOperationsImp(); 
	        delete.delete_statement();
	        
	    }
    
}

