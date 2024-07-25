class JuiceShopRunner{

    public static void main(String[] juiceShop){
	
	    System.out.println("main started");
		
		boolean juiceNameAdded = JuiceShop.addJuiceName("PineApple Juice");
		System.out.println("Juice Name added " + juiceNameAdded);
		
		juiceNameAdded = JuiceShop.addJuiceName("Watermelon Juice");
		System.out.println("Juice Name added " + juiceNameAdded);
		
		juiceNameAdded = JuiceShop.addJuiceName("Mango Juice");
		System.out.println("Juice Name added " + juiceNameAdded);
		
		juiceNameAdded = JuiceShop.addJuiceName("chiku MilkShake");
		System.out.println("Juice Name added " + juiceNameAdded);
		
		juiceNameAdded = JuiceShop.addJuiceName("Pomegranate Milk Shake");
		System.out.println("Juice Name added " + juiceNameAdded);
		
		juiceNameAdded = JuiceShop.addJuiceName("Mixed FRuit Milk Shake");
		System.out.println("Juice Name added " + juiceNameAdded);
		
		juiceNameAdded = JuiceShop.addJuiceName("Muskmelon Juice");
		System.out.println("Juice Name added " + juiceNameAdded);
		
		juiceNameAdded = JuiceShop.addJuiceName("Strawberry Milk Shake");
		System.out.println("Juice Name added " + juiceNameAdded);
		
		JuiceShop.readJuiceDetails();
		
		boolean updatedJuice=JuiceShop.updateJuiceName("Oreo MilkShake","Muskmelon Juice");
			System.out.println("updeted juice is " + updatedJuice);
			
		JuiceShop.readJuiceDetails();
		
		boolean deletedJuice=JuiceShop.deleteJuiceName("Strawberry Milk Shake");
			System.out.println("deleted juice is" + deletedJuice);
			
			
		JuiceShop.readJuiceDetails();
		
		System.out.println("main ended");
	
	}

}