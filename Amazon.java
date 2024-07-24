class Amazon{

    static String productNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int start ;
	
	public static boolean createProductName(String productName){
	
	    boolean isProductNameAdded = false ;
		
		isProductNameAdded = validatingProductNameDetails(productName);
		
		return isProductNameAdded ;
	}
	
	public static boolean validatingProductNameDetails(String productName){
	
	    boolean isAllFieldValidated = false ;
		if(start<productNames.length){
		if(productName!=null){
		    productNames[start++] = productName ;
			isAllFieldValidated = true;
		}
		else
		    System.out.println("Product Name is Invalid");
		}else
		    System.out.println("Sorry.. Product are not available");
			
		return isAllFieldValidated ;
		
		
		
		}
		
		public static void readProductDetails(){
		    System.out.println("The Product Name is :");
			for(String productName : productNames){
			    System.out.println(productName);
			}
		}




}