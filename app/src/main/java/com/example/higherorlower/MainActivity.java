package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void guessRandomNumber() {
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }

    public void guessButtonClick(View view){

        String message;

        Log.i("Info", Integer.toString(randomNumber));

        EditText editNumberGuess = findViewById(R.id.editNumberGuess);
        String guessNumber = editNumberGuess.getText().toString();
        int guessNumberConvert = Integer.parseInt(guessNumber);

        if (guessNumberConvert > randomNumber){
            message = "Lower";
        } else if (guessNumberConvert < randomNumber){
            message = "Higher";
        } else {
            message = "Congratulations";
            guessRandomNumber();
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}