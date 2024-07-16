class KFCRunner{

	public static void main(String[] food){
		String name = "Fried Chicken";
		double foodPrice = KFC.searchFood(name,2);
		System.out.println("price of " + name + " is " + foodPrice);

	}
}