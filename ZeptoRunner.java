class ZeptoRunner{

	public static void main(String[] food){
		String name = "kurkure";
		double foodPrice = Zepto.searchItems(name,15);
		System.out.println("price of " + name + " is " + foodPrice);

	}
}