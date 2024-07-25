import java.util.Arrays;

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

	public static boolean updateAmazon(String oldProduct,String newProduct){
			boolean isProductUpdated = false;
			for(int position=0;position<productNames.length;position++){
				if(productNames[position]== oldProduct){
					productNames[position]=newProduct;
					position++;
					isProductUpdated=true;
				}
			}
			if(isProductUpdated=false)
				System.out.println("Juice name found");
			
			return isProductUpdated;
	}


	public static boolean deleteProduct(String productName){
		boolean isProductDeleted = false;
		int position,newPosition;
		for(position=0,newPosition=0;position<productNames.length;position++){
			if(productNames[position]!=productName){
				productNames[newPosition]=productNames[position];
				newPosition++;
				
			}
				else
					isProductDeleted=true;
				
			int newLength=newPosition;
			productNames=Arrays.copyOf(productNames,newLength);
			
			if(isProductDeleted=false)
				System.out.println(productNames + "not found");
		}	
			return isProductDeleted;
			
		}

}