class XworkzRegistration{

    static String firstName ;
	static long phoneNumber ;
	static String mailId ;
	static String usn ;
	static int yop ;
	static String clgName ;
	static String branch ;
	static String education ;
	
	public static boolean createXworkzRegistration(String fullName, long contactNumber, String emailId, String uSN, int yearOfPassedOut, String collegeName, String stream, String qualification){
	
	    boolean isXworkzRegistrationCreated = false ;
		//validation  //  null check
		boolean isFullNameValid = false ;	
		    if(fullName != null){
			    firstName = fullName ;
				isFullNameValid = true ;
			}
			else
			    System.out.println("Full Name Invalid");
			
		boolean isContactNumberValid = false ;		
			if(contactNumber != 0.0){
			    phoneNumber = contactNumber ;
				isContactNumberValid = true ;
			}
			else
			    System.out.println("Contact Number Invalid");
		
		boolean isEmailIdValid = false ;	
			if(emailId != null){
			    mailId = emailId ;
				isEmailIdValid = true ;
			}
			else
			    System.out.println("Email Id Invalid");
			
		boolean isUSNValid = false ;	
			if(uSN != null){
			    usn = uSN ;
				isUSNValid = true ;
			}
			else
			    System.out.println("USN Invalid");
		
		boolean isYearOfPassedOutValid = false ;	
			if(yearOfPassedOut != 0.0){
			    yop = yearOfPassedOut ;
				isYearOfPassedOutValid = true ;
			}
			else
			    System.out.println("Year of Passed out Invalid");
		
		boolean isCollegeNameValid = false ;	
			if(collegeName != null){
			    clgName = collegeName ;
				isCollegeNameValid = true ;
			}
			else
			    System.out.println("College Name Invalid");
		
		boolean isStreamValid = false ;	
			if(stream != null){
			    branch = stream ;
				isStreamValid = true ;
			}
			else
			    System.out.println("Stream Invalid");
			
		boolean isQualificationValid = false ;	
			if(qualification != null){
			    education = qualification ;
				isQualificationValid = true ;
			}
			else
			    System.out.println("Qualification Invalid");
				
			
			
			if(isFullNameValid == true && isContactNumberValid == true && isEmailIdValid == true && isUSNValid == true && isYearOfPassedOutValid == true && isCollegeNameValid == true && isStreamValid == true && isQualificationValid == true)
			isXworkzRegistrationCreated = true ;
		
		
		
		
		
		
		return isXworkzRegistrationCreated;
	}
    
	public static void readXworkzRegistrationDetails(){
		
		 
		System.out.println("fetching... User Details...");
		System.out.println("The Xworkz Registered Student Name is :" + firstName);
        System.out.println("The Xworkz Registered Contact Number is :" + phoneNumber);
		System.out.println("The Xworkz Registered Student Email Id is :" + mailId);
		System.out.println("The Xworkz Registered Student USN is :" + usn);
        System.out.println("The Xworkz Registered Student Year of Passed out is :" + yop);
        System.out.println("The Xworkz Registered Student college Name is :" + clgName);
        System.out.println("The Xworkz Registered Student Stream is :" + branch);
        System.out.println("The Xworkz Registered Student Qualification is :" + education);

	
	
	
	
	
	
		
		
	}
}
	