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




}