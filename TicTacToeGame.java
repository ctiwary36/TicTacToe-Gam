package tictactoegame;

public class TicTacToeGame {
    private static char[] element;

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        board();
    }

   	/*Create a board of char[] of size 10
	and assign empty space to each
	element*/

    private static void board() {
        element = new char[10];
        for (int i = 1; i < 10; i++) {
            element[i] = '.';
        }
    }
}
