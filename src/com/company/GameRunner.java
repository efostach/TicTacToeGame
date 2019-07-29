package com.company;

import java.util.Scanner;

import static com.company.GameLogic.*;

public class GameRunner {

    public static void main(String[] args) {

        Field field = new Field();
        Scanner scanner = new Scanner(System.in);
        char input;
        int inputCellNumber;
        int move = 0;

        System.out.println("Hello! Let's start TicTacToe game!");
        System.out.println("Please, choose X or O for playing ...");

        input = scanner.next().toUpperCase().trim().charAt(0);

        while (input != 'X' && input != 'O') {
            System.out.println("You choice is " + input);
            System.out.println("It's incorrect value. Please, try again ...");
            System.out.println();
            input = scanner.next().toUpperCase().trim().charAt(0);
        }

        System.out.println('\n' + "You choice is " + input + '\n');
        field.printField();
        field.setUserFigure(input);
        field.setSystemFigure();

        if (field.userFigure == 'X') {
            System.out.println("Your move! Choose cell's number ..." +'\n');
            inputCellNumber = scanner.nextInt();
            while (!isCellNumberCorrect(inputCellNumber, field)) {
                inputCellNumber = scanner.nextInt();
            }
            userMove(inputCellNumber, field);
            field.printField();
            move++;
            while (move < 9) {
                System.out.println("The system move ...");
                systemMove(field);
                field.printField();
                move++;
                if (checkWiningCombinationsExistence(field, field.systemFigure)) {
                    System.out.println("The system is winner!");
                    break;
                }
                System.out.println("Your move! Choose cell's number ..." +'\n');
                inputCellNumber = scanner.nextInt();
                while (!isCellNumberCorrect(inputCellNumber, field)) {
                    inputCellNumber = scanner.nextInt();
                }
                userMove(inputCellNumber, field);
                field.printField();
                move++;
                if (checkWiningCombinationsExistence(field, field.userFigure)) {
                    System.out.println("You are winner!");
                    break;
                }
            }
            if (!checkWiningCombinationsExistence(field, field.systemFigure)
                    && !checkWiningCombinationsExistence(field, field.userFigure))
                System.out.println("No winner ...");
        } else {
            System.out.println("The system move ...");
            systemMove(field);
            field.printField();
            move++;
            while (move < 9) {
                System.out.println("Your move! Choose cell's number ..." +'\n');
                inputCellNumber = scanner.nextInt();
                while (!isCellNumberCorrect(inputCellNumber, field)) {
                    inputCellNumber = scanner.nextInt();
                }
                userMove(inputCellNumber, field);
                field.printField();
                move++;
                if (checkWiningCombinationsExistence(field, field.userFigure)) {
                    System.out.println("You are winner!");
                    break;
                }
                System.out.println("The system move ...");
                systemMove(field);
                field.printField();
                move++;
                if (checkWiningCombinationsExistence(field, field.systemFigure)) {
                    System.out.println("The system is winner!");
                    break;
                }
            }
            if (!checkWiningCombinationsExistence(field, field.userFigure)
                    && !checkWiningCombinationsExistence(field, field.systemFigure))
                System.out.println("No winner ...");
        }
    }
}

