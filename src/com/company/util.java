package com.company;

public class util {

    static final String HELLO_MSG = "Hello! Let's start TicTacToe game!";
    static final String INCORRECT_CELL_NUMBER_MSG = "This cell number is incorrect. Please, try again.";
    static final String USER_MOVE_MSG = "Your move! Choose cell's number ...";
    static final String SYSTEM_MOVE_MSG = "The system move ...";
    static final String USER_WINNER_MSG = "You are winner!";
    static final String SYSTEM_WINNER_MSG = "The system is winner!";
    static final String NO_WINNER_MSG = "No winner ...";

    enum player {USER, SYSTEM}

    private static char[][] winingCombinations = {
            {'X', ' ', ' ', 'X', ' ', ' ', 'X', ' ', ' '},
            {'X', ' ', ' ', ' ', 'X', ' ', ' ', ' ', 'X'},
            {'X', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', 'X', 'X', 'X', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', 'X', 'X', 'X'},
            {' ', ' ', 'X', ' ', 'X', ' ', 'X', ' ', ' '},
            {' ', 'X', ' ', ' ', 'X', ' ', ' ', 'X', ' '},
            {' ', ' ', 'X', ' ', ' ', 'X', ' ', ' ', 'X'},

            {'O', ' ', ' ', 'O', ' ', ' ', 'O', ' ', ' '},
            {'O', ' ', ' ', ' ', 'O', ' ', ' ', ' ', 'O'},
            {'O', 'O', 'O', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', 'O', 'O', 'O', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', 'O', 'O', 'O'},
            {' ', ' ', 'O', ' ', 'O', ' ', 'O', ' ', ' '},
            {' ', 'O', ' ', ' ', 'O', ' ', ' ', 'O', ' '},
            {' ', ' ', 'O', ' ', ' ', 'O', ' ', ' ', 'O'}

    };

    static boolean isWinnerExist(char[] currentFieldState) {
        int j;

        for (j = 0; j < 15; j++) {
            int coincidencesNumber = 0;
            for (int i = 0; i < currentFieldState.length; i++) {
                if (currentFieldState[i] == winingCombinations[j][i]
                        && ('X' == winingCombinations[j][i] || 'O' == winingCombinations[j][i]))
                    coincidencesNumber++;
                if (coincidencesNumber == 3)
                    return true;
            }
        }
        return false;
    }

}
