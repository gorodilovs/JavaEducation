// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
// И вывести Доску.
// Пример вывода доски 8x8

// 0x000000
// 0000x000
// 00x00000

package Seminar_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.swing.text.html.StyleSheet;

public class task_3 {
    public static void main(String[] args) {
        int[] board = new int[64];
        List<Integer> queens = new ArrayList<>();
        // List<Integer> vectorQueen = new ArrayList<>();
        // List<Integer> remainingPositions = new ArrayList<>();

        // Fill
        for (int i = 0; i < 64; i++) {
            board[i] = i;
        }

        // Make leap after Queen-found!
        // Using while Q < 8
        // Using Map to step-back
        for (int i = 0; i < 64; i++) {
            if (board[i] != 88)
            {
                queens.add(i);
                NewQueen(board, i);
                PrintBoard(board);
            }
        }
        

        System.out.println(queens);
    }

    public static int[] NewQueen (int[] board, int queen)
    {
        
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
        if (8 - queenRow > queen % 8)
        {
            for (int i = queen + 7; i <= queen + 7 * (queen % 8); i += 7) {
                board[i] = 88;
            }
        }
        else
        {
            for (int i = queen + 7; i < queen + 7 * (8 - (queen / 8)); i += 7) {
                board[i] = 88;
            }
        }

        // Right lower diagonal
        if (8 - queenRow > 8 - (queen % 8))
        {
            for (int i = queen + 9; i <= queen + 9 * (8 - (queen % 8) - 1); i += 9) {
                board[i] = 88;
            }
        }
        else
        {
            for (int i = queen + 9; i <= queen + 9 * (8 - (queen / 8) - 1); i += 9) {
                board[i] = 88;
            }
        }
        return board;
    }









    public static void PrintBoard(int[] board){
        for (int i = 0; i < 64; i++) {
            if (i % 8 == 0)
                System.out.println();
            if (board.length < i)
                System.out.print("0");
            else
            {
                if (board[i] < 10)
                    System.out.print(board[i]+ "  "); 
                else
                    System.out.print(board[i]+ " ");
            }                
        }
    }

    // public static void PrintBoard(List<Integer> remainingPositions){
    //     int counter = 0;
    //     for (int i = 0; i < 64; i++) {
    //         if (i % 8 == 0)
    //              System.out.println();                

    //         if (remainingPositions.size() -1 < i)
    //             System.out.print("0  ");
    //         else
    //         {
    //             if (remainingPositions.get(counter) == i)
    //             {
    //                 if (remainingPositions.get(counter) < 10)
    //                     System.out.print(remainingPositions.get(counter)+ "  "); 
    //                 else
    //                     System.out.print(remainingPositions.get(counter)+ " ");
                    
    //                 counter++;
    //             }
    //             else
    //                 System.out.print("0  ");              
    //         }
    //     }
    // }
}
