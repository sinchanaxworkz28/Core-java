class AirConditionerRunner{

	public static void main(String[] wash){
	System.out.println("Main started");
		boolean connect = AirConditioner.onOrOff();
			System.out.println("is AirConditioner connected:" + connect);
		  connect = AirConditioner.onOrOff();
			System.out.println("is AirConditioner connected:" + connect);
	System.out.println("Main ended");
	}
}