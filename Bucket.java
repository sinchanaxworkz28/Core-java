class Bucket{
 public static void main(String[] buck){
   System.out.println("main started");
   getFeatures();
   System.out.println("main ended");
  }
  
  
 public static void getFeatures(){
   System.out.println("getFeature method started");
   String  brand = "KOOK";
   String material = "Plastic";
  String color = "Blue";
  int capacity = 15;
  String feature ="Durable";



  System.out.println("The brand of the jug is " + brand);
  System.out.println("The material used is " + material);
  System.out.println("The color of the jug is "+ color);
  System.out.println("The capacity of the jug is " + capacity);
  System.out.println("The feature of the jug is " + feature);
   System.out.println("getFeature method started");
   return;
  
  }
 }