class AmazonRunner{

    public static void main(String[] products){
	
	    boolean productAdded = Amazon.createProductName("DishWash");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Study Table");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Jacket");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Air Conditioner");
		System.out.println("Product Name added " + productAdded);
		
	    productAdded = Amazon.createProductName("MicroOven");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Laptop");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Digital Television");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Mobile Phones");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Kitchen Appliances");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Iron Box");
		System.out.println("Product Name added " + productAdded);
		
		
		Amazon.readProductDetails();
		
		boolean updatedPruduct = Amazon.updateAmazon("Iron Box","Bag");
			System.out.println(updatedPruduct + "product is updated");
			
			
		Amazon.readProductDetails();
		
		boolean deletedprod=Amazon.deleteProduct("Digital Television");
			System.out.println("deleted product is" + deletedprod);
			
			
		Amazon.readProductDetails();
	
	}

}