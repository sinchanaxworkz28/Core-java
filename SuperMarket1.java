class SuperMarket1{

	public static void main(String product[]){
	
		String groceries[] = {"Wheat" , "Rice" , "Green grams" , "urad dal" , "Ragi" , " Sugar" , "Cooking oil" , "Salt" , "jaggery" , "Toor Dal" , "Pure Ghee" ,"Cumin" , "Almond" , "Olive Oil" , "Peanuts" };
		String vegetables[] = {"Potato" , "Garlic" , "Drum Stick" , "Onion" , "Carrot" , "Coriander Leaves" , "Ladis Finger" , "Cucumber" , "Capsicum" , "Cauliflower" , "Green Chilli" , "Beetroot" , "Palak" , "Beans" , "Brinjal" , "Radish" };
		String perfurms[] = {"Cacharel" , " Cerruti" , "Chanel" , "Ardell" , "Aveda" , "Azzaro" , "Balmain" , "Beautify" , "Balgari" , "Eacada" , "Esprit" , "Fendi" , "Ghost" , "Gucci" , "Fogg"}; 
		String fruits[] = {"Apple" , "Mango" , "Grapes" , "Banana" , "Pomegranate" , "Papaya" , "Pine Apple" , "Jack Fruit" , "Orange" , "Chikoo" , "WaterMelon" , "Cherry" , "Pear" , "Avocado" , "Strawberry"};
		String snacks[] = {"Potato Chips" , "Banana Chips" , "Popcorn" , "Bingo" , "Lays" , "Kurkure" , "Doritos" , "Salted Peanut" , "Sunflower Seeds" , "Raisins" , "Pringles" , "Tostisos" , "Corn Snacks" , "Apple Chips" , "Mixed Nuts"};
		String chocolates[] = {"Kit Kat" , "Dairy Milk" , "Londonderry" , "Milky Bar" , "Perk" , "Ferrero Rocher" , "Gems" , "Munch" , "Melody" , "Bournville" , "Dark Fantasy" , "Bourbon" , "Lotte ChocoPie" , "Hajmola" , "Orange Bite"};
		String sweets[] = {"Gulab Jamun" , "Jilebi" , "Barfi" , "Mysore Pak" , "Peda" , "Rasgulla" , "Carrot Halwa" , "Kaju Katlli" , "Payasa" , "Modaka" , "Laddu" , "Ras Malai" , "Sona Papdi" , "Besan Laddu" , "Laddu"};
		String cosmetics[] = {"Concealer" , "Eyelinear" , "Foundation" , "Mascara" , "Eyeshadow" , "Primer" , "Lip Gloss" , "Kajal" , "Lip Linees" , "Brightener" , "Face Powder" , "Compact" , "BB Cream" , "Moisturizer" , "Setting Sprays"};
		String houseHoldProducts[] = {"Dinner Plates" , "Cups" , "Coffee Mugs" , "Spoons" , "Knife" , "Chairs" , "Table" , "Sofa" , "Bowls" , "Hangers" , "Cutting board" , "Micro Wave" , "Towels" , "Lamps" , "Door Mat"};
		String coolDrinks[] = {"Slice" , "Frooti" , "Coca Cola" , "Mirinda" , "Sprite" , "Pepsi" , "Fanta" , "Maaza" , "Mountain Dew" , "Diet Pepsi" , "Coke Zero" , "Sunkist" , "7Up" , "Crush" , "Schweppes"};
		String biscuits[] = {"Parle-G" , "Britannia" , "Sunfeast" , "Unibic" , "Oreo" , "Mariegold" , "Nutri Choice" , "Bourbon" , "Good Day" , "Bourbon" , "Little Hearts" , "Vita marie Gold" , "Tiger Choco" , "Krackjack" , "Happy Happy"};
		String toys[] = {"Doll" , "Ball" , "Teddy Bear" , "Kite" , "Rubber Ducky" , "Ballon" , "Toy Car" , "Pool" , "Toy Rocket" , "Alphabet Blocks" , "Jigsaw Puzzle" , "Building Blocks" , "Pinwheel" , "Toy Plane" , "Yo Yo"};
		String fashion[] = {"Jacket" , "Maxi" , "Pants" , "Cap" , "T-Shirts" , "Skirt" , "Pyjamas" , "Tie" , "Trousers" , "Scarf" , "Shorts" , "Hat" , "Hoodies" , "Tank Top" , "Bodycon Dress"};
		String icecream[] = {"Cone" , "Cup" , "Candy" , "Vanilla" , "Strawberry" , "Chocolate" , "BlueBerry" , "Cookies abd cream" , "Butterscotch" , "Kulfi" , "Kesar Pista" , "Popsicle" , "Caramel" , "Double Stick" , "Chocobar"};
		String alcohol[] = {"Red Wine" , "White Wine" , "Vodka" , "Gin" , "Whiskey" , "Rum" , "Beer" , "Vermouth" , "Tequila" , "Liqueur" , "Cognac" , "Chocolate Liqueur" , "Sangria" , "Absinthe" , "Herbal Liqueur"};
 
// System.out.println("Available Groceries Are :" + groceries[0]+" , " + groceries[1]+ " , " + groceries[2] + " , "+ groceries[3] + " ," + groceries[4] + " , " +groceries[5] + " , "+ groceries[6] + " , " + groceries[7] + " , " + groceries[8] + " , " + groceries[9] + " , " + groceries[10] + " , " + groceries[11] + " , " + groceries[12] + " , " + groceries[13] + " , " + groceries[14]);
 
	for(String grocerie : groceries){
		System.out.println(grocerie);
	}	
 //System.out.println("Available Vegetables Are :" + vegetables[0]+" , " + vegetables[1]+ " , " + vegetables[2] + " , "+ vegetables[3] + " ," + vegetables[4] + " , " +vegetables[5] + " , "+ vegetables[6] + " , " + vegetables[7] + " , " + vegetables[8] + " , " +vegetables[9] + " , " + vegetables[10] + " , " +vegetables[11] + " , " + vegetables[12] + " , " + vegetables[13] + " , " + vegetables[14]);
	for(String vegetable : vegetables){
			System.out.println(vegetable);
	}
 
 //System.out.println("Available Perfurms Are :" + perfurms[0]+" , " + perfurms[1]+ " , " + perfurms[2] + " , "+ perfurms[3] + " ," + perfurms[4] + " , " +perfurms[5] + " , "+ perfurms[6] + " , " + perfurms[7] + " , " + perfurms[8] + " , " + perfurms[9] + " , " + perfurms[10] + " , " + perfurms[11] + " , " + perfurms[12] + " , " +perfurms[13] + " , " + perfurms[14]);
	for(String perfume : perfurms){
			System.out.println(perfume);
	}
 //System.out.println("Available Fruits Are :" + fruits[0]+" , " + fruits[1]+ " , " +fruits[2] + " , "+ fruits[3] + " ," + fruits[4] + " , " +fruits[5] + " , "+ fruits[6] + " , " + fruits[7] + " , " + fruits[8] + " , " + fruits[9] + " , " + fruits[10] + " , " + fruits[11] + " , " + fruits[12] + " , " +fruits[13] + " , " + fruits[14]);
	for(String fruit : fruits){
			System.out.println(fruit);
}
 //System.out.println("Available Snacks Are :" + snacks[0]+" , " + snacks[1]+ " , " + snacks[2] + " , "+ snacks[3] + " ," + snacks[4] + " , " +snacks[5] + " , "+ snacks[6] + " , " + snacks[7] + " , " + snacks[8] + " , " + snacks[9] + " , " +snacks[10] + " , " +snacks[11] + " , " + snacks[12] + " , " + snacks[13] + " , " + snacks[14]);
	for(String snack : snacks){
		System.out.println(snack);
	}
 //System.out.println("Available Chocolates Are :" + chocolates[0]+" , " + chocolates[1]+ " , " + chocolates[2] + " , "+ chocolates[3] + " ," +chocolates[4] + " , " +chocolates[5] + " , "+ chocolates[6] + " , " + chocolates[7] + " , " + chocolates[8] + " , " + chocolates[9] + " , " + chocolates[10] + " , " + chocolates[11] + " , " + chocolates[12] + " , " + chocolates[13] + " , " + chocolates[14]);
	for(String choco : chocolates){
		System.out.println(choco);
	}
 //System.out.println("Available Sweets Are :" + sweets[0]+" , " + sweets[1]+ " , " + sweets[2] + " , "+ sweets[3] + " ," + sweets[4] + " , " +sweets[5] + " , "+ sweets[6] + " , " + sweets[7] + " , " + sweets[8] + " , " + sweets[9] + " , " + sweets[10] + " , " + sweets[11] + " , " + sweets[12] + " , " + sweets[13] + " , " +sweets[14]);
	for(String sweet : sweets){
		System.out.println(sweet);
	}
 //System.out.println("Available Cosmetics Are :" + cosmetics[0]+" , " + cosmetics[1]+ " , " + cosmetics[2] + " , "+ cosmetics[3] + " ," + cosmetics[4] + " , " +cosmetics[5] + " , "+ cosmetics[6] + " , " +cosmetics[7] + " , " + cosmetics[8] + " , " + cosmetics[9] + " , " + cosmetics[10] + " , " + cosmetics[11] + " , " + cosmetics[12] + " , " + cosmetics[13] + " , " + cosmetics[14]);
	for(String cos : cosmetics){
		System.out.println(cos);
	}
 //System.out.println("Available House Hold Products  Are :" + houseHoldProducts[0]+" , " + houseHoldProducts[1]+ " , " + houseHoldProducts[2] + " , "+ houseHoldProducts[3] + " ," + houseHoldProducts[4] + " , " +houseHoldProducts[5] + " , "+houseHoldProducts[6] + " , " + houseHoldProducts[7] + " , " + houseHoldProducts[8] + " , " + houseHoldProducts[9] + " , " + houseHoldProducts[10] + " , " + houseHoldProducts[11] + " , " + houseHoldProducts[12] + " , " +houseHoldProducts[13] + " , " + houseHoldProducts[14]);
	for(String house : houseHoldProducts){
		System.out.println(house);
	}
 //System.out.println("Available Cool Drinks Are :" + coolDrinks[0]+" , " + coolDrinks[1]+ " , " +coolDrinks[2] + " , "+ coolDrinks[3] + " ," + coolDrinks[4] + " , " +coolDrinks[5] + " , "+coolDrinks[6] + " , " +coolDrinks[7] + " , " + coolDrinks[8] + " , " + coolDrinks[9] + " , " + coolDrinks[10] + " , " + coolDrinks[11] + " , " + coolDrinks[12] + " , " +coolDrinks[13] + " , " + coolDrinks[14]);
	for(String cool : coolDrinks){
		System.out.println(cool);
	}
// System.out.println("Available Biscuits  Are :" + biscuits[0]+" , " +biscuits[1]+ " , " +biscuits[2] + " , "+ biscuits[3] + " ," + biscuits[4] + " , " +biscuits[5] + " , "+ biscuits[6] + " , " + biscuits[7] + " , " + biscuits[8] + " , " + biscuits[9] + " , " + biscuits[10] + " , " + biscuits[11] + " , " + biscuits[12] + " , " + biscuits[13] + " , " + biscuits[14]);
	for(String bis : biscuits){
		System.out.println(bis);
	}
 //System.out.println("Available Toys Are :" + toys[0]+" , " + toys[1]+ " , " + toys[2] + " , "+ toys[3] + " ," + toys[4] + " , " +toys[5] + " , "+ toys[6] + " , " + toys[7] + " , " + toys[8] + " , " + toys[9] + " , " + toys[10] + " , " + toys[11] + " , " + toys[12] + " , " + toys[13] + " , " + toys[14]);
	for(String toy : toys){
		System.out.println(toy);
	}
 //System.out.println("Available Fashion Are :" + fashion[0]+" , " + fashion[1]+ " , " + fashion[2] + " , "+ fashion[3] + " ," + fashion[4] + " , " +fashion[5] + " , "+ fashion[6] + " , " + fashion[7] + " , " + fashion[8] + " , " + fashion[9] + " , " + fashion[10] + " , " + fashion[11] + " , " + fashion[12] + " , " + fashion[13] + " , " + fashion[14]);
	for(String fash : fashion){
		System.out.println(fash);
	}
// System.out.println("Available Ice Cream Are :" + icecream[0]+" , " + icecream[1]+ " , " + icecream[2] + " , "+ icecream[3] + " ," + icecream[4] + " , " +icecream[5] + " , "+ icecream[6] + " , " + icecream[7] + " , " + icecream[8] + " , " + icecream[9] + " , " + icecream[10] + " , " + icecream[11] + " , " + icecream[12] + " , " + icecream[13] + " , " + icecream[14]);
	for(String ice : icecream){
		System.out.println(ice);
	}
// System.out.println("Available Alcohol Are :" + alcohol[0]+" , " + alcohol[1]+ " , " + alcohol[2] + " , "+ alcohol[3] + " ," + alcohol[4] + " , " +alcohol[5] + " , "+ alcohol[6] + " , " + alcohol[7] + " , " + alcohol[8] + " , " + alcohol[9] + " , " + alcohol[10] + " , " + alcohol[11] + " , " + alcohol[12] + " , " + alcohol[13] + " , " + alcohol[14]);
	for(String alch : alcohol){
		System.out.println(alch);
	}

 System.out.println("Main ended");
      }



}