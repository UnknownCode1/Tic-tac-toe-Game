package org.example;

import java.util.Arrays;
import java.util.Scanner;

class Main{


    public static void main(String[] args){

        //Renders the current state of the game
        GameStatus status = new GameStatus();

        //To check the winner
        WinChecker check = new WinChecker();

        int xValue = (char)'X';
        int oValue = (char)'O';

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome! to tic-tac-toe");
        System.out.println("Player1 selected number will be replaced with X and Player2  selected number will be replaced with O");
        int []trackGame = {1,2,3,4,5,6,7,8,9};
        status.renderGame(trackGame);
        int counter = 0;
        while(true){
            System.out.print("Player1's turn to select a number: ");
            int selectedValue=0;
            while(true){
                selectedValue = sc.nextInt();
                counter = counter + 1;
                if(selectedValue > 9){
                    System.out.println("You have entered a number greater than 9, Invalid! Enter again");
                    continue;
                }
                if(trackGame[selectedValue-1]==xValue || trackGame[selectedValue-1]==oValue){
                    System.out.println("You can't choose a blocked value, Enter available number");
                    continue;
                }
                break;
            }
            trackGame[selectedValue - 1] = (int)'X';
            status.renderGame(trackGame);

            if(counter > 3){
                char winner = check.checkWinner(trackGame);
                if(winner == 'D'){
                    System.out.println("It's a DRAW!");
                    break;
                }else if(winner == 'X'){
                    System.out.println("Player1 Won the Game");
                    break;
                } else if(winner == 'O'){
                    System.out.println("Player2 Won the Game");
                    break;
                }
            }


            System.out.print("Player2 turn to select a number: ");
            while(true){
                selectedValue = sc.nextInt();
                counter = counter + 1;
                if(selectedValue > 9){
                    System.out.println("You have entered a number greater than 9, Invalid! Enter again");
                    continue;
                }
                if(trackGame[selectedValue-1]==xValue || trackGame[selectedValue-1]==oValue){
                    System.out.println("You can't choose a blocked value, Enter available number");
                    continue;
                }
                break;
            }
            trackGame[selectedValue-1] = (int)'O';
            status.renderGame(trackGame);

            char winner = check.checkWinner(trackGame);
             if(winner == 'D'){
                System.out.println("It's a DRAW!");
                break;
            }else if(winner == 'X'){
                System.out.println("Player1 Won the Game");
                break;
            } else if(winner == 'O'){
                System.out.println("Player2 Won the Game");
                break;
            }
        }


    }
}