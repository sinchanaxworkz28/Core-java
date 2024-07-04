class Shampoo{
 public static void main(String[] loreal){
   System.out.println("main started");
   getFeatures();
   System.out.println("main ended");
  }
  
  
 public static void getFeatures(){
   System.out.println("getFeature method started");
   String itemForm	= "Liquid";
   String hairType =	"Dry";
   String productBenefits	= "Smoothening,Nourishing,Strengthening,Moisturizing,Anti-breakage,Breakage";
   String liquidVolume =	"540 Millilitres";
   int numberOfItems	= 2;
		
			System.out .println("The item form is " + itemForm);
			System.out .println("The hair type is " + hairType);
			System.out .println("The product benefits is " + productBenefits);
			System.out .println("The product volume is "  + liquidVolume);
			System.out .println("The number of item is  " + numberOfItems);
   System.out.println("getFeature method started");
   return;
  
  }
 }