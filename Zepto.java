class Zepto{

public static double searchItems(String foodName){
	double foodPrice = 0.0;
	if("kurkure" == foodName) return foodPrice = 50.0;
	else {
		System.out.println("not found");
	}
	return foodPrice;
}
public static double searchItems(String foodName , int quantity){
	double foodPrice = 0.0;
	if("kurkure" == foodName)return foodPrice = 50.0*quantity;
	else { 
	System.out.println("not found");
	}
	return foodPrice;
}
}