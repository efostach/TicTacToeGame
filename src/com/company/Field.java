package com.company;

public class Field {

    char[] field = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};


    public char[] getField() {
        return this.field;
    }

    public void updateField(int index, char value) {
        this.field[index-1] = value;
    }

    public void printField() {
        for (int i = 0; i<9; i++) {
            if (i == 2 || i == 5 || i == 8) System.out.println(this.field[i] + "  ");
            else System.out.print(this.field[i] + "  ");
        }
        System.out.println();
    }
}
