package com.company;

class Field {

    char userFigure;
    char systemFigure;
    private char[] field = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    char[] getField() {
        return this.field;
    }

    void updateField(int index, char value) {
        this.field[index-1] = value;
    }

    boolean isCellFree(int index){
        return this.field[index - 1] != 'X' && this.field[index - 1] != 'O';
    }

    void printField() {
        for (int i = 0; i<this.field.length; i++) {
            if (i == 2 || i == 5 || i == 8)
                System.out.println(this.field[i] + "  ");
            else System.out.print(this.field[i] + "  ");
        }
        System.out.println();
    }

    void setUserFigure(char value) {
        userFigure = value;
    }

    void setSystemFigure() {
        if (this.userFigure == 'X' || this.userFigure == 'x')
            systemFigure = 'O';
        else systemFigure = 'X';
    }
}
