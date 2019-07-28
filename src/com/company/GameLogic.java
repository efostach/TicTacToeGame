package com.company;

public class GameLogic {

    private char winingCombiations[][] = {
            {'X', '2', '3', 'X', '5', '6', 'X', '8', '9'},
            {'X', '2', '3', '4', 'X', '6', '7', '8', 'X'},
            {'X', 'X', 'X', '4', '5', '6', '7', '8', '9'},
            {'1', '2', '3', 'X', 'X', 'X', '7', '8', '9'},
            {'1', '2', '3', '4', '5', '6', 'X', 'X', 'X'},
            {'1', '2', 'X', '4', 'X', '6', 'X', '8', '9'},
            {'1', 'X', '3', '4', 'X', '6', '7', 'X', '9'},
            {'1', '2', 'X', '4', '5', 'X', '7', '8', 'X'}

    };

    public static boolean checkInputParameter(char input){
        System.out.println("You input is : " + input);
        if(input != 'x'
                && input != 'X'
                && input != 'o'
                && input != 'O') {
            System.out.println("It's incorrect input value. Please, try again." + '\n');
            return false;
        }
        System.out.println();
        return true;
    }

    public static boolean checkInputParameter(int input){
        System.out.println("You input is : " + input);
        if(input > 9 || input < 1) {
            System.out.println("It's incorrect input value. Please, try again." + '\n');
            return true;
        }
        System.out.println();
        return false;
    }

    public void checkWinigCombiationExistace() {
    }

    public void systemMove() {
    }

    public void userMove() {
    }

    public void setUserFigure(char value) {
    }

    public void getUserFigure() {
    }

    public void setSystemFigure(char value) {
    }

    public void getSystemFigure() {
    }

}
