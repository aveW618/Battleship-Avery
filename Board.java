//create a class called Board
public class Board {
	//creates two 10 by 10 boards use the char data type
	//from Runestone Academy chapter 4.3
	char[][] player1Board = new char[10][10];
	char[][] player2Board = new char [10][10];
	
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
		
		//print player1's board
		System.out.println("Player 1 Board: ");
		//for loop for the rows of the board
		for (int r=0;r<10;r++) {
			//for loop for the columns of the board
			for (int c = 0; c <10; c++) {
				//prints out all the rows and columns
				System.out.print(player1Board[r][c]);
			}
			//new line for each row
			System.out.println();
		}
		
		//print player2's board
		System.out.println("Player 2 Board: ");
		//for loop for the rows of the board
		for (int r=0;r<10;r++) {
			//for loop for the columns of the board
			//runestone chapter 4.4
			for (int c = 0; c <10; c++) {
				//prints out all the rows and columns
				System.out.print(player2Board[r][c]);
			}
			//new line for each row
			System.out.println();
		}
	}
}
			
		
		
		
