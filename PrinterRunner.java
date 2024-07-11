class PrinterRunner{

    public static void main(String[] jBL){
	
	    System.out.println("Main Started");
		        //invoking a method
		boolean connect = Printer.onOrOff();
		    System.out.println("is Printer Conneted :" + connect);
			   
		//boolean	  connected = Printer.onOrOff();
			//System.out.println("is Printer Connected :" + connect);
		
		Printer.increaseSepeed();
	    Printer.increaseSepeed();
		Printer.increaseSepeed();
	    Printer.increaseSepeed();
		Printer.increaseSepeed();
		Printer.increaseSepeed();
		Printer.increaseSepeed();
		Printer.increaseSepeed();
	    Printer.increaseSepeed();
		
		Printer.decreaseSpeed();
		Printer.decreaseSpeed();
		Printer.decreaseSpeed();
		Printer.decreaseSpeed();
		Printer.decreaseSpeed();
		Printer.decreaseSpeed();
		Printer.decreaseSpeed();
		Printer.decreaseSpeed();
	
		 connect = Printer.onOrOff();
		System.out.println("is Printer Connected :" + connect);
		//System.out.println("The Printer is Connected :" +connect);
		//Printer.increaseSepeed();
		//Printer.decreaseSpeed();
		System.out.println("Main Ended");
	
	}
}