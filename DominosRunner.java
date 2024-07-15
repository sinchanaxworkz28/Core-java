class DominosRunner{

	public static void main(String[] tastyFood){
	
	System.out.println("Dominos menu started");
	String food = "Blazing Onion & Paprika";
	double price = Dominos.getFoodPiceByName(food);
	System.out.println( food +  " Food price is :" + price);
	System.out.println("Dominos Menu ended");
	
	}
}