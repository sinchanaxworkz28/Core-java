class SBIBankAccount{
        
	    static String givenName ;
		static String midName ;
		static long AadhaarNo ;
		static String nation ;
		static long phoneNumber ;
		static String address ;
		
    public static boolean createBankAccount(String firstName, String middleName, long AadhaarNumber, String nationality, long mobileNumber, String permanentAddress){
	
	     boolean isBankAccountCreated = false ;
		 
		
		boolean isFirstNameValid = false ;	
		 if(firstName != null){
			givenName = firstName ;
			isFirstNameValid = true ;
		 }
		 else
			 System.out.println("First Name is Invalid");
		 
		boolean isMiddleNameValid = false ; 
		 if(middleName != null){
			  midName = middleName ;
			  isMiddleNameValid = true ;
		 }
		 else
			System.out.println("Middle Name Invalid");
		
		boolean isAadhaarNumberValid = false ;
		if(AadhaarNumber != 0){
		 AadhaarNo = AadhaarNumber ;
		 isAadhaarNumberValid = true ;
		}
		else
			System.out.println("Aadhaar Number Invalid");
		
		boolean isNationalityValid = false ;
		if(nationality != null){
           nation = nationality ;
		   isNationalityValid = true ;
		}
		else
			System.out.println("Nationality is Invalid");
		
		boolean isMobileNumberValid = false ;	
        if(mobileNumber != 0.0){
		 phoneNumber = mobileNumber ;
		 isMobileNumberValid = true ;
		}
		else
			System.out.println("Mobile Number Invalid");
		
		 boolean isPermanentAddressValid = true ;
		if(permanentAddress != null){
		 address = permanentAddress ;
         isPermanentAddressValid = true ;		 
		}
		else
			System.out.println("Permanent Address Invalid");
		
		 isBankAccountCreated = true ;
		 
		 return isBankAccountCreated ;
	
	}
    
	public static void readBankAccountDetails(){
	
	    System.out.println("fetching... Student Details...");
		System.out.println("The Customer First Name is :" + givenName);
		System.out.println("The Customer Middle Name is :" + midName);
		System.out.println("The Customer Aadhaar Number is :" + AadhaarNo);
		System.out.println("The Customer Nationality is :" +nation);
		System.out.println("The Customer Mobile Number is :" + phoneNumber);
		System.out.println("The Customer Permanent Address is :" + address);
		
		
	
	}
}