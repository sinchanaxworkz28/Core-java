class HairStraightnerRunner{

	public static void main(String[] straight){
	System.out.println("Main started");
		boolean connect = HairStraightner.onOrOff();
			System.out.println("is HairStraightner connected:" + connect);
			
			
		HairStraightner.increaseHeat();
	    HairStraightner.increaseHeat();
		HairStraightner.increaseHeat();
	    HairStraightner.increaseHeat();
		HairStraightner.increaseHeat();
		
		HairStraightner.decreaseHeat();
		HairStraightner.decreaseHeat();
		HairStraightner.decreaseHeat();
		HairStraightner.decreaseHeat();
		HairStraightner.decreaseHeat();
		
System.out.println("min heat reached");		
			
			
			
		  connect = HairStraightner.onOrOff();
			System.out.println("is HairStraightner connected:" + connect);
	System.out.println("Main ended");
	}
}