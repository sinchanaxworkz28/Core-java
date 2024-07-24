class TouristCompany{

    static String touristPlaceNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int start ;
	
	public static boolean addTouristPlaceName(String touristPlaceName){
	
	    boolean isTouristPlaceNameAdded = false ;
		
		isTouristPlaceNameAdded = validatingTouristPlaceDetails(touristPlaceName);
		
		return isTouristPlaceNameAdded ;
	}
	
	public static boolean validatingTouristPlaceDetails(String touristPlaceName){
	
	    boolean isAllFieldValidated = false ;
		if(start<touristPlaceNames.length){
		if(touristPlaceName!=null){
		    touristPlaceNames[start] = touristPlaceName ;
			start++ ;
			isAllFieldValidated = true;
		}
		else
		    System.out.println("Tourist Places is Invalid");
		}else
		    System.out.println("Sorry.. Tourist Places is full");
			
		return isAllFieldValidated ;
		
		}
		
		public static void readTouristPlacesDetails(){
		    System.out.println("The Tourist Places are available :");
			for(String touristPlaceName : touristPlaceNames){
			    System.out.println(touristPlaceName);
			}
		}




}