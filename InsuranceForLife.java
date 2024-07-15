class InsuranceForLife{
	public static double findInsurancePriceByName(String insuranceName){
		
		double insurancePrice = 0.0;
		
		if(insuranceName == "Max Life"){
			insurancePrice = 10000.0;
			return insurancePrice;
		}
		if(insuranceName == "Kotak"){
			insurancePrice = 13000.50;
			return insurancePrice;
		}
		if(insuranceName=="Icici"){
			insurancePrice = 22000.10;
			return insurancePrice;
		}
		if(insuranceName =="Bandhan Life Insurance"){
			insurancePrice = 4000.30;
			return insurancePrice;
		}
		if(insuranceName =="IndiaFirst Life Insurance"){
			insurancePrice = 5600.00;
			return insurancePrice;
		}
		if(insuranceName=="Aviva life insurance"){
			insurancePrice = 5000.45;
			return insurancePrice;
		}
		if(insuranceName=="Max Life Smart Secure Plus"){
			insurancePrice = 20000.00;
			return insurancePrice;
		}
		if(insuranceName=="Bajaj"){
			insurancePrice = 7700.70;
			return insurancePrice;
		}
		if(insuranceName=="SBI Life eShield"){
			insurancePrice = 10000.00;
			return insurancePrice;
		}
		if(insuranceName=="Future Generali General Insurance"){
			insurancePrice = 5400.80;
			return insurancePrice;
		}	
		if(insuranceName=="Hsbc"){
			insurancePrice = 4500.76;
			return insurancePrice;
		}
		if(insuranceName=="Reliance Nippon term Insurance"){
			insurancePrice = 6700.45;
			return insurancePrice;
		}
		if(insuranceName=="Bharti AXA General Insurance"){
			insurancePrice = 5000.46;
			return insurancePrice;
		}
		if(insuranceName=="Aviva life insurance"){
			insurancePrice = 6700.45;
			return insurancePrice;
		}
		if(insuranceName=="Bajaj Allianz Life Insurance"){
			insurancePrice = 10000.25;
			return insurancePrice;
		}	
		if(insuranceName=="Edelweiss Tokio Life Insurance"){
			insurancePrice = 15000.56;
			return insurancePrice;
		}
		if(insuranceName=="Tata AIA Life Insurance"){
			insurancePrice = 23000.56;
			return insurancePrice;
		}
		if(insuranceName=="LIC"){
			insurancePrice = 4500.90;
			return insurancePrice;
		}	
			
		else{
			System.out.println(insuranceName + " not found ");

		}
	return insurancePrice;
}

}	