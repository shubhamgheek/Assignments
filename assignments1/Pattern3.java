package assignments1;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");     // recommended even number
        int numberOfRows = sc.nextInt();

        pattern3(numberOfRows);
    }

    private static void pattern3(int numberOfRows) {
        for(int row = 1; row <= numberOfRows; row++){
            for(int column = 1; column <= numberOfRows; column++){
                if(row == numberOfRows || column == 1 || column == numberOfRows ||
                        ((row + column <=  (numberOfRows + 2)/2) || (column - row >= numberOfRows /2))){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
