package Classwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        int num = 0;
        boolean flag= true;
        while (true ) {
            System.out.print("Enter any number (1-100): ");
            try {
                Scanner scanner = new Scanner(System.in);

                num = scanner.nextInt();
                if (num != 7) {
                    System.out.println("You are not lucky. ");

                }

            }
            catch (InputMismatchException e) {
                System.out.println("Invalid !! Only Numbers entry .");
                continue;

            }
            finally {
                if(num == 7){
                    System.out.println("You are lucky!!!");
                    break;
                }
            }


        }
    }
}
