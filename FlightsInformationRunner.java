class FlightsInformationRunner{

	public static void main(String[] flights){
	
	System.out.println("Flights Information started");
	String place = "Chennai";
	double price = FlightsInformation.getFlightPriceByDestinationName(place);
	System.out.println( place +  " Ticket price is :" + price);
	System.out.println("Flights Information ended");
	
	}
}