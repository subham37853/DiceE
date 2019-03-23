package com.kachori.dice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton= (Button) findViewById(R.id.rollbutton);
        final ImageView leftdice = (ImageView) findViewById(R.id.image_leftdice);
        final ImageView rightdice = (ImageView) findViewById(R.id.image_rightdice);
        final int[] dicearray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("dice", "The button has been pressed");

                Random randomNumberGenerator= new Random();
                int number = randomNumberGenerator.nextInt(6);
                Log.d("dice", "the random nummber is " +number);
                leftdice.setImageResource(dicearray[number]);
                number = randomNumberGenerator.nextInt(6);
                rightdice.setImageResource(dicearray[number]);
            }
        });


    }
}
