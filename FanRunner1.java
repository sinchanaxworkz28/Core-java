class FanRunner1{

	public static void main(String[] arg){
		
	System.out.println("Main started");
	
	 boolean connect = Fan1.onOrOff();
		System.out.println("is fan connected:" + connect);
		
		Fan1.increaseSpeed();
	    Fan1.increaseSpeed();
		Fan1.increaseSpeed();
	    Fan1.increaseSpeed();
		Fan1.increaseSpeed();
		
		Fan1.decreaseSpeed();
		Fan1.decreaseSpeed();
		Fan1.decreaseSpeed();
		Fan1.decreaseSpeed();
		Fan1.decreaseSpeed();
		
	 connect = Fan1.onOrOff();
		System.out.println("is fan connected:" + connect);
		
	System.out.println("Main ended");
	}



}
