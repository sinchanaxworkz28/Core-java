import java.util.Arrays;

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

	public static boolean updateMRP(String newAlcohol,String oldAlcohol){
		boolean isUpdateMRP=false;
		for(int position=0;position<alcoholNames.length;position++){
			if(alcoholNames[position]==oldAlcohol){
				alcoholNames[position]=newAlcohol;
				isUpdateMRP=true;
			}
		}
				
		if(isUpdateMRP==false)
				System.out.println("alcohol MRP not updated");
			
		return isUpdateMRP;	
			}
			
			
	public static boolean deleteMRP(String alcoholName){
		boolean isDeleteMRP = false;
		int position,newPosition;
		for(position=0,newPosition=0;position<alcoholNames.length;position++){
			if(alcoholNames[position]!=alcoholName){
				alcoholNames[newPosition]=alcoholNames[position];
				newPosition++;
				
			}
			isDeleteMRP=true;
			
		}
		int newLength=newPosition;
		alcoholNames=Arrays.copyOf(alcoholNames,newLength);
		
		if(isDeleteMRP==false)
			System.out.println("alcohol is not deleted");
		
		return isDeleteMRP;
	}

}