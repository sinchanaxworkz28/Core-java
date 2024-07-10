class LaptopRunner{

	public static void main(String[] wash){
	System.out.println("Main started");
		boolean connect = Laptop.onOrOff();
			System.out.println("is Laptop connected:" + connect);
		  connect = Refrigerator.onOrOff();
			System.out.println("is Laptop connected:" + connect);
	System.out.println("Main ended");
	}
}