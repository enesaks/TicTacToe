package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b11,b12,b13,b21,b22,b23,b31,b32,b33;
    TextView textX,textO,textXskor,textOskor;
    boolean turnXO = true;



    private void game(String button){

        switch (button){
            case "b11":
                System.out.println("blabla  :"+b11.getText().toString()+"heyy");
                if(b11.getText().toString().equals(" ")){
                if(turnXO){
                    b11.setText("X");
                    turnXO = false;
                    textO.setBackgroundColor(Color.GRAY);
                    textX.setBackgroundColor(Color.rgb(0,0,0));
                }
                else {
                    b11.setText("O");
                    turnXO = true;
                    textX.setBackgroundColor(Color.GRAY);
                    textO.setBackgroundColor(Color.rgb(0,0,0));
                }}
                break;
            case "b12":
                System.out.println("blabla  :"+b12.getText().toString()+"heyy");
                if(b12.getText().toString().equals(" ")){
                    if(turnXO){
                        b12.setText("X");
                        turnXO = false;
                        textO.setBackgroundColor(Color.GRAY);
                        textX.setBackgroundColor(Color.rgb(0,0,0));
                    }
                    else {
                        b12.setText("O");
                        turnXO = true;
                        textX.setBackgroundColor(Color.GRAY);
                        textO.setBackgroundColor(Color.rgb(0,0,0));
                    }}
                break;
            case "b13":
                if(b13.getText().toString().equals(" ")){
                    if(turnXO){
                        b13.setText("X");
                        turnXO = false;
                        textO.setBackgroundColor(Color.GRAY);
                        textX.setBackgroundColor(Color.rgb(0,0,0));
                    }
                    else {
                        b13.setText("O");
                        turnXO = true;
                        textX.setBackgroundColor(Color.GRAY);
                        textO.setBackgroundColor(Color.rgb(0,0,0));
                    }}
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);
        b23 = findViewById(R.id.b23);
        b31 = findViewById(R.id.b31);
        b32 = findViewById(R.id.b32);
        b33 = findViewById(R.id.b33);
        textX = findViewById(R.id.textX);
        textO = findViewById(R.id.textO);




    }

    public void b11(View view){
        game("b11");
    }
    public void b12(View view){
        game("b12");
    }
    public void b13(View view){
        game("b13");
    }
    public void b21(View view){
        game("b21");
    }
    public void b22(View view){
        game("b22");
    }
    public void b23(View view){
        game("23");
    }
    public void b31(View view){
        game("31");
    }
    public void b32(View view){
        game("32");
    }
    public void b33(View view){
        game("33");
    }

}