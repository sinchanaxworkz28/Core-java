class Zomato{

	public static double searchFood(String foodName){
	double foodPrice = 0.0;
	if("Biryani"== foodName) return foodPrice = 250.0;
	else{
		System.out.println("not found");
	}
	return foodPrice;
}
	public static double searchFood(String foodName , int quantity){
		double foodPrice = 0.0;
		if("Biryani"==foodName) return foodPrice = 250*quantity;
		else{
			System.out.println("not found");
		}
	return foodPrice;
	}
}