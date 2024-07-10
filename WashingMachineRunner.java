class WashingMachineRunner{

	public static void main(String[] wash){
	System.out.println("Main started");
		boolean connect = WashingMachine.onOrOff();
			System.out.println("is washingMachine connected:" + connect);
		  connect = WashingMachine.onOrOff();
			System.out.println("is washingMachine connected:" + connect);
	System.out.println("Main ended");
	}
}