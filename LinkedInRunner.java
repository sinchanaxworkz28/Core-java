class LinkedInRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			boolean LinkedInAccountCreated = LinkedIn.createLinkedInAccount(null , "Raj" , "Halebeede" , "Bangalore" , 7411456487L , "sinchana@gmail.com" , "28/07/2002" , "BE" , "VTU" , "nothing" , "sinchana@2002" , "sinchana@2002");
			
			if(LinkedInAccountCreated ==true)
			LinkedIn.readUserLinkedInAccountDetails();
		System.out.println("Main Ended");
	}
}