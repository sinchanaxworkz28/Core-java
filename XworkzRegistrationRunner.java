class XworkzRegistrationRunner{

    public static void main(String[] args){
	    boolean xWorkzRegistered = XworkzRegistration.createXworkzRegistration("Sinchana", 9448843479L, "sinchana@gmail.com", "4MC20CS150", 2024, "Malnad college of engineering", "Computer Science and Engineering", "BE");
		
		if(xWorkzRegistered  == true)
		XworkzRegistration.readXworkzRegistrationDetails();
	
	}
}
