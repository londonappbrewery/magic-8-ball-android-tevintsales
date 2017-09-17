package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView eightBallImage;

    Random randomGenerator;

    final int[] eightBallArray = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eightBallImage = (ImageView)findViewById(R.id.image_balls);

        randomGenerator = new Random();
    }



    public void askMagicEightBall(View view){
        int randomNum = randomGenerator.nextInt(5);
        eightBallImage.setImageResource(eightBallArray[randomNum]);
    }


}
