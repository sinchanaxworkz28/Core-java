class dolls{

	public static void main(String[] toy){
	fetchProductDetails();
	}


    public static void fetchProductDetails(){
	System.out.println("Fetch Product Details started");
	String brandName = "SHINETOY ENTERTAIN KIDS";
    double minimumManufacturerAgeRecommended = 36.0;
	int numberOfPieces	= 40;
	String theme = "City Building";
	String cartoonCharacter = "Russian Puzzle";
		
	
	System.out.println("The Brand Name is "+ brandName);
	System.out.println("The Minimum Manufacturer Age Recommended is "+ minimumManufacturerAgeRecommended  );
	System.out.println("The Number of Pieces "+ numberOfPieces);
	System.out.println("The Theme is "+  theme);
	System.out.println("The Cartoon Character is "+  cartoonCharacter);
	System.out.println("Fetch Product Details ended");
	return;
	}

}