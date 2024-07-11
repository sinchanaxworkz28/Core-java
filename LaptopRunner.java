class LaptopRunner{

	public static void main(String[] wash){
	System.out.println("Main started");
		boolean connect = Laptop.onOrOff();
			System.out.println("is Laptop connected:" + connect);
			
			
		Laptop.increaseVolume();
	    Laptop.increaseVolume();
		Laptop.increaseVolume();
	    Laptop.increaseVolume();
		Laptop.increaseVolume();
		
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
		Laptop.decreaseVolume();
		
System.out.println("min volumre reached");		
		  connect = Laptop.onOrOff();
			System.out.println("is Laptop connected:" + connect);
	System.out.println("Main ended");
	}
}