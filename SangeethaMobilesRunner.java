class SangeethaMobilesRunner{

	public static void main(String[] mobiles){
	System.out.println("Mobile brand started");
	
	String brand = "OnePluse 10R";
	double price = SangeethaMobiles.getMobilePriceByBrand(brand);
	System.out.println( brand +  " Mobile amount is :" + price);
	
	System.out.println("Mobile brand ended");
	}


}