import java.util.Arrays;

class JuiceShop{

    static String juiceNames[] = {null, null, null, null, null, null,null,null};
	static int start ;
	
    public static boolean addJuiceName(String juiceName){
	
	    boolean isJuiceNameAdded = false;
	    
		isJuiceNameAdded = validatingJuiceDetails(juiceName);
		
	    return isJuiceNameAdded ;
		
	}
	
	public static boolean validatingJuiceDetails(String juiceName){
		
		boolean isAllFieldValidated = false;
	    
		if(start<juiceNames.length){
	    if(juiceName != null){
	        juiceNames[start++] = juiceName ;
			isAllFieldValidated = true ;
	    }
		else
		    System.out.println("Juice Name is Invalid");
		}else
			System.out.println("Sorry... Juice are limited");
		
		
		return isAllFieldValidated ;
	}
	
	public static void readJuiceDetails(){
	
	    System.out.println("The Juices are:");
		for(String juiceName : juiceNames){
		    System.out.println(juiceName);
		}
	}
	
	
public static boolean updateJuiceName(String newJuiceName, String oldJuiceName){
		boolean isJuiceNameUpdated=false;
		for(int position=0;position<juiceNames.length;position++){
			if(juiceNames[position]==oldJuiceName){
				juiceNames[position]=newJuiceName;
				isJuiceNameUpdated=true;
			}
		
		}
		if(isJuiceNameUpdated == false)
			System.out.println("juice name not found");
		
		return isJuiceNameUpdated;
	}
	
	public static boolean deleteJuiceName(String juiceName){
		boolean isJuiceNameDeleted = false;
		int position,newPosition;
		for(position=0,newPosition=0;position<juiceNames.length;position++){
			if(juiceNames[position]!=juiceName){
				juiceNames[newPosition] = juiceNames[position];
				newPosition++;
			}
		else
			isJuiceNameDeleted=true;
		}
		
		int newLength=newPosition;
		juiceNames=Arrays.copyOf(juiceNames,newLength);
		
		if(isJuiceNameDeleted=false)
			System.out.println("juice not found");
	
			return isJuiceNameDeleted;
	}
}