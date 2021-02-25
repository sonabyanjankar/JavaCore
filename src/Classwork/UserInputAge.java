package Classwork;

import java.util.Scanner;

public class UserInputAge {

    public static void main(String[] args) {
        System.out.print("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        System.out.println("Welcome "+ name+" !!");

        /* Get user age *
         if age + 5 in five years /

         */

        System.out.print("Enter your age : ");
        byte age= scanner.nextByte();
        System.out.println("You will be "+(age+5)+ " years old after 5 years. ");


    }

}
