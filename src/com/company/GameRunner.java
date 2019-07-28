package com.company;

import static com.company.GameLogic.*;

public class GameRunner {

    public static void main(String[] args) {

        Field a = new Field();
        a.printField();
        a.updateField(5, 'r');
        a.printField();
        a.getField();
        checkInputParameter(1);
        checkInputParameter(-2);
        checkInputParameter('o');
        checkInputParameter('X');
        checkInputParameter('x');
        checkInputParameter('j');
        checkInputParameter('d' + 'd');
    }

}

