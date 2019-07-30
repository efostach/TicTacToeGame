package main.java.com.efostach.tictactoe;

public class GameUtil {

    static final String HELLO_MSG = "Hello! Let's start TicTacToe game!";
    static final String INCORRECT_CELL_NUMBER_MSG = "This cell number is incorrect. Please, try again.";
    static final String USER_MOVE_MSG = "Your move! Choose cell's number ...";
    static final String SYSTEM_MOVE_MSG = "The system move ...";
    static final String USER_WINNER_MSG = "You are winner!";
    static final String SYSTEM_WINNER_MSG = "The system is winner!";
    static final String NO_WINNER_MSG = "No winner ...";

    enum player {USER, SYSTEM}

    static char[][] winingCombinations = {
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
}
