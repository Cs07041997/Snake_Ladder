package com.Bridgelabz_snake_ladder;

import java.util.Scanner;

public class Snake_ladder_uc7 {
	 public static final int WINNING_POSITION = 100;
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter The Name of First player : ");
	        String firstPlayerName = scanner.next();
	        System.out.print("Enter The Name of Second player : ");
	        String secondPlayerName = scanner.next();
	        int player1position = 0;
	        int player2Position = 0;

	        while (player1position <= WINNING_POSITION && player2Position <= WINNING_POSITION) {
	            if (player1position == WINNING_POSITION) {
	                System.out.println(firstPlayerName + " Won The Game");
	                break;
	            } else if (player2Position == WINNING_POSITION) {
	                System.out.println(secondPlayerName + " Won The Game");
	                break;
	            } else {
	                player1position = getFirstPlayer(player1position, firstPlayerName);
	                player2Position = getSecondPlayer(player2Position, secondPlayerName);
	            }
	        }
	    }

	    private static int getFirstPlayer(int firstPlayerPosition, String firstPlayerName) {
	        int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
	        int needToWin = WINNING_POSITION - firstPlayerPosition;
	        int checkOption  = (int) (Math.floor(Math.random() * 10) % 3);
	        if (needToWin >= dieRoll) {
	            switch (checkOption ) {
	                case 0:
	                    break;
	                case 1:
	                    firstPlayerPosition += dieRoll;
	                    if (firstPlayerPosition == WINNING_POSITION)
	                        break;
	                    else
	                        getFirstPlayer(firstPlayerPosition, firstPlayerName);
	                    break;
	                default:
	                    firstPlayerPosition -= dieRoll;
	                    if (firstPlayerPosition < 0)
	                        firstPlayerPosition = 0;
	            }
	            System.out.println(firstPlayerName + "'s Position is: " + firstPlayerPosition);
	        }
	        return firstPlayerPosition;
	    }

	    private static int getSecondPlayer(int secondPlayerPosition, String secondPlayerName) {
	        int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
	        int needToWin = WINNING_POSITION - secondPlayerPosition;
	        int checkOption  = (int) (Math.floor(Math.random() * 10) % 3);
	        if (needToWin >= dieRoll) {
	            switch (checkOption ) {
	                case 0:
	                    break;
	                case 1:
	                    secondPlayerPosition += dieRoll;
	                    if (secondPlayerPosition == WINNING_POSITION)
	                        break;
	                    else
	                        getSecondPlayer(secondPlayerPosition, secondPlayerName);
	                    break;
	                default:
	                    secondPlayerPosition -= dieRoll;
	                    if (secondPlayerPosition < 0)
	                        secondPlayerPosition = 0;
	            }
	        }
	        System.out.println(secondPlayerName + "'s Position is: " + secondPlayerPosition);
	        return secondPlayerPosition;

	}

}
