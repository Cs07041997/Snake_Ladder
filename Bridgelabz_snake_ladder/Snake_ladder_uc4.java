package com.Bridgelabz_snake_ladder;

import java.util.Scanner;

public class Snake_ladder_uc4 {

	public static final int WINNING_POSITION = 100;
	public static void main(String [] args){
		int StartPosition = 0;
		System.out.print("Enter Your Name: ");
		Scanner scanner = new Scanner(System.in);
		String playerName = scanner.next();

        while (WINNING_POSITION > StartPosition){
			int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			System.out.println("Dice Roll Number :"+ dieRoll);

			int checkOption = (int) (Math.floor(Math.random() * 10) % 3);
			switch (checkOption) {
				case 0:
					System.out.println("No Play");
					StartPosition += 0;
					break;
				case 1:
					System.out.println("Ladder :"+ " + " +dieRoll);
					StartPosition += dieRoll;
					break;
				default:
					System.out.println("Snake :"+ " - " +dieRoll);
					StartPosition -= dieRoll;
					if (StartPosition < 0){
						System.out.println("Start Again");
						StartPosition = 0;
					}
			}
		}
		System.out.println("Player "+playerName+ " On Postion :"+StartPosition);

	}

}
