package Project;

import java.util.Scanner;

public class ReadingTheNumbers {

    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner scanner= new Scanner(System.in);
        String name= scanner.nextLine();

        System.out.println("Enter the amount of gas to be filled");
        int gas= scanner.nextInt();
        System.out.println("Pump Started...");

        for (int i= 0; i<=gas; i++){

            System.out.println("Gas ....  "+ i );
            ;
        }

        System.out.println("Fueling Completed.....");
    }

}
