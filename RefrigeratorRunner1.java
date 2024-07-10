class RefrigeratorRunner1{

	public static void main(String[] wash){
	System.out.println("Main started");
		boolean connect = Refrigerator.onOrOff();
			System.out.println("is Refrigerator connected:" + connect);
		  connect = Refrigerator.onOrOff();
			System.out.println("is Refrigerator connected:" + connect);
	System.out.println("Main ended");
	}
}