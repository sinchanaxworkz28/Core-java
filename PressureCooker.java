class PressureCooker{
 public static void main(String[] cooker){
   System.out.println("main started");
   getFeatures();
   System.out.println("main ended");
  }
  
  
 public static void getFeatures(){
   System.out.println("getFeature method started");
   String color = "silver";
   String material = "stainlessSteel";
   String brand = "Prestige";
   int weight = 2;
   System.out.println("The color of the cooker is " + color);
   System.out.println("The material of the cooker is " + material);
   System.out.println("The brand of the cooker is " + brand);
   System.out.println("The weight of the cooker is " + weight);
   System.out.println("getFeature method started");
   return;
  
  }
 }