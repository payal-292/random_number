//package com.codesoft.number_game.select;
//
//import java.util.Scanner;
//
//public class GuessingGame {
//
//    public static void main(String[] args) {
//        // Generate a random number within the specified range.
//        int randomNumber = (int) (Math.random() * 100) + 1;
//
//        // Prompt the user to enter their guess.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Guess a number between 1 and 100:");
//        int guess = scanner.nextInt();
//
//        // Compare the user's guess with the generated number.
//        while (guess != randomNumber) {
//            if (guess < randomNumber) {
//                System.out.println("Your guess is too low.");
//            } else {
//                System.out.println("Your guess is too high.");
//            }
//
//            // Prompt the user to enter their guess again.
//            System.out.println("Guess again:");
//            guess = scanner.nextInt();
//        }
//
//        // The user has guessed the correct number!
//        System.out.println("Congratulations! You guessed the correct number!");
//    }
//}
