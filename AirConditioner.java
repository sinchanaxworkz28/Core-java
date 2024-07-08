class AirConditioner{

	static boolean isConnected = false;
		
		public static void turnOn(){
			System.out.println("Start of turnon");
			
			if(isConnected == false){
				isConnected = true;
					System.out.println("AirConditioner is turned on..");
			}
			System.out.println("End of turnon");
			return;
		}


//class AirConditioner{
			public static void turnOff(){
				System.out.println("Start of turnoff");
				
				if(isConnected == true){
					isConnected = false;
						System.out.println("AirConditioner is turned off...");
				}
				System.out.println("End of turnoff");
					return;
			}
}