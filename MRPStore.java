class MRPStore{

    static String alcoholNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int start ;
	
	public static boolean addAlcoholName(String alcoholName){
	
	    boolean isAlcoholNameAdded = false ;
		
		isAlcoholNameAdded = validatingAlcoholDetails(alcoholName);
		
		return isAlcoholNameAdded ;
	}
	
	public static boolean validatingAlcoholDetails(String alcoholName){
	
	    boolean isAllFieldValidated = false ;
		if(start<alcoholNames.length){
		if(alcoholName!=null){
		    alcoholNames[start] = alcoholName ;
			start++ ;
			isAllFieldValidated = true;
		}
		else
		    System.out.println("Alcohol Name is Invalid");
		}else
		    System.out.println("Sorry.. That Alcohol is to far");
			
		return isAllFieldValidated ;
		
		}
		
		public static void readAlcoholDetails(){
			for(String alcoholName : alcoholNames){
			    System.out.println(alcoholName);
			}
		}




}