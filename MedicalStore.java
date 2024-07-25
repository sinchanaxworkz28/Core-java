import java.util.Arrays;


class MedicalStore{

    static String medicineNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int start ;
	
	public static boolean addMedicineName(String medicineName){
	
	    boolean isMedicineNameAdded = false ;
		
		isMedicineNameAdded = validatingMedicineDetails(medicineName);
		
		return isMedicineNameAdded ;
	}
	
	public static boolean validatingMedicineDetails(String medicineName){
	
	    boolean isAllFieldValidated = false ;
		if(start<medicineNames.length){
		if(medicineName!=null){
		    medicineNames[start] = medicineName ;
			start++ ;
			isAllFieldValidated = true;
		}
		else
		    System.out.println("Medicine Name is Invalid");
		}else
		    System.out.println("Sorry.. Medicines are not available");
			
		return isAllFieldValidated ;
		
		}
		
		public static void readMedicineDetails(){
		    System.out.println("The Required Medicines are :");
			for(String medicineName : medicineNames){
			    System.out.println(medicineName);
			}
		}
		
		
		public static boolean updateMadicine(String newMedicine,String oldMedicine){
			boolean isMedicineUpdated = false;
			for(int position=0;position<medicineNames.length;position++){
				if(medicineNames[position]==oldMedicine){
					medicineNames[position]=newMedicine;
				isMedicineUpdated = true;
				}
			}	
				if(isMedicineUpdated==false)
					System.out.println("tea name not updated");
				
				return isMedicineUpdated;
				}
	
	public static boolean deleteMedicine(String medicineName){
		boolean isMedicinedeleted =false;
		int position,newPosition;
		for(position=0,newPosition=0;position<medicineNames.length;position++){
			if(medicineNames[position]!=medicineName){
				medicineNames[newPosition]=medicineNames[position];
				newPosition++;
			}
		else 
			isMedicinedeleted=true;
		}
		int newLength=newPosition;
			medicineNames=Arrays.copyOf(medicineNames,newLength);
		
			if(isMedicinedeleted==false)
					System.out.println("medicine not found");
				
			return isMedicinedeleted;	
	}


}