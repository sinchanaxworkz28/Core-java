class House{
	String houseID;
	int noOfRooms;
	int noOfFloors;
	String houseName;
	String areaInSqrt;
	int noOfMembers;
	
	public House(){
		System.out.println("House details created");
	}
	public House(String houseID,int noOfRooms,int noOfFloors,String houseName,String areaInSqrt,int noOfMembers){
		this.houseID = houseID;
		this.noOfRooms=noOfRooms;
		this.noOfFloors=noOfFloors;
		this.houseName=houseName;
		this.areaInSqrt=areaInSqrt;
		this.noOfMembers=noOfMembers;
	}
}