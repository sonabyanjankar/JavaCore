package Assignment;

import java.util.Scanner;

public class GameTicTacToe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name, Player 1 : ");
        String p1 = scanner.nextLine();

        System.out.print("Enter your name, Player 2 :  ");
        String p2 = scanner.nextLine();

        //Tic tac toe board

        char[][] board = new char[3][3];
        // Fil the board with empty spaces
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        //boolean to keep track for turn
        boolean isPlayer1 = true;

        //checking if game has ended
        boolean gameEnded =false;

        while(!gameEnded){
            drawBoard(board);


            char symbol = ' ';
            if (isPlayer1) {
                symbol = 'x';
            } else {
                symbol = 'o';
            }

            //Player's turn
            if (isPlayer1) {
                System.out.println(p1 + "'s Turn (x) ");
            } else {
                System.out.println(p2 + "'s Turn (o) ");
            }

            //initializing variable
            byte row = 0;
            byte column = 0;


            while (true) {
                //getting the input from user
                System.out.print("Enter a row (0, 1,or 2) : ");
                row = scanner.nextByte();

                System.out.print("Enter a column (0, 1,or 2) : ");
                column = scanner.nextByte();

                //for valid row and  column input

                if (row < 0 || column < 0 || row > 2 || column > 2) {

                    //out of bound exception
                    System.out.println("Out of Bound Entry");
                    System.out.println("Please enter another selection .");


                } else if (board[row][column] != '-') {
                    //no duplicate moves
                    System.out.println("Another Player has played that move.");

                } else {
                    //until the move is valid
                    break;
                }
            }


            //positioning of the player's move to player's symbol

            board[row][column] = symbol;
            //check if a player has won
            if (hasWon(board) == 'x') {
                System.out.println(p1 + " has won !!");
                gameEnded=true;

            } else if (hasWon(board) == 'o') {
                System.out.println(p2 + " has won !!");
                gameEnded=true;

            } else {
                if (hasTied(board)) {
                    //tied
                    System.out.println("It's a tie !!!");
                    gameEnded=true;

                }
                else {
                    //continue the game and change the turn
                    isPlayer1 = !isPlayer1;

                }
            }
        }

}


    //printing the board
    public static void drawBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static char hasWon(char[][] board){
        //row
        for( int i=0; i<3; i++){
            if(board[i][0] ==board[i][1] && board[i][1]==board[i][2] && board[i][0] != '-'){
                return board[i][0];
            }
        }

        //for column
        for(int j=0; j<3; j++){
            if(board[0][j]==board[1][j] && board[1][j]==board[2][j] && board[0][j]!= '-'){
                return board[0][j];
            }
        }

        //diagonals
        if(board[0][0]==board[1][1] && board[1][1]==board[2][2] && board[0][0]!= '-'){
            return board[0][0];
        }
        if(board[2][0]==board[1][1] && board[1][1]==board[0][2] && board[2][0] != '-'){
            return board[2][0];
        }

        //Nobody wins
        return '-';

    }

    //checking if the board is full
    public static boolean hasTied(char[][] board){
        for(int i= 0; i<3; i++){
            for(int j= 0; j<3 ; j++){
                if ( board[i][j] =='-'){
                    return false;
                }
            }
        }
        return true;
    }
}
