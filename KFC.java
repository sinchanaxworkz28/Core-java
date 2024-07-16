class KFC{

public static double searchFood(String foodName){
	double foodPrice = 0.0;
	if("Fried Chicken" == foodName) return foodPrice = 500.0;
	else {
		System.out.println("not found");
	}
	return foodPrice;
}
public static double searchFood(String foodName , int quantity){
	double foodPrice = 0.0;
	if("Fried Chicken" == foodName)return foodPrice = 500*quantity;
	else { 
	System.out.println("not found");
	}
	return foodPrice;
}
}