class Printer{

	static boolean isConnected = false;
		
		public static boolean turnOn(){
			System.out.println("Start of turnon");
			
			if(isConnected == false){
				isConnected = true;
					System.out.println("printer is turned on..");
			}
			System.out.println("End of turnon");
			return isConnected;
		}


			public static void turnOff(){
				System.out.println("Start of turnoff");
				
				if(isConnected == true){
					isConnected = false;
						System.out.println("Printer is turned off...");
				}
				System.out.println("End of turnoff");
					return;
			}
}