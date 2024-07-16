class SwiggyRunner{

public static void main(String[] food){
String name = "Pizza";
double price = Swiggy.search(name,5);
 // price = Swiggy.search(name , 5);
	System.out.println("cost of 5 " + name + " is " + price);

}
}