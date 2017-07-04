package behaviours;

/**
 * Created by stuartbryce on 2017-06-22.
 */

public enum Move {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors"),
    LIZARD("Lizard"),
    SPOCK("Spock");

    private String type;

    Move(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}

