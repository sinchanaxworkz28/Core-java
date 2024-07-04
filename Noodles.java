class Noodles{

static String name = "Maggi" ;
static int price  = 20;
static int foundedYear = 1884;
static String headquarters = "Switzerland";
static String ingredients[] = {"Refined wheat flour" , "Palm oil" , "Wheat gluten" , "Iodised Salt" , "Thickeners"};

	public static void main(String fastfood[]){
		
		System.out.println("Noodel name is "  +  name);
		System.out.println("Price of " +  name  +  " is "  +  price);
		System.out.println("Founded year of "  +  name + " is "  +  foundedYear);
		System.out.println("headQuarters of "  +  name + " is "  +  headquarters);
		System.out.println("ingredients of "  +  name  +  " are " );
		for(String ingredient : ingredients){
			System.out.println(ingredient);
		}
	}
}	