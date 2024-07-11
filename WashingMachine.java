class WashingMachine{

	static boolean isConnected = false;
	static int maxSpeed = 5;
	static int minSpeed = 0;
	static int currentSpeed;
		
		public static boolean onOrOff(){
			System.out.println("Start of onOrOff");
			
				isConnected = (isConnected == false) ? true : false ;

			
			/*if(isConnected == false){
				isConnected = true;
					System.out.println("WashingMachine is turned on..");
		}
			else	if(isConnected == true){
					isConnected = false;
						System.out.println("WashingMachine is turned off...");
				}*/
				System.out.println("End of onOrOff");
					return isConnected;
			}
			
			public static void increaseSepeed(){
				System.out.println("increaseSpeed started");
				
				if(isConnected==true){
					if(currentSpeed<maxSpeed){
						currentSpeed=currentSpeed+1;
						System.out.println("current speed is:" + currentSpeed);
						
					}else
						System.out.println("maximum speed reached");
					
				}else
						System.out.println("turn on the WashingMachine");
					
				System.out.println("increase speed ended");
		return;			
			
	}
	
	public static void decreaseSpeed(){
				System.out.println("decreaseSpeed started");
				
				if(isConnected==true){
					if(currentSpeed>minSpeed){
						currentSpeed=currentSpeed-1;
						System.out.println("current speed is:" + currentSpeed);
						
					}else
						System.out.println("minimum speed reached");
					
				}else
						System.out.println("turn on the WashingMachine");
					
				System.out.println("decrease speed ended");
		return;			
			
	}
			
}