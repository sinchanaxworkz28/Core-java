class PrinterRunner{

	public static void main(String[] wash){
	System.out.println("Main started");
		boolean connect = Printer.onOrOff();
			System.out.println("is Printer connected:" + connect);
		  connect = Printer.onOrOff();
			System.out.println("is Printer connected:" + connect);
	System.out.println("Main ended");
	}
}