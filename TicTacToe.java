import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Let's play tic tac toe!\n");
		
		//Creating a 2D array for the gameboard
		String [][] gameboard = {{"   ", "|", "   ", "|", "   "},
				{" 1 ", "|", " 2 ", "|", " 3 "},
				{"___", "|", "___", "|", "___"},
				{"   ", "|", "   ", "|", "   "},
				{" 4 ", "|", " 5 ", "|", " 6 "},
				{"___", "|", "___", "|", "___"},
				{"   ", "|", "   ", "|", "   "},
				{" 7 ", "|", " 8 ", "|", " 9 "},
				{"   ", "|", "   ", "|", "   "}};
		
		//Printing the gameboard
		for (int row = 0; row < gameboard.length; row++) {
			for (int col = 0; col < gameboard[0].length; col++) {
				System.out.print(gameboard[row][col] + " ");
			}
			System.out.println("");
		}
		
		//Using a count variable to count how many turns the players have taken in order to declare a draw
		int count = 0;
		
		//Using a while true loop because I dont know how many turns the players will take
		while (true) {
			
			//Getting the input of the X player
			System.out.println("\nIf you are X, type in the number box you'd like to use:");
			int input = scan.nextInt();
			
			//Placing x on whichever number box they chose
			if (input == 1) {
				gameboard[1][0] = " X ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			else if (input == 2) {
				gameboard[1][2] = " X ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			else if (input == 3) {
				gameboard[1][4] = " X ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			else if (input == 4) {
				gameboard[4][0] = " X ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			else if (input == 5) {
				gameboard[4][2] = " X ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			else if (input == 6) {
				gameboard[4][4] = " X ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			else if (input == 7) {
				gameboard[7][0] = " X ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			else if (input == 8) {
				gameboard[7][2] = " X ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			else if (input == 9) {
				gameboard[7][4] = " X ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			count++;
			
			//Checking if X won
			if (gameboard[1][0].equals(gameboard[1][2]) && gameboard[1][0].equals(gameboard[1][4]) || 
					gameboard[4][0].equals(gameboard[4][2]) && gameboard[4][0].equals(gameboard[4][4]) ||
					gameboard[7][0].equals(gameboard[7][2]) && gameboard[7][0].equals(gameboard[7][4]) ||
					gameboard[1][0].equals(gameboard[4][0]) && gameboard[1][0].equals(gameboard[7][0]) ||
					gameboard[1][2].equals(gameboard[4][2]) && gameboard[1][2].equals(gameboard[7][2]) ||
					gameboard[1][4].equals(gameboard[4][4]) && gameboard[1][4].equals(gameboard[7][4]) ||
					gameboard[1][0].equals(gameboard[4][2]) && gameboard[1][0].equals(gameboard[7][4]) ||
					gameboard[1][4].equals(gameboard[4][2]) && gameboard[1][4].equals(gameboard[7][0])) {
				
				System.out.println("\n\n\nX WON THE GAME!!!!!!");
				break;
			}
			
			//If the playes have taken 9 turns, the game is declared as a draw
			if (count == 9) {
				System.out.println("\n\n\nTIE GAME!");
				System.exit(0);
			}
			
			//Getting the input of the O player
			System.out.println("\nIf you are O, type in the number box you'd like to use:");
			int input2 = scan.nextInt();
			
			//Placing O to whatever number box the player chose
			if (input2 == 1) {
				gameboard[1][0] = " O ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			else if (input2 == 2) {
				gameboard[1][2] = " O ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			else if (input2 == 3) {
				gameboard[1][4] = " O ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			else if (input2 == 4) {
				gameboard[4][0] = " O ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			else if (input2 == 5) {
				gameboard[4][2] = " O ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			else if (input2 == 6) {
				gameboard[4][4] = " O ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			else if (input2 == 7) {
				gameboard[7][0] = " O ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			else if (input2 == 8) {
				gameboard[7][2] = " O ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			else if (input2 == 9) {
				gameboard[7][4] = " O ";
				
				for (int row = 0; row < gameboard.length; row++) {
					for (int col = 0; col < gameboard[0].length; col++) {
						System.out.print(gameboard[row][col] + " ");
					}
					System.out.println("");
				}
			}
			
			count++;
			
			//Checking if player O won the game
			if (gameboard[1][0].equals(gameboard[1][2]) && gameboard[1][0].equals(gameboard[1][4]) || 
					gameboard[4][0].equals(gameboard[4][2]) && gameboard[4][0].equals(gameboard[4][4]) ||
					gameboard[7][0].equals(gameboard[7][2]) && gameboard[7][0].equals(gameboard[7][4]) ||
					gameboard[1][0].equals(gameboard[4][0]) && gameboard[1][0].equals(gameboard[7][0]) ||
					gameboard[1][2].equals(gameboard[4][2]) && gameboard[1][2].equals(gameboard[7][2]) ||
					gameboard[1][4].equals(gameboard[4][4]) && gameboard[1][4].equals(gameboard[7][4]) ||
					gameboard[1][0].equals(gameboard[4][2]) && gameboard[1][0].equals(gameboard[7][4]) ||
					gameboard[1][4].equals(gameboard[4][2]) && gameboard[1][4].equals(gameboard[7][0])) {
				
				System.out.println("\n\n\nO WON THE GAME!!!!!!");
				break;
			}
			
			//Looping back to the beginning of the while true loop to print the updated gameboard.
			
		}
		
	}

}
