class Airpods{
	public static void main (String[] args){
	fetchProductDetails();
	}

	
	public static void fetchProductDetails(){
	System.out.println("Fetch Product Details started");
	
	String brandName = "boAt";
	String color = "Black";
	int price = 999;
    String earPlacement = "In Ear";
	String formFactor =	"In Ear";
	String noiseControl = "None";
	
	
	System.out.println("The Brand Name is " + brandName);
	System.out.println("The Color is "+ color);
	System.out.println("The Price is "+ price);
	System.out.println("The Ear Placement is"+ earPlacement );
	System.out.println("The Form Factor" + formFactor);
	System.out.println("The Noise Control"+ noiseControl);
	System.out.println("Fetch Product Details ended");
	return;
	}
}