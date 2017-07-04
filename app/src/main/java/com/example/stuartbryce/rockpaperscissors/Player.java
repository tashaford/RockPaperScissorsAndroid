package com.example.stuartbryce.rockpaperscissors;

import java.util.Scanner;

import behaviours.Move;

/**
 * Created by stuartbryce on 2017-06-22.
 */

public class Player {

    private Scanner sc;

    public Player(){

        sc = new Scanner(System.in);
    }

    public Move getMove(){
        System.out.println("Choose Rock, Paper or Scissors");
        String input = sc.nextLine().toUpperCase();
        char choice = input.charAt(0);

        switch(choice){
            case 'R' :
                return Move.ROCK;
            case 'P' :
                return Move.PAPER;
            case 'S' :
                return Move.SCISSORS;
            default:
                System.out.println("Nope");
                return getMove();
        }
    }
}
