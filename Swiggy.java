class Swiggy{
	public static double search(String foodName ){
	double foodPrice = 0.0;
		if("Pizza"==foodName) return foodPrice = 150.0; 
		if("momos"==foodName)return foodPrice=80.0;
		else{
			System.out.println(foodName + "not found");
		}
		return foodPrice;
	}
	public static double search(String foodName , int quantity){
	
	double foodPrice = 0.0;
		if("Pizza" == foodName) return foodPrice=150*quantity;
else{
	System.out.println(foodName + "not found");
	}
	return foodPrice ;
	}
}