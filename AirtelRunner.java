class AirtelRunner{

	public static void main(String[] reacharge){
	System.out.println("Jio Reacharge Plans Runner started");
	String plan = "365 Days";
	double price = Airtel.getReachargPriceByName(plan);
	System.out.println( plan +  " reacharge amount is :" + price);
	System.out.println("Jio Reacharge Plans Runner ended");
	}


}