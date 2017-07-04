package com.example.stuartbryce.rockpaperscissors;


import java.util.Random;

import behaviours.Move;

/**
 * Created by stuartbryce on 2017-06-22.
 */

public class Computer {

    public Move getMove(){
        Move[] moves = Move.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }
}
