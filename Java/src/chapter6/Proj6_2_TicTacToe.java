package chapter6;

import java.util.Scanner;

public class Proj6_2_TicTacToe {
    public static void main(String[] args) {
        runGame();
    }
    public static void runGame(){
        String winner = "";
        boolean xTurn = true;
        int theRow = 0;
        int theCol = 0;
        String[][] gameBoard = new String[3][3];
        intializeGameBoard(gameBoard);
        printGameBoard(gameBoard);

        while (winner.equals("")){
            if(xTurn==true){
                System.out.println("X's turn");
            }else{
                System.out.println("O's turn");
            }

            getUserInput(xTurn,gameBoard);
            printGameBoard(gameBoard);
            winner=getWinner(gameBoard);
            xTurn=!xTurn;

            if(winner.equals("") && isBoardFull(gameBoard))
                winner="C";
        }
        System.out.println();

        if(winner.equals("C")){
            System.out.println("It is a Draw");
        }else {
            System.out.println("The winner is: "+winner);
        }
    }
    public static void intializeGameBoard(String[][] gameBoard){
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                gameBoard[row][col]=" ";
            }
        }
    }
    public static void printGameBoard(String[][] gameBoard){
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                System.out.print(gameBoard[row][col]);
                if(col<2){
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(row<2){
                System.out.println("- - - - -");
            }
        }
    }

    public static void getUserInput(boolean xTurn, String[][] gameBoard){
        Scanner scanner = new Scanner(System.in);
        boolean keepAsking = true;
        int row=-1;
        int col=-1;

        while (keepAsking){
            System.out.println("Please enter row then column, each from 0, 1 & 2 separated by space");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if(row>=0 && row <=2 && col >= 0 && col <=2){
                if(!cellAlreadyOccupied(row,col,gameBoard)){
                    keepAsking = false;
                }else {
                    System.out.println("The cell is already Occupied");
                }
            }
        }

        if(xTurn){
            gameBoard[row][col]="X";
        }else{
            gameBoard[row][col]="O";
        }
    }

    public static boolean cellAlreadyOccupied(int row, int col, String[][] gameBoard){
        return !gameBoard[row][col].equals(" ");
    }

    public static String getWinner(String[][] gameBoard){
        for(int i=0;i<3;i++){
            if(gameBoard[i][0]!=" " && gameBoard[i][0].equals(gameBoard[i][1]) && gameBoard[i][1].equals(gameBoard[i][2]))
                return gameBoard[i][0];
            if(gameBoard[0][i]!=" " && gameBoard[0][i].equals(gameBoard[1][i]) && gameBoard[1][i].equals(gameBoard[2][i]))
                return gameBoard[0][i];
        }
        if(gameBoard[0][0]!=" " && gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][2]))
            return gameBoard[0][0];
        if(gameBoard[0][2]!=" " && gameBoard[1][1].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][0]))
            return gameBoard[0][2];
        return "";
    }

    public static boolean isBoardFull(String[][] gameBoard){
        int count=0;
        for (int i=0 ;i<3;i++){
            for (int j=0;j<3;j++){
                if(gameBoard[i][j]==" ")
                    count++;
            }
        }
        return count==9;
    }
}
