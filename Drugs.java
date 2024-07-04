class Drugs{
 public static void main(String[] medicin){
   System.out.println("main started");
   getFeatures();
   System.out.println("main ended");
  }
  
  
 public static void getFeatures(){
   System.out.println("getFeature method started");
   String name = " yes Medical Shop";
	String tablets[] = {"dolo" , "monticough" , "citrizen" , "cipla" };
	for(int ref = 0; ref < tablets.length ; ref++){
		String value = tablets[ref];
		System.out.println(value);
	}
   System.out.println("getFeature method started");
   return;
  
  }
 }