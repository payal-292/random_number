package com.codesoft.number_game.select;
import java.util.*;

public class GuessTheNumber {
	public static int generatenum(int start, int end) {
		Random random = new Random();
		return random.nextInt(end-start + 1) + start;
	}
	
	public static void main(String[] args) {
		int start = 1;
		int end = 100;
		int maxNum = 3;
		Scanner scanner = new Scanner(System.in);
		int tround = 0;
		int round = 0;
		boolean playagain = true;
		
		while(playagain) {
			int random = generatenum(start, end);
			System.out.println("Guessing Number from " + start + " and " + end);
			int guess;
			int attempt = 0;
			
			while(attempt < maxNum) {
				System.out.print("Guess the Number : ");
				guess = scanner.nextInt();
				attempt ++;
				
				if(guess == random) {
					System.out.println("Congratulations!!!... You Guessed the Correct Number");
					random ++;
					break;
				}
				
				else if(guess > random){
					System.out.println("Too High!!!.. Please Try Again");
				}
				
				else {
					System.out.println("Too Low!!!.. Please Try Again");
				}
			}
			
			if(attempt >= maxNum) {
				System.out.println("Sorry... You've run out of attempts " + random);
			}
			
			tround ++;
			System.out.println("Do you want to Play Again ? (Yes / No)");
			String playAgain2 = scanner.next();
			playagain = playAgain2.equalsIgnoreCase("Yes");
		}
		
		System.out.println("Thank You So Much For Playing");
		System.out.println("You Score " + round + " Out Of " + tround + " Round Won");
		scanner.close();
		
	}
}