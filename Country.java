class Country{

    String countryName;
	int countryId;
	int noOfStates;
	String primeMinister;
	String population;
	
	public Country(){
		System.out.println();
	}
	
	public Country(String countryName,int countryId,int noOfStates,String primeMinister,String population){
		this.countryName=countryName;
		this.countryId=countryId;
		this.noOfStates=noOfStates;
		this.primeMinister=primeMinister;
		this.population=population;
	}
}




