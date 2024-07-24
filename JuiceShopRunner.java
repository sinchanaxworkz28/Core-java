class JuiceShopRunner{

    public static void main(String[] juiceShop){
	
	    System.out.println("main started");
		
		boolean juiceAdded = JuiceShop.addJuiceName("Grape Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Mosambi Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Mango Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Watermelon Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Oreo Milk Shake");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Dry FRuit Milk Shake");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Papaya Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Strawberry Milk Shake");
		System.out.println("Juice Name added " + juiceAdded);
		
		JuiceShop.showJuiceDetails();
		
		System.out.println("main ended");
	
	}

}