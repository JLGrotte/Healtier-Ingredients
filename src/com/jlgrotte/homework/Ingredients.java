package com.jlgrotte.homework;

class Ingredients {

	// Parallel arrays for the table of food substitutions
	private int[] quantity = { 1, 1, 1, 2 };
	private String[] measure = { "cup", "cup", "teaspoon", "cup" };
	private String[] food = { "sour_cream", "milk", "lemon_juice", "sugar" };
	private boolean[] loseWeight = { true, false, false, true };
	private boolean[] sugar = { true, true, false, true };
	private boolean[] heartHealth = { true, false, true, true };

	Ingredients() {
		System.out.println("Ingredients Constructor");
	}

	//TODO describe what the purpose is of this method.
	public String action(String oldRecipe) {
		System.out.println("\nOriginal data (recipe)\n" + oldRecipe
				+ "\n*****");
		String newData;

		String newRecipe = oldRecipe; // Need to load it up with something
										// good
		String aFood = "cider"; // This food would come from oldRecipe
		//TODO these variables need to be set as well  they were missing 
		int aQuantity = 0;
		String aMeasure = null;

		int index = -1; // -1 indicates aFood was NOT found in the food
						// array
		for (int i = 0; i < food.length; i++) {
			//I turned this around cuz it prevents a possible null-pointer exception the array is initialized.
			if (food[i].equals(aFood)) { // This is how you do string 
											// compare
				index = i;
				break;
			}
		}

		//Removed new declaration of index is not allowed to beclared multiple times it can be reused multiple times however.
		for (int i = 0; i < quantity.length; i++) {
			if (quantity[i] == aQuantity) {
				index = i;
				break;
			}
		}
		
		//Removed new declaration of index is not allowed to beclared multiple times it can be reused multiple times however.
		for (int i = 0; i < measure.length; i++) {
			if (measure[i].equals(aMeasure)) {
				index = i;
				break;
			}
		}
		//its not safe to reuse index cuz it get overwritten on each search and then the new recipe may not be correct.
		
		// index >= 0 means that index contins the row of the table that
		// contains the substituion information. I'll not do any actual
		// substitution -- that work is left for you to do
		if (index >= 0) {
			newRecipe = aFood + " should be substituted in: " + oldRecipe;
		}

		// Return newly updated recipe to the caller
		return newRecipe;
	} // end convert()

	//TODO what will this class do?
	class SubString {

	}

	// newData = "Processed:\n" + data + "\n******";
	// return newData;
}