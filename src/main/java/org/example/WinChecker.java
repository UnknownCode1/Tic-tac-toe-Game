package org.example;

public class WinChecker {
    int xValue = (char)'X';
    int oValue = (char)'O';
    public char checkWinner(int []n){
        if(n[0]==n[1] && n[1]== n[2]){
            if(n[0]==xValue)
                return 'X';
            else if(n[0]==oValue)
                return 'O';
        }

        if(n[0]==n[3] && n[3]== n[6]){
            if(n[0]==xValue)
                return 'X';
            else if(n[0]==oValue)
                return 'O';
        }

        if(n[6]==n[7] && n[7]== n[8]){
            if(n[6]==xValue)
                return 'X';
            else if(n[6]==oValue)
                return 'O';
        }

        if(n[2]==n[5] && n[5]== n[8]){
            if(n[8]==xValue)
                return 'X';
            else if(n[8]==oValue)
                return 'O';
        }

        if(n[0]==n[4] && n[4]==n[8]){
            if(n[0]==xValue)
                return 'X';
            else if(n[0]==oValue)
                return '0';
        }
        if(n[2]==n[4] && n[4]==n[6]){
            if(n[2]==xValue)
                return 'X';
            else if(n[2]==oValue)
                return 'O';
        }

        for(int i=0; i<n.length; i++){
            if(n[i]<=9){
                return 'C';
            }
            else if(i==8)
                return 'D';
        }
        return 'C';
    }
}
