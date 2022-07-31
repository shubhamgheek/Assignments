package assignments1;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");     // recommended even number
        int numberOfRows = sc.nextInt();

        pattern4(numberOfRows);
    }

    private static void pattern4(int numberOfRows) {
        for(int row = 1; row <= numberOfRows; row++){
            for(int column = 1; column <= (2 * numberOfRows - 2); column++){
                if(row == numberOfRows || column == 1 || column == (2 * numberOfRows - 2)
                        || row >= column || (column + row >= (2 * numberOfRows - 1))){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
