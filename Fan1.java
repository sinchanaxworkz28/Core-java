class Fan1{

	static boolean isConnected = false;
		
		public static boolean onOrOff(){
			System.out.println("Start of onoroff");
			
			if(isConnected == false){
				isConnected = true;
					System.out.println("Fan is turned on..");
			}
				else	if(isConnected == true){
					isConnected = false;
						System.out.println("Fan is turned off...");
				}
				System.out.println("End of onoroff");
					return isConnected;
			}
}