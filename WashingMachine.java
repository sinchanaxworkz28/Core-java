class WashingMachine{
	
	static boolean isConnected = false;
	
	public static void turnOn(){
	
	System.out.println("Start of turnOn");
	
	if(isConnected == false){
		isConnected = true;
		System.out.println("Washing machine is turn On");
		}
			System.out.println("End of turnOn");
			return;
	
	}
	
	public static void turnOff(){
	
	System.out.println("Start of turnOff");
	
	if(isConnected == true){
		isConnected = false;
		System.out.println("Washing Machine turn Off");
	
	}
		System.out.println("End of turnOff");
		return;
	}

	

}