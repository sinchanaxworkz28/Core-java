class Amazon{
        
	    static String givenName ;
		static String surName ;
		static long phoneNumber ;
		static String mailId ;
		static String password ;
		static String confirmPassword ;
		
    public static boolean createUserAccount(String firstName, String lastName, long mobileNumber, String email, String pwd, String confirmPwd){
	
	     boolean isAmazonAccountCreated = false ;
		
		boolean isFirstNameValid = false ; 
		 if(firstName != null){
		    givenName = firstName ;
            isFirstNameValid = true ;			
		 }
		 else
			 System.out.println("First Name is Invalid");
		
		boolean isLastNameValid = false ;	
		 if(lastName != null){
			surName = lastName;
			isLastNameValid = true ; 
		 }
		 else
			System.out.println("Last Name is Invalid");
		
		 boolean isMobileNumberValid = false ; 
		if(mobileNumber != 0.0){
			 phoneNumber = mobileNumber ;
			 isMobileNumberValid = true ;
		}
		else
			System.out.println("Mobile Number is Invaid");
		
		boolean isEmailValid = false ;
		if(email != null){
			 mailId = email ;
			 isEmailValid = true ;
		}
		else
			System.out.println("Email Invalid");
		
		boolean isPwdValid = false ;
		if(pwd != null){
			password = pwd ;
			isPwdValid = true ;
		}
		else
			System.out.println("Password Invalid");
		
		boolean isConfirmPwdValid = false ;
		if(confirmPwd != null){
			confirmPassword = confirmPwd ;
			isConfirmPwdValid = true ;
		}
		else
			System.out.println("Confirm Password Invalid");
		 
        if(isFirstNameValid == true && isLastNameValid == true && isMobileNumberValid == true && isEmailValid == true && isPwdValid == true && isConfirmPwdValid == true) 
		isAmazonAccountCreated = true ;
		 
		 return isAmazonAccountCreated ;
	
	}
    
	public static void readUserAccountDetails(){
	
	    System.out.println("fetching... Student Details...");
		System.out.println("The User First Name is :" + givenName);
		System.out.println("The User Last Name is :" + surName);
		System.out.println("The User Phone Number is :" + phoneNumber);
		System.out.println("The User email Id is :" + mailId);
		System.out.println("The User Password is :" + password);
		System.out.println("The User Confirm Password is :" + confirmPassword);
	
	}
}