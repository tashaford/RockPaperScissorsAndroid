package com.example.stuartbryce.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import behaviours.Move;

import static android.R.transition.move;

public class MainActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    Button lizardButton;
    Button spockButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rockButton = (Button)findViewById(R.id.rock_button);
        paperButton = (Button)findViewById(R.id.paper_button);
        scissorsButton = (Button)findViewById(R.id.scissors_button);
        lizardButton = (Button)findViewById(R.id.lizard_button);
        spockButton = (Button)findViewById(R.id.spock_button);

    }

    public void buttonClicked(View button){
        String playerMove = "";
        if (button.getId() == R.id.rock_button){
            playerMove = "Rock";
        }else if(button.getId() == R.id.paper_button){
            playerMove = "Paper";
        } else if(button.getId() == R.id.scissors_button){
            playerMove = "Scissors";
        } else if(button.getId() == R.id.lizard_button){
            playerMove = "Lizard";
        } else if(button.getId() == R.id.spock_button){
            playerMove = "Spock";
        }


        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("playerMove", playerMove);
        this.startActivity(intent);

    }


}
