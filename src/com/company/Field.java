package com.company;

class Field {

    private char[] field = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    char[] getField() {
        return this.field;
    }

    void updateField(int cellNumber, char value) {
        this.field[cellNumber-1] = value;
    }

    boolean isCellFree(int cellNumber){
        return this.field[cellNumber - 1] != 'X' && this.field[cellNumber - 1] != 'O';
    }

    void printField() {
        for (int i = 0; i<this.field.length; i++) {
            if (i == 2 || i == 5 || i == 8)
                System.out.println(this.field[i] + "  ");
            else System.out.print(this.field[i] + "  ");
        }
        System.out.println();
    }
}
