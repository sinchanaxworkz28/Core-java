class LoanApplicationRunner{

    public static void main(String[] loan){
	
	    System.out.println("Main Started");
		boolean loanApplication = LoanApplication.createLoanApplication(1000, "Home Loan", "Sinchana", "HDFC", 10, 10);
	    
		    if(loanApplicationCreated == true)
		     LoanApplicationCreated.readLoanApplicantsDetails();
		 
		System.out.println("Main Ended");
		
	
	}




}
