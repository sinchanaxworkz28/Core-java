class JuiceShop{
	static String teaNames[] = {null, null, null, null, null, null};
	static int start;
	
	public static boolean addTeaName(String teaName){
		boolean isTeaNameAdded = false;
		
		if(start<teaNames.length){
			
			
			if(teaName!=null){
				teaNames[start++]=teaName;
				isTeaNameAdded = true;
			}
	
			else
				System.out.println("tea name is invalid");
		}
		else
			System.out.println("sorry.. out of limit");
		
			isTeaNameAdded=false;
	return isTeaNameAdded;
	}
	
	public static void getTeaNames(){
	for(String chaiNames:teaNames)
		System.out.println("added tea names :" + chaiNames);
	
	}




}




}