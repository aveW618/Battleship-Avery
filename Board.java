//create a class called Board
public class Board {
	//creates two 10 by 10 boards use the char data type
	//from Runestone Academy chapter 4.3
	char[][] player1ShotGrid = new char[10][10];
	char[][] player1ShipGrid = new char [10][10];
	
	//constructor
	public Board() {
		//loops through rows and columns
		//runestone chapter 4.4
		for (int r = 0; r<10; r++) {
			for (int c = 0; c<10; c++) {
				//fills the boards with dashes separated by spaces
				player1Board[r][c]= '-';
				player2Board[r][c] = '- ';
			}
		}
	}
	
	//toString method to print out both boards
	public String toString() {
		
		//print player1' shot grid
		System.out.println("Shot Grid: ");
		//for loop for the rows of the board
		for (int r=0;r<10;r++) {
			//for loop for the columns of the board
			for (int c = 0; c <10; c++) {
				//prints out all the rows and columns
				System.out.print(player1ShotGrid[r][c]);
			}
			//new line for each row
			System.out.println();
		}
		
		//print player's ship grid 
		System.out.println("Ship Grid: ");
		//for loop for the rows of the board
		for (int r=0;r<10;r++) {
			//for loop for the columns of the board
			//runestone chapter 4.4
			for (int c = 0; c <10; c++) {
				//prints out all the rows and columns
				System.out.print(player1ShipGrid[r][c]);
			}
			//new line for each row
			System.out.println();
		}
	}
	System.out.println("Now we are going to place your ships.");
	public String placeShips() {
		System.out.println("First we will place your carrier ship of length 5.");
		System.out.println("For each of the Type two integer numbers with no space between them. A value from 1-10 for the row you are placing the ship. A value from 1-10 for the column you are placing the ship");
			
	/* create a method called placeShips()
	 * write a method of type boolean to take in ints row, column, and len, and a boolean horizontal
	 * use an if statement to check if the ship is horizontal (true) or vertical (horizontal is false)
	 * next create a loop that iterates through each part of the ship on the grid
	 * 		if horizontal is true, the loop should move sideways meaning that the columns are increasing (iterating by 1)
	 * 		if horizontal is false (the ship is vertical), the loop should move downwards meaning that the rows are increasing (iterating by 1)
	 * inside of this loop also check to make sure that the ship doesn't overlap with other ships or go off the grid
	 * 		if the ship goes off the grid meaning that its starting location + its length is > 10, return false
	 * 		if the ship's location already has a "b" that means another ship is already there and so return false
	 * if the above tests return false, don't place the ship and print out an error message telling the user to choose anothe location
	 * if the above tests return true, fill the spaces the user choose with "b" to represent that a boat now exists
	 * print out the new grid and a success message for the user
	 */
	 
}
			
		
		
		
