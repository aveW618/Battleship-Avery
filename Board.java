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
			
	/* create a method called placeShip
	 * write a constructor of type boolead to see the row, column, len, and whether the boolean horizontal is true or false
	 * if horizontal is true, the r
}
			
		
		
		
