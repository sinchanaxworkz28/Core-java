class AirConditioner{

	static boolean isConnected = false;
	static int maxTemp = 7;
	static int minTemp = 0;
	static int currentTemp;
		
		public static boolean onOrOff(){
			System.out.println("Start of onOrOff");
			
			if(!isConnected) isConnected = true;
					//System.out.println("AirConditioner is turned on..");
		    else if(isConnected) isConnected = false;
			//else if (isConnected)	{
				//if(isConnected == true)
					
						//System.out.println("AirConditioner is turned off...");
				
				//System.out.println("End of onOrOff");
					return isConnected;
			}
			
			public static boolean increaseTemp(){
				System.out.println("increaseTemp started");
				
				if(isConnected==true){
					if(currentTemp<maxTemp){
						currentTemp=currentTemp+1;
						System.out.println("current speed is:" + currentTemp);
						
					}else
						System.out.println("maximum temperature reached");
					
				}else
						System.out.println("turn on the Air conditioner");
					
				System.out.println("increase temperature ended");
		return isConnected;			
			
	}
	
	public static boolean decreaseTemp(){
				System.out.println("decreaseTemp started");
				
				if(isConnected==true){
					if(currentTemp>minTemp){
						currentTemp=currentTemp-1;
						System.out.println("current temperature is:" + currentTemp);
						
					}else
						System.out.println("minimum temperature reached");
					
				}else
						System.out.println("turn on the air conditioner");
					
				System.out.println("decrease temperature ended");
		return isConnected;			
			
			
		}	
			
}