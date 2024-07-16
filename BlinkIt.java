class BlinkIt{

	public static double searchItems(String foodName){
		double foodPrice = 0.0;
		if("IceCream" == foodName) return foodPrice = 100.0;
		else{
			System.out.println("not found");
		}
		return foodPrice;
	}
	public static double searchItems(String foodName, int quantity){
		double foodPrice = 0.0;
		if("IceCream"==foodName)return foodPrice=100*quantity;
		else{
			System.out.println("not found");
		}
		return foodPrice;
	}
}