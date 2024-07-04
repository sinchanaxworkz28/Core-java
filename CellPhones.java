class CellPhones{

	public static void main (String[] phone){
	fetchProductDetails();
	}

	public static void fetchProductDetails(){
	System.out.println("Fetch Product Details started");
	String brandName = "Redmi";
	int price = 16000;
	String operatingSystem = "Android 13, MIUI 14";
	String RAMMemoryInstalledSize = "6 GB";
	String CPUModel = "Snapdragon";
	String CPUSpeed = "2.4 GHz"; 
	
	
	
	System.out.println("The Brand Name  is "+brandName  );
	System.out.println("The Price is "+ price);
	System.out.println("The Operating System is "+ operatingSystem );
	System.out.println("The RAM Memory Installed Sizeis "+ RAMMemoryInstalledSize );
	System.out.println("The CPU Model is "+CPUModel );
	System.out.println("The CPU Speed is "+CPUSpeed  );	
	System.out.println("Fetch Product Details ended");
	return;

	}
}
