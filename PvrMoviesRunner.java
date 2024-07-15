class PvrMoviesRunner{

	public static void main(String[] movieTicket){
	
	System.out.println("Movie Ticket started");
	String movie = "Kalki";
	double price = PvrMovies.getMoviePiceByName(movie);
	System.out.println( movie +  " Movie Ticket price is :" + price);
	System.out.println("Movie Ticket ended");
	
	}
}