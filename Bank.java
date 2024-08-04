class Bank{

    int bankId;
    String bankName;
	String branchName;
	String ifscCode;
	String swiftCode;
	int noOfWorker;
	String branchManagerName;
	
	
	public Bank(){
		System.out.println("Bank details created");
	}
	
	public Bank(int bankId,String bankName, String branchName, String ifscCode, String swiftCode, int noOfWorker, String branchManagerName){
		this.bankId=bankId;
		this.bankName=bankName;
		this.branchName=branchName;
		this.ifscCode=ifscCode;
		this.swiftCode=swiftCode;
		this.noOfWorker=noOfWorker;
		this.branchManagerName=branchManagerName;
	}
}