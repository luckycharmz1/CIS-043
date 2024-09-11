/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapter.exercises;

/**
 *
 * @author cwash
 */
public class Chapter2Exercises {

//Exercise 2.14

public class Chapter2Exercises {

    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        
    }


//Exercise 2.16

import java.util.Scanner;

public class Chapter2Exercises {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1;
        int number2;
        
        
        System.out.print("Enter first integer: "); //prompt
        number1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        
        if (number1 == number2){
            System.out.printf("%d == %d%n", number1, number2);
        }
        if (number1 != number2) {
           System.out.printf("%d != %d%n", number1, number2);
        }
        if (number1 < number2) {
            System.out.printf("%d < %d%n", number1, number2);
        }
        if (number1 > number2) {
            System.out.printf("%d is larger than %d%n", number1, number2);
        }
    }
}


//Exercise 2.26

import java.util.Scanner;

public class Chapter2Exercises {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1;
        int number2;
        
        
        System.out.print("Enter first integer: "); //prompt
        number1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        
        if (number1 % number2 == 0) {
            System.out.println(number1 + " is a multiple of" + number2);
        }
        else {
            System.out.println(number1 + "is not a multiple of" + number2);
        }
        input.close();
    }
}


//Exercise 2.30

System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();

        if (String.valueOf(number).length() != 5) {
            System.out.println("Please enter a five-digit number.");
        } else {
            int digit1 = number / 10000;
            int digit2 = (number % 10000) / 1000;
            int digit3 = (number % 1000) / 100;
            int digit4 = (number % 100) / 10;
            int digit5 = number % 10;

            System.out.printf("%d   %d   %d   %d   %d\n", digit1, digit2, digit3, digit4, digit5);
        }
        input.close();
    }
}

