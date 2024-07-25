import java.util.Arrays;

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
	
	public static boolean updateTouristPlace(String newPlace,String oldPlace){
			boolean isPlaceUpdated = false;
			for(int position=0;position<touristPlaceNames.length;position++){
				if(touristPlaceNames[position]==oldPlace){
					touristPlaceNames[position]=newPlace;
				isPlaceUpdated = true;
				}
			}	
				if(isPlaceUpdated==false)
					System.out.println("Place name not updated");
				
				return isPlaceUpdated;
				}
	
	public static boolean deletePlace(String touristPlaceName){
		boolean isPlacedeleted =false;
		int position,newPosition;
		for(position=0,newPosition=0;position<touristPlaceNames.length;position++){
			if(touristPlaceNames[position]!=touristPlaceName){
				touristPlaceNames[newPosition]=touristPlaceNames[position];
				newPosition++;
			}
		else 
			isPlacedeleted=true;
		}
		int newLength=newPosition;
			touristPlaceNames=Arrays.copyOf(touristPlaceNames,newLength);
		
			if(isPlacedeleted==false)
					System.out.println("tourist place not found");
				
			return isPlacedeleted;	
	}

}