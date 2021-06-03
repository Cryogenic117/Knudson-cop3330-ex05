/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Brandon Knudson
 */
package oop.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        String num1, num2;
        Integer num1Int, num2Int;

        System.out.println("What is the first number? ");
        num1 = input.nextLine();
        num1Int = Integer.parseInt(num1);

        System.out.println("What is the second number? ");
        num2 = input.nextLine();
        num2Int = Integer.parseInt(num2);

        System.out.printf("%d + %d = %d \n%d - %d = %d\n%d * %d = %d\n%d / %d = %d", num1Int, num2Int, num1Int+num2Int, num1Int, num2Int, num1Int-num2Int, num1Int, num2Int, num1Int*num2Int, num1Int, num2Int, num1Int/num2Int);





    }
}
