class Laptop{

	static boolean isConnected = false;
	static int maxVolume = 5;
	static int minVolume = 0;
	static int currentVolume;
		
		public static boolean onOrOff(){
			System.out.println("Start of onOrOff");
			
				isConnected = (isConnected == false) ? true : false ;

			
			/*if(isConnected == false){
				isConnected = true;
					System.out.println("Laptop is turned on..");
		}
			else	if(isConnected == true){
					isConnected = false;
						System.out.println("Laptop is turned off...");
				}*/
				System.out.println("End of onOrOff");
					return isConnected ;
		}
		
	public static boolean increaseVolume(){
		
		System.out.println("increaseVolume method started");
		if(isConnected == true){
			if(currentVolume < maxVolume){
			currentVolume = currentVolume + 1 ;
			System.out.println("The Current Volume is :" + currentVolume);
		}else{
			System.out.println("Maximum Volume reached");
		}
		
		}else{
			System.out.println("Turn on the Laptop");
		}
		
		System.out.println("increaseVolume method ended");
		return isConnected;
	
	}
		
	public static void decreaseVolume(){
		
		System.out.println("decreaseVolume method started");
		if(isConnected == true){
			if(currentVolume > minVolume){
			currentVolume = currentVolume - 1 ;
			System.out.println("Current Volume is :" + currentVolume);
		}else{
			System.out.println("Minimum Volume reached");
		}
		}else {
			System.out.println("Turn on the Laptop");
		
		System.out.println("decreaseVolume method ended");
		}
	return;
		
	}
}
