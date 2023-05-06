package com.example.demo;

import java.util.Scanner;

public class Me {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter your move,in Type Rock,Paper or Scissors if you want to exit the game type in quit.");
            String myMove = sc.nextLine();
            if (myMove.equals("quit")) {
                break;
            }

            if (myMove.equals("Rock") && !myMove.equals("Papers") && !myMove.equals("Scissors")) {
                System.out.println("Your move is not valid!");
            } else {
                int rand = (int) (Math.random() * 3);
                String opponentMove = "";
                if (rand == 0) {
                    opponentMove = "Rock";

                } else if (rand == 1) {
                    opponentMove = "Pepars";
                } else {
                    opponentMove = "Scissors";
                }
                System.out.println("opponentMove:" + opponentMove);

                if (myMove.equals(opponentMove)) {
                    System.out.println("you have tied!");
                } else if (myMove.equals("Rocks") && opponentMove.equals("Scissors") ||
                        myMove.equals("scissors") && opponentMove.equals("Papers") ||
                        myMove.equals("papers") && opponentMove.equals("Rocks")) {
                    System.out.println("you won!!");
                } else {
                    System.out.println("you loss!");
                }
            }


        }
        System.out.println("thanks for playing!!");

    }
}
