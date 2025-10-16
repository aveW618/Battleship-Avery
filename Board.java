//create a class called Board
public class Board {
	//creates two 10 by 10 boards use the char data type
	char [][] player1Board = new char[10][10];
	char[][] player2Board = new char [10][10];
	
	//toString method to print out both boards
	public String toString() {
		//initialize variable result
		String result = "My Board: \n";
		
		//print player1's board
		//for loop for the rows of the board
		for (int r=0;r<10;r++) {
			//for loop for the columns of the board
			for (int c = 0; c <10; c++) {
				//prints out all the rows and columns separated by a space
				result += player1Board[r][c] + " ";
			}
			//new line for each row
			result += "\n";
		}
		
		//print player2's board
		//for loop for the rows of the board
		for (int r=0;r<10;r++) {
			//for loop for the columns of the board
			for (int c = 0; c <10; c++) {
				//prints out all the rows and columns separated by a space
				result += player2Board[r][c] + " ";
			}
			//new line for each row
			result += "\n";
		}
		
		return result;
	}
}
			
		
		
		
