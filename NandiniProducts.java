class NandiniProducts{

	public static double getProductsPriceByName(String getProductName){
	
	double getPrice = 0.0;
	
	if(getProductName == "Butter Milk"){
	getPrice = 265.00;
	return getPrice;
	}
	if(getProductName == "Milk"){
	getPrice = 30.00;
	return getPrice;
	}
	if(getProductName == "Ghee"){
	getPrice = 78.00;
	return getPrice;
	}
	if(getProductName == "MilkPeda"){
	getPrice = 14.00;
	return getPrice;
	}
	if(getProductName == "Butter Salted"){
	getPrice = 265.00;
	return getPrice;
	}
	
	if(getProductName == "Butter Milk Spiced"){
	getPrice = 14.00;
	return getPrice;
	}
	
	if(getProductName == "Plain Lassi"){
	getPrice = 20.00;
	return getPrice;
	}
	
	if(getProductName == "Mixed fruit Lassi"){
	getPrice = 78.00;
	return getPrice;
	}
	
	
	
	if(getProductName == "Besan Ladoo"){
	getPrice = 135.00;
	return getPrice;
	}
	
	if(getProductName == "Kesar Peda"){
	getPrice = 150.00;
	return getPrice;
	}else{
	System.out.println(getProductName + "Not Found");
	}
	
	
	return getPrice;
	}
}