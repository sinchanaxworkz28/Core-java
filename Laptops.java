class Laptops{
	 
	
	public static void main(String lap[]){
	fetchProductDetails();
	
	}
	public static void fetchProductDetails(){
	System.out.println("Fetch Product Details started");
	String brandName = "lenevo";
	String modelName = "Vostro";
	String screenSize = "18 Inches";
	String colour = "black";
	String hardDiskSize = "512 GB";
	String CPUModel = "Core i5 Family";
    String RAMMemoryInstalledSize =	"8 GB";
	
	
	System.out.println("The Brand Name is "+brandName);
	System.out.println("The Model Name is "+modelName   );
	System.out.println("The Screen Size is "+screenSize  );
	System.out.println("The Colour is "+colour  );
	System.out.println("The Hard Disk Size "+hardDiskSize  );
	System.out.println("The CPUModel "+CPUModel  );
	System.out.println("The RAM Memory Installed Size is "+RAMMemoryInstalledSize );
	System.out.println("Fetch Product Details ended");
	return;
		}
}
