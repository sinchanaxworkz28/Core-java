class CanaraBankAccountRunner{

    public static void main(String[] args){
	
	    System.out.println("Main Started");
	    boolean canaraBankAccountCreated = CanaraBankAccount.createBankAccount("Sinchana", "Raj", 7412589632L, "Indian", 7411459874L, "Hassan");
		
		if(canaraBankAccountCreated == true)
		CanaraBankAccount.readBankAccountDetails();
		System.out.println("Main Ended");
	
	}
}
