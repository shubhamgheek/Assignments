package assignments1;

import java.util.Scanner;

public class Pattern2 {

    private static void pattern2(int numberOfRows){
        for(int row = 1; row <= numberOfRows; row++){
            for(int column = 1; column <= numberOfRows; column++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numberOfRows = sc.nextInt();

        pattern2(numberOfRows);

    }
}
