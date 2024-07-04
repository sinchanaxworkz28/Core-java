class Food{
 public static void main(String[] snacks){
   System.out.println("main started");
   getFeatures();
   System.out.println("main ended");
  }
  
  
 public static void getFeatures(){
   System.out.println("getFeature method started");
        String fruitName = "PineApple";
		int price = 150;
		String color = "Yellow";
		String placeOfOrigin = "Kolar";
	
			System.out.println("The fruit name is "  +  fruitName);
			System.out.println("The fruit price is "  +  price);
			System.out.println("The fruit color is " + color);
			System.out.println("The fruit origin place is " + placeOfOrigin);
   System.out.println("getFeature method started");
   return;
  
  }
 }