class Printer{

	static boolean isConnected = false;
	static int maxSpeed = 7;
	static int minSpeed = 0;
	static int currentSpeed;
		
		public static boolean onOrOff(){
			System.out.println("Start of onOrOff");
			
			
			isConnected = (isConnected == false) ? true : false ;
			
			System.out.println("End of onOrOff");
			
			return isConnected;
		}

			
			/*if(isConnected == false){
				isConnected = true;
					System.out.println("Printer is turned on..");
		}
			else	if(isConnected == true){
					isConnected = false;
						System.out.println("Printer is turned off...");
				}
				System.out.println("End of onOrOff");
					return isConnected;
			}*/
			public static void increaseSepeed(){
				System.out.println("increaseSpeed started");
				
				if(isConnected==true){
					if(currentSpeed<maxSpeed){
						currentSpeed=currentSpeed+1;
						System.out.println("current speed is:" + currentSpeed);
						
					}else
						System.out.println("maximum speed reached");
					
				}else
						System.out.println("turn on the printer");
					
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
						System.out.println("turn on the printer");
					
				System.out.println("decrease speed ended");
		return;			
			
	}
	
}




/*public static void increaseVolume(){
		
		System.out.println("increaseVolume method started");
		if(isConnected == true){
			if(currentVolume < maxVolume){
			currentVolume = currentVolume + 1 ;
			System.out.println("The Current Volume is :" + currentVolume);
		}else
			System.out.println("Maximum Volume reached");
		}else
			System.out.println("Turn on the Speaker");
		
		System.out.println("increaseVolume method ended");
		return ;
	}*/
