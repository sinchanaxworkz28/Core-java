class FoodPandaRunner{

	public static void main(String[] tastyFood){
	
	System.out.println("Food menu started");
	String food = "Tops Plain Noodles";
	double price = FoodPanda.getFoodPiceByName(food);
	System.out.println( food +  " Food price is :" + price);
	System.out.println("Food Menu ended");
	
	}
}