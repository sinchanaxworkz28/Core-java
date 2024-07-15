class ZomatoFoodRunner{

	public static void main(String[] tastyFood){
	
	System.out.println("Food menu started");
	String food = "Sugar Free Classic Cold Coffee";
	double price = ZomatoFood.getFoodPiceByName(food);
	System.out.println( food +  " Food price is :" + price);
	System.out.println("Food Menu ended");
	
	}
}