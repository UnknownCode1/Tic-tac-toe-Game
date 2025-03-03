package org.example;

public class GameStatus {
    public boolean isNumeric(String s){
        try{
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    };

    public void renderGame(int [] numbers){
        String []borderLines = {"|---|---|---|"};
//        int []numbers = {1,2,3,4,5,6,7,8,9};
        String []lineOne = {"|",String.valueOf(numbers[0]),"|",String.valueOf(numbers[1]),"|",String.valueOf(numbers[2]),"|"};
        System.out.println(borderLines[0]);

        for(String s : lineOne){
            if(isNumeric(s) && Integer.parseInt(s) > 9){
                s = Character.toString(((char) Integer.parseInt(s)));
            }
            System.out.print(s+" ");
        }
        System.out.println();
        String []lineTwo = {"|",String.valueOf(numbers[3]),"|",String.valueOf(numbers[4]),"|",String.valueOf(numbers[5]),"|"};
        System.out.println(borderLines[0]);
        for(String s : lineTwo){
            if(isNumeric(s) && Integer.parseInt(s) > 9){
                s = Character.toString(((char) Integer.parseInt(s)));
            }
            System.out.print(s+" ");
        }
        System.out.println();
        String []lineThree = {"|",String.valueOf(numbers[6]),"|",String.valueOf(numbers[7]),"|",String.valueOf(numbers[8]),"|"};
        System.out.println(borderLines[0]);
        for(String s : lineThree){
            if(isNumeric(s) && Integer.parseInt(s) > 9){
                s = Character.toString(((char) Integer.parseInt(s)));
            }
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println(borderLines[0]);
    }
}
