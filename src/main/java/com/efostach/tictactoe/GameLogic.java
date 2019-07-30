package main.java.com.efostach.tictactoe;

import java.util.Scanner;

class GameLogic {

    Field field = new Field();
    Scanner scanner = new Scanner(System.in);
    int inputCellNumber;
    int moveNumber = 0;

    void start() {

        System.out.println(GameUtil.HELLO_MSG + '\n');
        field.printField();

        while (moveNumber < 9) {
            System.out.println(GameUtil.USER_MOVE_MSG);
            inputCellNumber = scanner.nextInt();
            while (!move(inputCellNumber, GameUtil.player.USER)) {
                System.out.println(GameUtil.INCORRECT_CELL_NUMBER_MSG);
                inputCellNumber = scanner.nextInt();
            }
            moveNumber++;
            field.printField();

            if (field.isWinnerExist()) {
                System.out.println(GameUtil.USER_WINNER_MSG);
                break;
            }
            else if (moveNumber < 9){
                System.out.println(GameUtil.SYSTEM_MOVE_MSG);
                inputCellNumber = 0;
                do {
                    inputCellNumber++;
                }
                while (!move(inputCellNumber, GameUtil.player.SYSTEM));
                moveNumber++;
                field.printField();
                if (field.isWinnerExist()) {
                    System.out.println(GameUtil.SYSTEM_WINNER_MSG);
                    break;
                }
            }
        }
        if (!field.isWinnerExist()) System.out.println(GameUtil.NO_WINNER_MSG);
    }

    boolean move(int cellNumber, GameUtil.player player) {
        if (cellNumber > 9 || cellNumber < 1 || !field.isCellFree(cellNumber)) {
            return false;
        } else if (player.equals(GameUtil.player.USER))
                field.updateField(cellNumber, 'X');
            else field.updateField(cellNumber, 'O');
            return true;
        }
}
