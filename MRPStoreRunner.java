class MRPStoreRunner {

    public static void main(String[] alcoholTypes){
	
	    boolean alcoholsAdded = MRPStore.addAlcoholName("Breezer");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Tequila");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Vodka");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Whiskey");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Rum");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Port Wine");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Cider");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Jin");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Singani");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Brandy");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		//alcoholsAdded = MRPStore.addAlcoholName("Soju");
		//System.out.println("Alcohols added " + alcoholsAdded);
		
		
		MRPStore.readAlcoholDetails();
		
			boolean updatedAlco=MRPStore.updateMRP("soju","Brandy");
				System.out.println("updated MRP is " + updatedAlco);
				
		MRPStore.readAlcoholDetails();	

			boolean deletedAlcohol=MRPStore.deleteMRP("Singani");
				System.out.println("alcohol deleted is " + deletedAlcohol);
				
		MRPStore.readAlcoholDetails();		
	
	}

}