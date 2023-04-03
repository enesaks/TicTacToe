package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b11,b12,b13,b21,b22,b23,b31,b32,b33;
    Toolbar refresh;
    TextView textX,textO,textXskor,textOskor,winner;
    int x_skor = 0,o_skor = 0;
    boolean turnXO = true;
    int chek= 0;
    private int winChek(){//Return 1 X win , Return 2 O win.
        if (b11.getText().toString() !=" " && b12.getText().toString() !=" " && b13.getText().toString() !=" " && b11.getText().toString() == b12.getText().toString() && b11.getText().toString() == b13.getText().toString() && b12.getText().toString() == b13.getText().toString()){
            if (b11.getText().toString().equals("X"))
                return 1;
            else if (b11.getText().toString().equals("O"))
                return 2;
        }
        else if (b21.getText().toString() !=" " && b22.getText().toString() !=" " &&b21.getText().toString() !=" " &&b23.getText().toString() == b22.getText().toString() && b21.getText().toString() == b23.getText().toString() && b22.getText().toString() == b23.getText().toString()){
            if (b21.getText().toString().equals("X"))
                return 1;
            else if (b21.getText().toString().equals("O"))
                return 2;
        }
        else if (b31.getText().toString() !=" " && b32.getText().toString() !=" " && b33.getText().toString() !=" " && b31.getText().toString() == b32.getText().toString() && b31.getText().toString() == b33.getText().toString() && b32.getText().toString() == b33.getText().toString()){
            if (b31.getText().toString().equals("X"))
                return 1;
            else if (b31.getText().toString().equals("O"))
                return 2;
        }
        else if (b11.getText().toString() !=" " && b22.getText().toString() !=" " && b33.getText().toString() !=" " && b11.getText().toString() == b22.getText().toString() && b11.getText().toString() == b33.getText().toString() && b22.getText().toString() == b33.getText().toString()){
            if (b11.getText().toString().equals("X"))
                return 1;
            else if (b11.getText().toString().equals("O"))
                return 2;
        }
        else if (b13.getText().toString() !=" " && b22.getText().toString() !=" " && b31.getText().toString() !=" " && b13.getText().toString() == b22.getText().toString() && b13.getText().toString() == b31.getText().toString() && b22.getText().toString() == b31.getText().toString()){
            if (b13.getText().toString().equals("X"))
                return 1;
            else if (b13.getText().toString().equals("O"))
                return 2;
        }
        else if (b11.getText().toString() !=" " && b21.getText().toString() !=" " && b31.getText().toString() !=" " && b11.getText().toString() == b21.getText().toString() && b11.getText().toString() == b31.getText().toString() && b21.getText().toString() == b31.getText().toString()){
            if (b11.getText().toString().equals("X"))
                return 1;
            else if (b11.getText().toString().equals("O"))
                return 2;
        }
        else if (b12.getText().toString() !=" " && b22.getText().toString() !=" " && b32.getText().toString() !=" " && b12.getText().toString() == b22.getText().toString() && b12.getText().toString() == b32.getText().toString() && b22.getText().toString() == b32.getText().toString()){
            if (b12.getText().toString().equals("X"))
                return 1;
            else if (b12.getText().toString().equals("O"))
                return 2;
        }
        else if (b13.getText().toString() !=" " && b23.getText().toString() !=" " && b33.getText().toString() !=" " && b13.getText().toString() == b23.getText().toString() && b13.getText().toString() == b33.getText().toString() && b23.getText().toString() == b33.getText().toString()){
            if (b13.getText().toString().equals("X"))
                return 1;
            else if (b13.getText().toString().equals("O"))
                return 2;
        }
        else if(b11.getText().toString() != " " && b12.getText().toString() != " " && b13.getText().toString() != " " && b21.getText().toString() != " " && b22.getText().toString() != " " && b23.getText().toString() != " " && b31.getText().toString() != " " && b32.getText().toString() != " " && b33.getText().toString() != " " ){
            winSkor(3);
        }
        return 0;
    }

    private void winSkor(int a){//winer side plus the scor
        if (a == 1){
            x_skor++;
            textXskor.setText("skor : "+x_skor);
            winner.setText("X Wins!");
            stopStart(1);
        } else if (a == 2) {
            o_skor++;
            textOskor.setText("skor : "+o_skor);
            winner.setText("O Wins!");
            stopStart(1);
        } else if (a == 3 ) {
            stopStart(1);
            winner.setText("It's a draw!");
        }
    }
    private  void stopStart(int a){//If the game is over, the buttons will be stopped.
        if(a == 1){
        b11.setEnabled(false);
        b12.setEnabled(false);
        b13.setEnabled(false);
        b21.setEnabled(false);
        b22.setEnabled(false);
        b23.setEnabled(false);
        b31.setEnabled(false);
        b32.setEnabled(false);
        b33.setEnabled(false);}
        else if (a == 2){
            b11.setEnabled(true);
            b12.setEnabled(true);
            b13.setEnabled(true);
            b21.setEnabled(true);
            b22.setEnabled(true);
            b23.setEnabled(true);
            b31.setEnabled(true);
            b32.setEnabled(true);
            b33.setEnabled(true);
        }
    }

    private void clear (){//clear all buttons
        b11.setText(" ");
        b12.setText(" ");
        b13.setText(" ");
        b21.setText(" ");
        b22.setText(" ");
        b23.setText(" ");
        b31.setText(" ");
        b32.setText(" ");
        b33.setText(" ");
        winner.setText(" ");
        stopStart(2);
    }

    private void turnXO(char a){ //determines the order
        if(a == 'X'){
            turnXO = false;
            textO.setBackgroundColor(Color.rgb(223,62,42));
            textX.setBackgroundColor(Color.rgb(0,0,0));
        } else if (a == 'O') {
            turnXO = true;
            textX.setBackgroundColor(Color.rgb(223,62,42));
            textO.setBackgroundColor(Color.rgb(0,0,0));
        }
    }
    private void gameButon(String button){//All button actions.

        switch (button){
            case "b11":
                if(b11.getText().toString().equals(" ")){
                if(turnXO){
                    b11.setText("X");
                    turnXO('X');
                }
                else {
                    b11.setText("O");
                    turnXO('O');
                }
                b11.setEnabled(false);
                }
                chek = winChek();
                winSkor(chek);
                break;
            case "b12":
                if(b12.getText().toString().equals(" ")){
                    if(turnXO){
                        b12.setText("X");
                        turnXO('X');
                    }
                    else {
                        b12.setText("O");
                        turnXO('O');
                    }b12.setEnabled(false);
                }
                chek = winChek();
                winSkor(chek);
                break;
            case "b13":
                if(b13.getText().toString().equals(" ")){
                    if(turnXO){
                        b13.setText("X");
                        turnXO('X');
                    }
                    else {
                        b13.setText("O");
                        turnXO('O');
                    }b13.setEnabled(false);}
                chek = winChek();
                winSkor(chek);
                break;
            case "b21":
                if(b21.getText().toString().equals(" ")){
                    if(turnXO){
                        b21.setText("X");
                        turnXO('X');
                    }
                    else {
                        b21.setText("O");
                        turnXO('O');
                    }
                    b21.setEnabled(false);}
                chek = winChek();
                winSkor(chek);
                break;
            case "b22":
                if(b22.getText().toString().equals(" ")){
                    if(turnXO){
                        b22.setText("X");
                        turnXO('X');
                    }
                    else {
                        b22.setText("O");
                        turnXO('O');
                    }b22.setEnabled(false);}
                chek = winChek();
                winSkor(chek);
                break;
            case "b23":
                if(b23.getText().toString().equals(" ")){
                    if(turnXO){
                        b23.setText("X");
                        turnXO('X');
                    }
                    else {
                        b23.setText("O");
                        turnXO('O');
                    }b23.setEnabled(false);}
                chek = winChek();
                winSkor(chek);
                break;
            case "b31":
                if(b31.getText().toString().equals(" ")){
                    if(turnXO){
                        b31.setText("X");
                        turnXO('X');
                    }
                    else {
                        b31.setText("O");
                        turnXO('O');
                    }b31.setEnabled(false);}
                chek = winChek();
                winSkor(chek);
                break;
            case "b32":
                if(b32.getText().toString().equals(" ")){
                    if(turnXO){
                        b32.setText("X");
                        turnXO('X');
                    }
                    else {
                        b32.setText("O");
                        turnXO('O');
                    }b32.setEnabled(false);}
                chek = winChek();
                winSkor(chek);
                break;
            case "b33":
                if(b33.getText().toString().equals(" ")){
                    if(turnXO){
                        b33.setText("X");
                        turnXO('X');
                    }
                    else {
                        b33.setText("O");
                        turnXO('O');
                    }b33.setEnabled(false);}
                chek = winChek();
                winSkor(chek);
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
        textXskor = findViewById(R.id.textXskor);
        textOskor = findViewById(R.id.textOskor);
        refresh = findViewById(R.id.refresh);
        winner = findViewById(R.id.winner);
    }

    public void b11(View view){
        gameButon("b11");
    }
    public void b12(View view){
        gameButon("b12");
    }
    public void b13(View view){
        gameButon("b13");
    }
    public void b21(View view){
        gameButon("b21");
    }
    public void b22(View view){
        gameButon("b22");
    }
    public void b23(View view){
        gameButon("b23");
    }
    public void b31(View view){
        gameButon("b31");
    }
    public void b32(View view){
        gameButon("b32");
    }
    public void b33(View view){
        gameButon("b33");
    }
    public void refresh(View view){
        clear();
    }

}