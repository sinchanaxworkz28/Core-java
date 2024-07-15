class FoodPanda{

	public static double getFoodPiceByName(String food){
	
	double getPrice = 0.0;
	
	if(food == "Tops Plain Noodles"){
	getPrice = 50.00;
	return getPrice;
	}
	if(food == "Moi Soi Whole Wheat Noodles"){
	getPrice = 86.00;
	return getPrice;
	}
	if(food == "Naturally Yours Soya Noodles"){
	getPrice = 147.00;
	return getPrice;
	}
	if(food == "McCain Veggie Burger Patty"){
	getPrice = 120.37;	
	return getPrice;
	}
	if(food == "ITC Master Chef Classic Aloo Tikki "){
	getPrice = 125.37;
	return getPrice;
	}
	if(food == "McCain Pizza Cheese Mini Samosa"){
	getPrice = 140.67;
	return getPrice;
	}
	if(food == "Haldiram's Nagpur Cocktail Samosa"){
	getPrice = 178.43;
	return getPrice;
	}
	if(food == "Amul Fresh Cream"){
	getPrice = 28.05;
	return getPrice;
	}
	if(food == "Parry's Superfine Sugar"){
	getPrice = 75.24;
	return getPrice;
	}
	if(food == "Whole Farm Premium Sugar Powder"){
	getPrice = 66.00;
	return getPrice;
	}
	if(food == "Weikfield Cocoa Powder"){
	getPrice = 224.95;
	return getPrice;
	}
	if(food == "Amul Unsalted Butter"){
	getPrice = 60.83;
	return getPrice;
	}
	if(food == "Weikfield Baking Soda"){
	getPrice = 33.24;
	return getPrice;
	}
	if(food == "Dabur 100% Pure Honey"){
	getPrice = 65.00;
	return getPrice;
	}
	if(food == "Nature's Nectar Organic Honey"){
	getPrice = 432.00;
	return getPrice;
	}
	if(food == "Tetley Premium Black Leaf Tea (250 g)"){
	getPrice = 207.00;
	return getPrice;
	}
	if(food == "Tops Tomato Ketchup"){
	getPrice = 74.00;
	return getPrice;
	}
	if(food == "Del Monte Tandoori Mayonnaise"){
	getPrice = 79.00;
	return getPrice;
	}
	if(food == "Nutralite Eggless Mayonnaise"){
	getPrice = 105.00;
	return getPrice;
	}
	if(food == "Winkies Novo Chocolate Cake"){
	getPrice = 59.00;
	return getPrice;
	}else{
	System.out.println(food + "Not Found");
	}
	return getPrice;
	
	}




}