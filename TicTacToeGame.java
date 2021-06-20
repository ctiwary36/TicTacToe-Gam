package tictactoegame;
import java.util.Scanner;

public class TicTacToeGame {
    private static char[] element;

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        board();
        userinput();
    }

   	/*Create a board of char[] of size 10
	and assign empty space to each
	element*/

    private static void board() {
        element = new char[10];
        for(int i=1; i<10; i++) {
            element[i]='.';
        }
    }
    private static void userinput() {
        Scanner in=new Scanner(System.in);

        //Mark Selection
        System.out.println(" Select Your Marker (O or X): ");

        char usermark=in.next().charAt(0);
        char computermark;
        if (usermark=='X') {
            computermark='O';
            System.out.println("User mark is :" +usermark);}

        else
            computermark='X';
        System.out.println("User mark is :" +usermark);
    }
}
