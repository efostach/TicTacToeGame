package com.company;

import java.util.Scanner;

import static com.company.util.*;
import static com.company.util.player.SYSTEM;
import static com.company.util.player.USER;

class GameLogic {

    Field field = new Field();
    Scanner scanner = new Scanner(System.in);
    int inputCellNumber;
    int moveNumber = 0;

    void start() {

        System.out.println(HELLO_MSG + '\n');
        field.printField();

        while (moveNumber < 9) {
            System.out.println(USER_MOVE_MSG);
            inputCellNumber = scanner.nextInt();
            while (!move(inputCellNumber, USER)) {
                System.out.println(INCORRECT_CELL_NUMBER_MSG);
                inputCellNumber = scanner.nextInt();
            }
            moveNumber++;
            field.printField();

            if (isWinnerExist(field.getField())) {
                System.out.println(USER_WINNER_MSG);
                break;
            }
            else if (moveNumber < 9){
                System.out.println(SYSTEM_MOVE_MSG);
                inputCellNumber = 0;
                do {
                    inputCellNumber++;
                }
                while (!move(inputCellNumber, SYSTEM));
                moveNumber++;
                field.printField();
                if (isWinnerExist(field.getField())) {
                    System.out.println(SYSTEM_WINNER_MSG);
                    break;
                }
            }
        }
        if (!isWinnerExist(field.getField())) System.out.println(NO_WINNER_MSG);
    }

    boolean move(int cellNumber, player player) {
        if (cellNumber > 9 || cellNumber < 1 || !field.isCellFree(cellNumber)) {
            return false;
        } else if (player.equals(USER))
                field.updateField(cellNumber, 'X');
            else field.updateField(cellNumber, 'O');
            return true;
        }
}
