class Spotify{
        
	    static String givenName ;
		static String password ;
		static String emailId ;
		static String confirmEmailId ;
		static String dateOfBirth ;
		
    public static boolean createSpotifyAccount(String userName, String pwd, String email, String confirmEmail, String dob){
	
	    boolean isSpotifyAccountCreated = false ;
		//validation  //  null check 
		boolean isUserNameValid = false ;
		    if(userName != null){
			    givenName = userName ;
				isUserNameValid = true ;
			}
			else
			    System.out.println("User Name Invalid");
		
		boolean isPwdValid = false ;	
			if(pwd != null){
			    password = pwd ;
				isPwdValid = true ;
			}
			else 
			    System.out.println("Password Invalid");
		
		boolean isEmailValid = false ;	
			if(email != null){
			    emailId = email ;
				isEmailValid = true ;
			}
			else 
			    System.out.println("Email Id Invalid");
		
		boolean isConfirmEmailValid = false ;	
			if(confirmEmail != null){
			    confirmEmailId = confirmEmail ;
				isConfirmEmailValid = true ;
			}
			else
			    System.out.println("Confirm Email Id Invalid");
			
		boolean isDobValid = false ;	
			if(dob != null){
			    dateOfBirth = dob ;
				isDobValid = true ;
			}
			else
			    System.out.println("Date of Birth is Invalid");
		    
			
			if(isUserNameValid == true && isPwdValid == true && isEmailValid == true && isConfirmEmailValid == true && isDobValid == true){
			isSpotifyAccountCreated = true ;
			}
		return isSpotifyAccountCreated;
	}
    
	public static void readSpotifyAccountDetails(){
		
		 
		System.out.println("fetching... User Details...");
		System.out.println("The Spotify userName is :" + givenName);
		System.out.println("The Spotify User Password is :" + password);
		System.out.println("The Spotify User Email is :" + emailId);
		System.out.println("The Spotify User Confirm Email  is :" + confirmEmailId);
		System.out.println("The Spotify User Date of Birth is :" + dateOfBirth);
	
		
		
	}
}