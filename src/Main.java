import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        boxWithMinorDiagonal(userInput);
        rightTriangle(userInput);

    }

    public static void boxWithMinorDiagonal(int input){


        for(int row = 1; row <= input; row++)
        {
            for(int col = 1; col <= input; col++)
            {
                if(col == 1 || col == input || row == 1 || row == input || row == col)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void rightTriangle(int input){

        for(int row = 1; row <= input; row++)
        {
            for(int col = 1; col <= input; col++)
            {
                if(col == 1 || row == 0 || row == input || row == col)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void printNLetter(int input){

        for(int row = 1; row <= input; row++)
        {
            for(int col = 1; col <= input; col++)
            {
                if(col == 1 || row == 0 || row == input || row == col)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}