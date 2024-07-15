class ZomatoFood{

	public static double getFoodPiceByName(String food){
	
	double getPrice = 0.0;
	
	if(food == "Sugar Free Classic Cold Coffee"){
	getPrice = 229.00;
	return getPrice;
	}
	if(food == "Sugar Free Classic Strawberry Milkshake"){
	getPrice = 229.00;
	return getPrice;
	}
	if(food == "Sugar Free Classic Vanilla Milkshake"){
	getPrice = 219.00;
	return getPrice;
	}
	if(food == "Salted Caramel Crunch Ice Cream [100 ml]"){
	getPrice = 92.37;	
	return getPrice;
	}
	if(food == "Vegan Dark Chocolate Ice Cream [100 ml]"){
	getPrice = 92.37;
	return getPrice;
	}
	if(food == "Burger Combo for 2: McChicken Burger"){
	getPrice = 426.67;
	return getPrice;
	}
	if(food == "Burger Combo for 2: McVeggie + McAloo Tikki with Pizza McPuff"){
	getPrice = 391.43;
	return getPrice;
	}
	if(food == "McSpicy Fried Chicken - 2 Pc + 2 Fries (M) + McSpicy Chicken Burger"){
	getPrice = 439.05;
	return getPrice;
	}
	if(food == "Mango McFlurry with Lotus Biscoff Medium"){
	getPrice = 155.24;
	return getPrice;
	}
	if(food == "Mango McFlurry with Lotus Biscoff Small"){
	getPrice = 120.00;
	return getPrice;
	}
	if(food == "Fries (M) + Piri Piri Mix"){
	getPrice = 120.95;
	return getPrice;
	}
	if(food == "20 Pc Chicken Nuggets"){
	getPrice = 423.83;
	return getPrice;
	}
	if(food == "Salsa Cheese Fries"){
	getPrice = 135.24;
	return getPrice;
	}
	if(food == "2 Chapati with Curry and Dal"){
	getPrice = 99.00;
	return getPrice;
	}
	if(food == "Gobi Manchurian Dry"){
	getPrice = 119.00;
	return getPrice;
	}
	if(food == "High Protein Chicken Roll With Double Egg (55g+)"){
	getPrice = 339.00;
	return getPrice;
	}
	if(food == "Chicken Tikka Protein Roll (45g+)"){
	getPrice = 299.00;
	return getPrice;
	}
	if(food == "Classic Smoky Chicken Shawarma"){
	getPrice = 208.00;
	return getPrice;
	}
	if(food == "Veg Shawarma & Beverage Meal"){
	getPrice = 195.00;
	return getPrice;
	}
	if(food == "Mixed Pickled Vegetables"){
	getPrice = 59.00;
	return getPrice;
	}else{
	System.out.println(food + "Not Found");
	}
	return getPrice;
	
	}




}