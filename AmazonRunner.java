class AmazonRunner{

    public static void main(String[] args){
	
	    System.out.println("Main Started");
		boolean amazonAccountCreated = Amazon.createUserAccount("sinchana", "raj", 7411456495L, "sinchana@gmail.com", "sinchana@1234", "sinchana@1234");
		
		if(amazonAccountCreated == true)
		Amazon.readUserAccountDetails();
		System.out.println("Main Ended");
	
	}
}

