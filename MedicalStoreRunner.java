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
		
		medicinesAdded = MedicalStore.addMedicineNa("Azithromycin");
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
		
		medicinesAdded = MedicalStore.addMedicineName("Levothyroxine");
		System.out.println("Medicines added " + medicinesAdded);
		
		
		
		MedicalStore.readMedicineDetails();
		
		
	
	}

}