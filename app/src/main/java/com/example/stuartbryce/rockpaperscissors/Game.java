package com.example.stuartbryce.rockpaperscissors;

import java.util.concurrent.CompletionService;

import behaviours.Move;

import static behaviours.Move.PAPER;
import static behaviours.Move.ROCK;
import static behaviours.Move.SCISSORS;

/**
 * Created by stuartbryce on 2017-06-22.
 */

public class Game {


    private Player player;
    protected Computer computer;

    public Game(){
        player = new Player();
        computer = new Computer();
    }

//    public void playGame(){
//        Move computerMove = computer.getMove();
//        Move playerMove = player.getMove();
//        System.out.println("You played " + playerMove.getType());
//        System.out.println("Computerplayed " + computerMove.getType());
//        int winner = compareMoves(playerMove, computerMove);
//        displayWinner(winner);
//    }

    protected int compareMoves(String playerMove, String computerMove){
        if (playerMove.equals(computerMove)){
            return 0;
        }
        switch(playerMove){
            case "Rock" :
                return (computerMove.equals("Scissors") || computerMove.equals("Lizard") ? 1 : -1);
            case "Paper" :
                return (computerMove.equals("Rock") || computerMove.equals("Spock") ? 1 : -1);
            case "Scissors" :
                return (computerMove.equals("Paper") || computerMove.equals("Lizard") ? 1 : -1);
            case "Lizard":
                return (computerMove.equals("Spock") || computerMove.equals("Paper") ? 1 : -1);
            case "Spock":
                return (computerMove.equals("Scissors") || computerMove.equals("Rock") ? 1 : -1);
            default:
                return 0;
        }
    }


    protected String displayWinner(int result){
        switch(result){
            case 0:
                return "It's a draw";
            case 1:
                return "It's a win for player";
            case -1:
                return "Computer wins!";
            default :
                return "game broken";
        }
    }
}
