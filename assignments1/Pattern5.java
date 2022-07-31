package assignments1;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");     // recommended even number
        int numberOfRows = sc.nextInt();

        pattern5(numberOfRows);
    }

    private static void pattern5(int numberOfRows) {
        for(int row = 1; row <= numberOfRows; row++){
            for(int column = 1; column <= numberOfRows; column++){
                if(row == 1 || row == numberOfRows || column == 1 || (row + column <= (numberOfRows + 3)/2) ||
                        ((row >= (numberOfRows - 1)/2) && row - column >= (numberOfRows - 1)/2)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
