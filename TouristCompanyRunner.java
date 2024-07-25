class TouristCompanyRunner{

    public static void main(String[] places){
	
	    boolean touristPlaceAdded = TouristCompany.addTouristPlaceName("Hlebeedu");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Belur");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Mysore");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Coorg");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Banglore");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Badami");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Hampi");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Gokarna");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Chicmagalur");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Udupi");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		//touristPlaceAdded = TouristCompany.addTouristPlaceName("Jog Fall");
		//System.out.println("Tourist places added " + touristPlaceAdded);
		
		
		
		TouristCompany.readTouristPlacesDetails();
		
		boolean updatedPlace=TouristCompany.updateTouristPlace("Hampi","Jog Fall");
			System.out.println("tourist place updated is"+updatedPlace);
		
		TouristCompany.readTouristPlacesDetails();
		
		boolean placeDeleted = TouristCompany.deletePlace("Mysore");
			System.out.println("deleted place is" + placeDeleted);
			
		TouristCompany.readTouristPlacesDetails();	
	
	}

}