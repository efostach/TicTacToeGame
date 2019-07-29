package com.company;

class GameLogic {

    private static char[][] winingCombinations = {
            {'*', ' ', ' ', '*', ' ', ' ', '*', ' ', ' '},
            {'*', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*'},
            {'*', '*', '*', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', '*', '*', '*', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', '*', '*', '*'},
            {' ', ' ', '*', ' ', '*', ' ', '*', ' ', ' '},
            {' ', '*', ' ', ' ', '*', ' ', ' ', '*', ' '},
            {' ', ' ', '*', ' ', ' ', '*', ' ', ' ', '*'}

    };

    private static void updateWiningCombinations(char figure) {
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                if (winingCombinations[j][i] != ' ')
                    winingCombinations[j][i] = figure;
            }
        }
    }

    static boolean isCellNumberCorrect(int index, Field field) {
        if (index > 9 || index < 1) {
            System.out.println("This index is incorrect. Please, try again." + '\n');
            return false;
        } else if (field.isCellFree(index)) {
            field.updateField(index, field.userFigure);
            return true;
        } else {
            System.out.println("This index is busy. Please, try again." + '\n');
            return false;
        }
    }

    static boolean checkWiningCombinationsExistence(Field field, char figure) {

        updateWiningCombinations(figure);

        for (int j = 0; j < 8; j++) {
            char[] currentFieldState = field.getField();
            int coincidencesNumber = 0;

            for (int i = 0; i < currentFieldState.length; i++) {

                if (currentFieldState[i] == winingCombinations[j][i]
                        && figure == winingCombinations[j][i])
                    coincidencesNumber++;

                if (coincidencesNumber == 3)
                    return true;
            }
        }
        return false;
    }

    static void systemMove(Field field) {
        int index = 1;

        while (!field.isCellFree(index) && index < 10)
            index++;
        field.updateField(index, field.systemFigure);
    }

    static void userMove(int index, Field field) {
        field.updateField(index, field.userFigure);
    }
}
