class AirConditioner{

	static boolean isConnected = false;
		
		public static boolean onOrOff(){
			System.out.println("Start of onOrOff");
			
			if(isConnected == false){
				isConnected = true;
					System.out.println("AirConditioner is turned on..");
		}
			else	if(isConnected == true){
					isConnected = false;
						System.out.println("AirConditioner is turned off...");
				}
				System.out.println("End of onOrOff");
					return isConnected;
			}
}