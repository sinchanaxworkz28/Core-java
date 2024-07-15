class NandiniProductsRunner{

	public static void main(String[] milkProducts){
	System.out.println("Nandini Products started");
	String products = "Milk";
	double price = NandiniProducts.getProductsPriceByName(products);
	System.out.println(products + "  price is " + price);
	System.out.println("Nandini Products ended");
	}
}