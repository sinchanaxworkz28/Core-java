class MedicalStoreRunner{

    public static void main(String[] medicines){
	
	    boolean medicinesAdded = MedicalStore.addMedicineName("Amoxicillin");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Albuterol");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Albuterol");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Atorvastatin");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Azithromycin");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Metoprolol");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Atorvastatin");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Losarton");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Omeprazol");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Losartan");
		System.out.println("Medicines added " + medicinesAdded);
		
		
		MedicalStore.readMedicineDetails();
		
		boolean medicineUpdated = MedicalStore.updateMadicine("Paracetamol","Omeprazol");
			System.out.println("Medicine updated to " + medicineUpdated);
			
		MedicalStore.readMedicineDetails();	
		
		boolean medicineDeleted = MedicalStore.deleteMedicine("Losartan");
			System.out.println("deleted medicine is" + medicineDeleted);
			
		MedicalStore.readMedicineDetails();	
	} 

}