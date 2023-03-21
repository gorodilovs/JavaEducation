// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
// И вывести Доску.
// Пример вывода доски 8x8

// 0x000000
// 0000x000
// 00x00000

package Seminar_5;

import java.util.TreeMap;

public class task_3 {
    public static void main(String[] args) {
        int[] board = new int[64];
        TreeMap<Integer, int[]> queens = new TreeMap<>();

        // Fill
        for (int i = 0; i < 64; i++) {
            board[i] = i;
        }

        for (int i = 0; i < 64; i++) {
            if (8 + queens.size() * 8 < i) {
                i = queens.lastKey();
                queens.pollLastEntry();
                board = queens.get(queens.lastKey()).clone();
            } else {
                if (board[i] != 88) {

                    //System.out.println("New queen: " + i);
                    NewQueen(board, i);
                    queens.put(i, board.clone());
                    //PrintBoard(board);
                    //System.out.println();
                }
                if (i == 63 && queens.size() < 8 && queens.size() != 0) {
                    i = queens.lastKey();
                    queens.pollLastEntry();
                    board = queens.get(queens.lastKey()).clone();

                    //System.out.println("Last key: " + queens.lastKey());
                    //System.out.println("Last board: ");
                    //PrintBoard(queens.get(queens.lastKey()));
                }
            }
        }

        PrintAnswer(queens);
    }

    public static int[] NewQueen(int[] board, int queen) {

        int queenRow = queen / 8;
        int quennColumn = queen % 8 + 8 * (queenRow);
        // Row
        for (int i = (queenRow) * 8; i < 8 + (queenRow) * 8; i++) {
            board[i] = 88;
        }

        // Column
        for (int i = quennColumn; i < 64; i += 8) {
            board[i] = 88;
        }

        // Left lower diagonal
        if (8 - queenRow > queen % 8) {
            for (int i = queen + 7; i <= queen + 7 * (queen % 8); i += 7) {
                board[i] = 88;
            }
        } else {
            for (int i = queen + 7; i < queen + 7 * (8 - (queen / 8)); i += 7) {
                board[i] = 88;
            }
        }

        // Right lower diagonal
        if (8 - queenRow > 8 - (queen % 8)) {
            for (int i = queen + 9; i <= queen + 9 * (8 - (queen % 8) - 1); i += 9) {
                board[i] = 88;
            }
        } else {
            for (int i = queen + 9; i <= queen + 9 * (8 - (queen / 8) - 1); i += 9) {
                board[i] = 88;
            }
        }
        return board;
    }

    public static void PrintBoard(int[] board) {
        for (int i = 0; i < 64; i++) {
            if (i % 8 == 0)
                System.out.println();
            if (board.length < i)
                System.out.print("0");
            else {
                if (board[i] < 10)
                    System.out.print(board[i] + "  ");
                else
                    System.out.print(board[i] + " ");
            }
        }
        System.out.println();
    }

    public static void PrintAnswer(TreeMap<Integer, int[]> queens) {
        Boolean printed = false;
        var queenArr = queens.navigableKeySet().toArray();
        for (int i = 0; i < 64; i++) {
            printed = false;
            if (i % 8 == 0)
                System.out.println();

            for (int j = 0; j < queenArr.length; j++) {
                if (i == (Integer) queenArr[j]) {
                    printed = true;
                    System.out.print("Q  ");
                }
            }
            if (!printed) {
                System.out.print("0  ");
            }
        }
    }
}
