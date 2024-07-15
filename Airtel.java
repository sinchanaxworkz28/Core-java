class Airtel{

	public static double getReachargPriceByName(String reachargePlan){
	
	double rechargePrice = 0.0;
	if(reachargePlan ==  "365 Days" ){
		rechargePrice = 3899.00;
		return rechargePrice;
	}
	if(reachargePlan == "98 Days"){
		rechargePrice = 999.00;
		return rechargePrice;
	}
	if(reachargePlan == "28 Days"){
		rechargePrice = 349.0;
		return rechargePrice;
	}
	if(reachargePlan == "84 Days"){
		rechargePrice = 1299.00;
		return rechargePrice;
	}
	if(reachargePlan == "30 Days"){
		rechargePrice = 359.00;
		return rechargePrice;
	}
	if(reachargePlan == "1 Day Data Only"){
		rechargePrice = 49.00;
		return rechargePrice;
	}
	if(reachargePlan == "Active Plan 12GB"){
		rechargePrice = 139.00;
		return rechargePrice;
	}
	if(reachargePlan == "Active only 6GB"){
		rechargePrice = 89.00;
		return rechargePrice;
	}
	if(reachargePlan == "365 Days"){
		rechargePrice = 895.00;
		return rechargePrice;
	}
	if(reachargePlan == "28 Days"){
		rechargePrice = 150.00;
		return rechargePrice;
	}
	if(reachargePlan == "30 Days Data"){
		rechargePrice = 400.00;
		return rechargePrice;
	}
	if(reachargePlan == "28 Days Data 5GB"){
		rechargePrice = 320.00;
		return rechargePrice;
	}
	if(reachargePlan == "31 Days Data 2GB"){
		rechargePrice = 260.00;
		return rechargePrice;
	}
	if(reachargePlan == "65 Days"){
		rechargePrice = 300.00;
		return rechargePrice;
	}
	if(reachargePlan == "100 Days"){
		rechargePrice = 999.00;
		return rechargePrice;
	}else{
		System.out.println("reachargePlan " + "not found");
	}
	return rechargePrice;
	}

}