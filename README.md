# TicTacToe
Tek sayfadan oluşan iki kişi ile oynanan Basit xox oyunu.

TicTacToe Game ![VIDEO](https://user-images.githubusercontent.com/98012557/229418704-53abad12-4ba4-41c9-b62b-d8edc69d12b6.mp4)

![xox](https://github.com/enesaks/TicTacToe/assets/98012557/fd1fbb9c-f245-4e44-b0f9-5c8daf87d001)



# TicTacToe Kodları 

Sıranın Hangi Kişide Olduğunu Anlayan Kod Satırı

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
Oyun Bittiğinde XOX Buttonlarının Devredışı Kalmasını Sağlayan Kod

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

Oyun sırasınca her butona basıldığında her sıra,dizi ve çapraz kombinasyonları if else yardımıyla kazananı anlayan Kod 

        private int winChek(){//Return 1 X win , Return 2 O win.
        if (b11.getText().toString() !=" " && b12.getText().toString() !=" " && b13.getText().toString() !=" " && b11.getText().toString() == b12.getText().toString() && b11.getText().toString() ==                       b13.getText().toString() && b12.getText().toString() == b13.getText().toString()){
            if (b11.getText().toString().equals("X"))
                return 1;
            else if (b11.getText().toString().equals("O"))
                return 2;
        }
        else if (b21.getText().toString() !=" " && b22.getText().toString() !=" " &&b21.getText().toString() !=" " &&b23.getText().toString() == b22.getText().toString() && b21.getText().toString() ==    b23.getText().toString() && b22.getText().toString() == b23.getText().toString()){
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

Her butona basıldığında o butonun değerini alıp fonksiyona verip o fonksiyonda switch case yapısı kulanarak oyunun ana kodu 

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
