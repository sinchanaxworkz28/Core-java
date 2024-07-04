class Umbrella{
 public static void main(String[] args){
   System.out.println("main started");
   getFeatures();
   System.out.println("main ended");
  }
  
  
 public static void getFeatures(){
   System.out.println("getFeature method started");
   String color = "Grey";
   int size = 124*65;
  String brand = "Intex";
  String material = "Polyvinyl Chloride";
  double weight = 3.5; 

  System.out.println("The color of the umbrella is " + color);
  System.out.println("The size of the umbrella is " + size);
   System.out.println("The brand of the umbrella is " + brand);
   System.out.println("The material used in the umbrella is " + material);
   System.out.println("getFeature method started");
   return;
  
  }
 }