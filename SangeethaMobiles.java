class SangeethaMobiles{

	public static double getMobilePriceByBrand(String mobile){

	double mobilePrice = 0.0;
	
	if(mobile == "Jio Bharath 4G KW101 Digital Life - Jio"){
	mobilePrice = 1999.00;
		return mobilePrice;
	}
	if(mobile == "OnePluse 10R"){
	mobilePrice = 35000.00;
		return mobilePrice;
	}
	
	if(mobile == "Oppo A55"){
	mobilePrice = 13499.00;
		return mobilePrice;
	}
	if(mobile == "Nokia C30"){
	mobilePrice = 8499.00;
		return mobilePrice;
	}
	if(mobile == "Oppo A16"){
	mobilePrice = 12999.00;
		return mobilePrice;
	}
	if(mobile == "Realme GT 2 Prr Paper"){
	mobilePrice = 48999.00;
		return mobilePrice;
	}
	if(mobile == "Samsung Galaxy A73"){
	mobilePrice = 41999.00;
		return mobilePrice;
	}
	
	
	if(mobile == "Apple iPhone 14 Pluse"){
	mobilePrice = 104900.00;
		return mobilePrice;
	}
	if(mobile == "iPhone 14"){
	mobilePrice = 59999.00;
		return mobilePrice;
	}
	if(mobile == "Nokia 110 TA-1302 "){
	mobilePrice =2990.00;
		return mobilePrice;
	}
	if(mobile == "Redmi 10 Prime"){
	mobilePrice = 10999.00;
		return mobilePrice;
	}
	if(mobile == "Vivo Y20G Obsidian Black"){
	mobilePrice = 12500.00;
		return mobilePrice;
	}
	if(mobile == "Oppo A74"){
	mobilePrice = 17999.00;
		return mobilePrice;
	}
	if(mobile == "Vivo V23 Pro "){
	mobilePrice = 40000.00;
		return mobilePrice;
	}
	if(mobile == "Realme C35"){
	mobilePrice = 11999.00;
		return mobilePrice;
	}else{
	System.out.println(mobile + "Not Found");
	}
	return mobilePrice;

	}
}