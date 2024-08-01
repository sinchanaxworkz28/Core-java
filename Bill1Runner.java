class BillRunner{

	public static void main(String[] arg){

 Bill ref = new Bill();
 
		ref. billReferenceId=15456;
		ref.billSequenceNo=1;
		ref.billIssueDate="23/07/2024";
		ref.billDueDate="31/07/2024";
		ref.isBillPaid = false;
		ref.isLatestBill= true;
		ref.isFinalBill=false;
		ref.billAmount= 546.74;
		ref.taxInclusiveBill=true;

	System.out.println("First bill is generated ");

	System.out.println("Bill reference number is " + ref. billReferenceId);
	System.out.println("Bill sequence number is " + ref.billSequenceNo);
	System.out.println("Bill issue date is " + ref.billIssueDate);
	System.out.println("Bill due date is " +ref.billDueDate );
	System.out.println("Is this is bill paid " + ref.isBillPaid);
	System.out.println("is this bill is latest " +ref.isLatestBill );
	System.out.println("Is this bill is final " +ref.isFinalBill );
	System.out.println("The final amount of bill is  " + ref.billAmount);
	System.out.println("Is this bill include tax " + ref.taxInclusiveBill);
	
	
Bill bill = new Bill();	
	
		bill.billReferenceId=7458;
		bill.billSequenceNo=2;
		bill.billIssueDate="13/03/2024";
		bill.billDueDate="28/03/2024";
		bill.isBillPaid = false;
		bill.isLatestBill= false;
		bill.isFinalBill=false;
		bill.billAmount= 6478.73;
		bill.taxInclusiveBill=true;
		
	System.out.println(" second bill is generated ");

	System.out.println("Bill reference number is " + bill.billReferenceId);
	System.out.println("Bill sequence number is " + bill.billSequenceNo);
	System.out.println("Bill issue date is " + bill.billIssueDate);
	System.out.println("Bill due date is " +bill.billDueDate );
	System.out.println("Is this is bill paid " + bill.isBillPaid);
	System.out.println("is this bill is latest " +bill.isLatestBill );
	System.out.println("Is this bill is final " +bill.isFinalBill );
	System.out.println("The final amount of bill is  " + bill.billAmount);
	System.out.println("Is this bill include tax " + bill.taxInclusiveBill);	
	
	
Bill nextBill = new Bill();
		
		nextBill.billReferenceId=3245;
		nextBill.billSequenceNo=3;
		nextBill.billIssueDate="13/01/2024";
		nextBill.billDueDate="28/01/2024";
		nextBill.isBillPaid = false;
		nextBill.isLatestBill= false;
		nextBill.isFinalBill=false;
		nextBill.billAmount= 345.80;
		nextBill.taxInclusiveBill=true;
		
		
	System.out.println(" Third bill is generated ");

	System.out.println("Bill reference number is " + nextBill.billReferenceId);
	System.out.println("Bill sequence number is " + nextBill.billSequenceNo);
	System.out.println("Bill issue date is " + nextBill.billIssueDate);
	System.out.println("Bill due date is " +nextBill.billDueDate );
	System.out.println("Is this is bill paid " + nextBill.isBillPaid);
	System.out.println("is this bill is latest " +nextBill.isLatestBill );
	System.out.println("Is this bill is final " +nextBill.isFinalBill );
	System.out.println("The final amount of bill is  " + nextBill.billAmount);
	System.out.println("Is this bill include tax " + nextBill.taxInclusiveBill);	

		
Bill1 ref4 = new Bill1();

		ref4.billReferenceId = 34146;
		ref4.billSequenceNo = 5 ;
		ref4.billIssueDate = "14/11/2024";
		ref4.billDueDate = "30/11/2024";
		ref4.isBillPaid = false;
		ref4.isLatestBill = true;
		ref4.isFinalBill = false;
		ref4.billAmount = 234.90;
		ref4.taxInclusiveBill = true;
		
		System.out.println("Fourth bill generated");
		System.out.println("Bill Reference Id is " + ref4.billReferenceId);
		System.out.println("Bill Sequence Number is " + ref4.billSequenceNo);
		System.out.println("Bill Issue Date is " + ref4.billIssueDate);
		System.out.println("Bill Due Date is " + ref4.billDueDate);
		System.out.println("Bill is Paid " + ref4.isBillPaid);
		System.out.println("Latest Bill is " + ref4.isLatestBill);
		System.out.println("Final Bill is " + ref4.isFinalBill);
		System.out.println("Bill Amount is " + ref4.billAmount);
		System.out.println("Tax Inclusive the Bill is " + ref4.taxInclusiveBill);
		
		Bill1 ref5 = new Bill1();
		ref5.billReferenceId = 566869;
		ref5.billSequenceNo = 6 ;
		ref5.billIssueDate = "14/12/2024";
		ref5.billDueDate = "30/12/2024";
		ref5.isBillPaid = false;
		ref5.isLatestBill = true;
		ref5.isFinalBill = false;
		ref5.billAmount = 456.98;
		ref5.taxInclusiveBill = true;
		System.out.println("Fifth bill generated");
		System.out.println("Bill Reference Id is " + ref5.billReferenceId);
		System.out.println("Bill Sequence Number is " + ref5.billSequenceNo);
		System.out.println("Bill Issue Date is " + ref5.billIssueDate);
		System.out.println("Bill Due Date is " + ref5.billDueDate);
		System.out.println("Bill is Paid " + ref5.isBillPaid);
		System.out.println("Latest Bill is " + ref5.isLatestBill);
		System.out.println("Final Bill is " + ref5.isFinalBill);
		System.out.println("Bill Amount is " + ref5.billAmount);
		System.out.println("Tax Inclusive the Bill is " + ref5.taxInclusiveBill);
		
Bill1 ref6 = new Bill1();

		ref6.billReferenceId = 46342;
		ref6.billSequenceNo = 6 ;
		ref6.billIssueDate = "15/01/2025";
		ref6.billDueDate = "31/01/2025";
		ref6.isBillPaid = false;
		ref6.isLatestBill = true;
		ref6.isFinalBill = false;
		ref6.billAmount = 435.88;
		ref6.taxInclusiveBill = true;
		
		System.out.println("Sixth bill generated");
		System.out.println("Bill Reference Id is " + ref6.billReferenceId);
		System.out.println("Bill Sequence Number is " + ref6.billSequenceNo);
		System.out.println("Bill Issue Date is " + ref6.billIssueDate);
		System.out.println("Bill Due Date is " + ref6.billDueDate);
		System.out.println("Bill is Paid " + ref6.isBillPaid);
		System.out.println("Latest Bill is " + ref6.isLatestBill);
		System.out.println("Final Bill is " + ref6.isFinalBill);
		System.out.println("Bill Amount is " + ref6.billAmount);
		System.out.println("Tax Inclusive the Bill is " + ref6.taxInclusiveBill);
		
		
Bill1 ref7 = new Bill1();

		ref7.billReferenceId = 54672;
		ref7.billSequenceNo = 7 ;
		ref7.billIssueDate = "15/01/2025";
		ref7.billDueDate = "31/01/2025";
		ref7.isBillPaid = false;
		ref7.isLatestBill = true;
		ref7.isFinalBill = false;
		ref7.billAmount = 546.88;
		ref7.taxInclusiveBill = true;
		
		System.out.println("Seventh bill generated");
		System.out.println("Bill Reference Id is " + ref7.billReferenceId);
		System.out.println("Bill Sequence Number is " + ref7.billSequenceNo);
		System.out.println("Bill Issue Date is " + ref7.billIssueDate);
		System.out.println("Bill Due Date is " + ref7.billDueDate);
		System.out.println("Bill is Paid " + ref7.isBillPaid);
		System.out.println("Latest Bill is " + ref7.isLatestBill);
		System.out.println("Final Bill is " + ref7.isFinalBill);
		System.out.println("Bill Amount is " + ref7.billAmount);
		System.out.println("Tax Inclusive the Bill is " + ref7.taxInclusiveBill);


Bill1 ref8 = new Bill1();

		ref8.billReferenceId = 43537;
		ref8.billSequenceNo = 8 ;
		ref8.billIssueDate = "15/01/2025";
		ref8.billDueDate = "31/01/2025";
		ref8.isBillPaid = false;
		ref8.isLatestBill = true;
		ref8.isFinalBill = false;
		ref8.billAmount = 3435.88;
		ref8.taxInclusiveBill = true;
		
		System.out.println("Eight bill generated");
		System.out.println("Bill Reference Id is " + ref8.billReferenceId);
		System.out.println("Bill Sequence Number is " + ref8.billSequenceNo);
		System.out.println("Bill Issue Date is " + ref8.billIssueDate);
		System.out.println("Bill Due Date is " + ref8.billDueDate);
		System.out.println("Bill is Paid " + ref8.isBillPaid);
		System.out.println("Latest Bill is " + ref8.isLatestBill);
		System.out.println("Final Bill is " + ref8.isFinalBill);
		System.out.println("Bill Amount is " + ref8.billAmount);
		System.out.println("Tax Inclusive the Bill is " + ref8.taxInclusiveBill);		
	
		
	}
	
	
}