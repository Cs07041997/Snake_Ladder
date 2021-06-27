package com.Bridgelabz_snake_ladder;

import java.util.Scanner;

public class Snake_ladder_uc5 {

	public static final int WINNING_POSITION = 100;
	public static void main(String [] args){
		int startPosition = 0;
		System.out.print("Enter Your Name: ");
		Scanner scanner = new Scanner(System.in);
		String playerName = scanner.next();

        while (WINNING_POSITION > startPosition){
			int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
            int needToWin = WINNING_POSITION - startPosition;
			int checkOption = (int) (Math.floor(Math.random() * 10) % 3);
			if (needToWin >= dieRoll){
				switch (checkOption) {
					case 0:
						System.out.println("No Play");
						startPosition += 0;
						break;
					case 1:
						System.out.println("Ladder :"+ " + " +dieRoll);
						startPosition += dieRoll;
						break;
					default:
						System.out.println("Snake :"+ " - " +dieRoll);
						startPosition -= dieRoll;
						if (startPosition < 0){
							System.out.println("Start Again");
							startPosition = 0;
						}
				}
			}
		}
		System.out.println("Player "+playerName+ " Reached The Winning Position :"+startPosition);

	}

}
