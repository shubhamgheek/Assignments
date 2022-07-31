package assignments1;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");     // recommended odd number
        int numberOfRows = sc.nextInt();

        pattern1(numberOfRows);
    }

    private static void pattern1(int numberOfRows) {
        for(int row = 1; row <= numberOfRows; row++){
            for(int column = 1; column <= numberOfRows; column++){
                if(row == 1 || row == numberOfRows || column == (numberOfRows + 1) / 2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            for(int column = 1; column <= numberOfRows; column++){
                if(column == 1 || column == numberOfRows || row == column){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            for(int column = 1; column <= numberOfRows; column++){
                if(column == 1 || row == 1 || row == numberOfRows || row == (numberOfRows + 1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            for(int column = 1; column <= numberOfRows; column++){
                if(!(row == numberOfRows && (column == 1 || column == numberOfRows)) &&
                        (column == 1 || column == numberOfRows || row == numberOfRows)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            for(int column = 1; column <= numberOfRows; column++){
                if(column == 1 || (!(column == numberOfRows && (row == 1 || row == (numberOfRows + 1)/2))
                        && (row == 1 || row == (numberOfRows + 1)/2 || (row <= (numberOfRows + 1)/2 &&
                        column == numberOfRows))) ||(row - column == (numberOfRows - 2)/2)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            for(int column = 1; column <= numberOfRows; column++){
                if(!((row == 1 || row == numberOfRows) && (column == 1 || column == numberOfRows)) &&
                        (row == 1 || row == numberOfRows || column == 1 || column == numberOfRows)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print("  ");

            for(int column = 1; column <= numberOfRows; column++){
                if(column == 1 || column == numberOfRows || row == column){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
