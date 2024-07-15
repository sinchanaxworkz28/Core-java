class FlightsInformation{

	public static double getFlightPriceByDestinationName(String flightdestinationName){
	
	double ticketPrice = 0.0;
	
	if(flightdestinationName == "Santorini"){
		ticketPrice = 102092.00;
		return ticketPrice;
	}
	if(flightdestinationName == "Mumbai"){
		ticketPrice = 3357.00;
		return ticketPrice;
	}
	if(flightdestinationName == "Thiruvananthapuram"){
		ticketPrice = 3310.00;
		return ticketPrice;
	}
	if(flightdestinationName == "London"){
		ticketPrice = 54621.00;
		return ticketPrice;
	}
	
	
	if(flightdestinationName == "Sydney"){
		ticketPrice = 48814;
		return ticketPrice;
	}
	if(flightdestinationName == "Chennai"){
		ticketPrice = 3485.00;
		return ticketPrice;
	}
	if(flightdestinationName == "San Francisko"){
		ticketPrice = 71538.00;
		return ticketPrice;
	}
	if(flightdestinationName == "Singapore"){
		ticketPrice = 16060.00;
		return ticketPrice;
	}
	if(flightdestinationName == "Tokyo"){
		ticketPrice = 72713.00;
		return ticketPrice;
	}
	if(flightdestinationName == "Miami"){
		ticketPrice = 9620.00;
		return ticketPrice;
	}
	if(flightdestinationName == "Lisbon"){
		ticketPrice = 40686.00;
		return ticketPrice;
	}
	if(flightdestinationName == "Los Angeles"){
		ticketPrice = 16458;
		return ticketPrice;
	}
	if(flightdestinationName == "Dublin"){
		ticketPrice = 30551;
		return ticketPrice;
	}
	
	if(flightdestinationName == "New Delhi"){
		ticketPrice = 10633.00;
		return ticketPrice;
	}
	if(flightdestinationName == "Berlin"){
		ticketPrice = 84562.00;
		return ticketPrice;
	}
	if(flightdestinationName == "Barcelona"){
		ticketPrice = 66500.00;
		return ticketPrice;
	}
	if(flightdestinationName == "Madrid"){
		ticketPrice = 86486.00;
		return ticketPrice;
	}
	if(flightdestinationName == "Athens"){
		ticketPrice = 76370.00;
		return ticketPrice;
	}
	if(flightdestinationName == "Paris"){
		ticketPrice = 67821.00;
		return ticketPrice;
	}
	if(flightdestinationName == "Bankok"){
		ticketPrice = 17674.00;
		return ticketPrice;
	}
	else{
		System.out.println(flightdestinationName + "Not Found");
	}
	
	return ticketPrice;
	}
}