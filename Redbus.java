class Redbus {
	public static void main(String arg[]){
	
		String busNames[] = {"volvo" , "Rajahamsa" , "Airavat" , "Srs" , "Vlr" , "Sugama" , "Sea bird" };
		String headQuarters = "Bengalore";
		int dateofFound = 2006;
		
		System.out.println(" it is located at " + headQuarters);
		System.out.println("Date founded " + dateofFound);
		System.out.println("no of bus available is " + busNames.length);
		System.out.println("list of bus available are " + busNames) ;
		
		for(int ref = 0; ref < busNames.length ; ref++){
		String value = busNames[ref];
		System.out.println(value);
		}
		
	}
}	