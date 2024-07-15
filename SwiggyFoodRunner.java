class SwiggyFoodRunner{

	public static void main(String[] tastyFood){
	
	System.out.println("Food menu started");
	String food = "Shahi Veg Biryani & Kebab Combo";
	double price = SwiggyFood.getFoodPiceByName(food);
	System.out.println( food +  " Food price is :" + price);
	System.out.println("Food Menu ended");
	
	}
}