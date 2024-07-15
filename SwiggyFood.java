class SwiggyFood{

	public static double getFoodPiceByName(String food){
	
	double getPrice = 0.0;
	
	if(food == "Shahi Veg Biryani & Kebab Combo"){
	getPrice = 325.00;
	return getPrice;
	}
	if(food == "Mushroom Biryani  2"){
	getPrice = 365.00;
	return getPrice;
	}
	if(food == "Aloo Pattice Chaat"){
	getPrice = 159.00;
	return getPrice;
	}
	if(food == "Royal Paneer Curry Combo"){
	getPrice = 349.00;	
	return getPrice;
	}
	if(food == "Royal Paneer Daawat"){
	getPrice = 649.00;
	return getPrice;
	}
	if(food == "Veg Daawat for 1-2: Biryani +Kebabs +Beverage"){
	getPrice = 469.00;
	return getPrice;
	}
	if(food == "Zaikedaar Paneer Biryani"){
	getPrice = 359.00;
	return getPrice;
	}
	if(food == "Subz-e-Biryani"){
	getPrice = 325.00;
	return getPrice;
	}
	if(food == "Paneer Subz Biryan"){
	getPrice = 359.00;
	return getPrice;
	}
	if(food == "Hyderabadi Chicken Biryani"){
	getPrice = 310.00;
	return getPrice;
	}
	if(food == "Chicken Anarkali Dry"){
	getPrice = 300.00;
	return getPrice;
	}
	if(food == "French Chicken Dry"){
	getPrice = 300.00;
	return getPrice;
	}
	if(food == "Chicken Hyderabadi Masala"){
	getPrice = 290.00;
	return getPrice;
	}
	if(food == "Tandoori Chicken"){
	getPrice = 290.00;
	return getPrice;
	}
	if(food == "Plain Naan"){
	getPrice = 50.00;
	return getPrice;
	}
	if(food == "Plain Kulcha"){
	getPrice = 25.00;
	return getPrice;
	}
	if(food == "Rice And Biryani"){
	getPrice = 310.00;
	return getPrice;
	}
	if(food == "Mutton Biryani"){
	getPrice = 370.00;
	return getPrice;
	}
	if(food == "Boneless Special Chicken Biryani"){
	getPrice = 340.00;
	return getPrice;
	}
	if(food == "Godavari Spl Biriyani"){
	getPrice = 360.00;
	return getPrice;
	}else{
	System.out.println(food + "Not Found");
	}
	return getPrice;
	
	}




}