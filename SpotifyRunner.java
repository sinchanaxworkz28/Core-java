class SpotifyRunner{

    public static void main(String[] spotify){
	
	    System.out.println("Main Started");
		boolean spotifyAccountCreated = SpotifyAccountCreated.createSpotifyAccount("Sinchana", "sinchana@1234", "sinchana@gmail.com", "sinchana@gmail.com", "28/07/2002");
	    
		    if(spotifyAccountCreated == true)
		     SpotifyAccountCreated.readSpotifyAccountDetails();
		 
		System.out.println("Main Ended");
		
	
	}




}
