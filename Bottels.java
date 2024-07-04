class Bottels{
	
	public static void main (String[] thermoSteel){
	fetchProductDetails();
	}

	public static void fetchProductDetails(){
	System.out.println("Fetch Product Details started");
	String brandName = "Pegion";
	String material = "StainlessSteel";
	String bottleType = "Wide-neck";
	String color = "Silver";
	int capacity = 700;
	
	System.out.println("The Brand Name is " + brandName);
	System.out.println("The Material is " + material);
	System.out.println("The bottle Type is " + bottleType);
	System.out.println("The color is " + color);
	System.out.println("The Capacity is " + capacity);
	System.out.println("Fetch Product Details ended");
	return;
	}
}