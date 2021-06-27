package com.Bridgelabz_snake_ladder;

import java.util.Scanner;

public class Snake_ladder_uc3 {

	public static void main(String[] args) {
		int startPosition = 0;
		System.out.print("Enter Your Name: ");
		Scanner scanner = new Scanner(System.in);
		String playerName = scanner.next();

		int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("Dice Roll Number :"+ dieRoll);

		int checkOption = (int) (Math.floor(Math.random() * 10) % 3);
		switch (checkOption) {
			case 0:
				System.out.println("No Play");
				startPosition += 0;
				break;
			case 1:
				System.out.println("Ladder");
				startPosition += dieRoll;
				break;
			default:
				System.out.println("Snake");
				startPosition -= dieRoll;
				if (startPosition < 0)
					startPosition = 0;
		}
		System.out.println("Player "+playerName+ " On Postion :"+startPosition);
	}

	}


