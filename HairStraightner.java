class HairStraightner{

	static boolean isConnected = false;
	static int maxHeat = 5;
	static int minHeat = 0;
	static int currentHeat;
		
		public static boolean onOrOff(){
			System.out.println("Start of onOrOff");
			
							isConnected = (isConnected == false) ? true : false ;

			
			/*if(isConnected == false){
				isConnected = true;
					System.out.println("HairStraightner is turned on..");
		}
			else	if(isConnected == true){
					isConnected = false;
						System.out.println("HairStraightner is turned off...");
				}*/
				System.out.println("End of onOrOff");
					return isConnected;
			}
			
			
			public static void increaseHeat(){
				System.out.println("increaseSpeed started");
				
				if(isConnected==true){
					if(currentHeat<maxHeat){
						currentHeat=currentHeat+1;
						System.out.println("current heat is:" + currentHeat);
						
					}else
						System.out.println("maximum heat reached");
					
				}else
						System.out.println("turn on the HairStraightner");
					
				System.out.println("increase heat ended");
		return;			
			
	}
	
	public static void decreaseHeat(){
				System.out.println("decreaseHeat started");
				
				if(isConnected==true){
					if(currentHeat>minHeat){
						currentHeat=currentHeat-1;
						System.out.println("current heat is:" + currentHeat);
						
					}else
						System.out.println("minimum heat reached");
					
				}else
						System.out.println("turn on the HairStraightner");
					
				System.out.println("decrease heat ended");
		return;			
			
	}
			
}