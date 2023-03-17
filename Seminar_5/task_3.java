// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
// И вывести Доску.
// Пример вывода доски 8x8

// 0x000000
// 0000x000
// 00x00000

package Seminar_5;

import java.util.LinkedList;
import java.util.List;

public class task_3 {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        int[][] queenOnePos = new int[8][2];
        int[] avoid = new int[2];
        int qCount = 0;
        int vectorCount = 1;
        int stepBack = 0;
        //List<int[]> queensAllPos = new LinkedList<>();

        // while(qCount != 8)
        // {
        //     if (qCount < 8)
        //     {
        //         stepBack++;
        //     }
        // }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == 0 && qCount < 8 && board[avoid[0]][avoid[1]] != 0)
                {
                    queenOnePos[qCount][0] = i;
                    queenOnePos[qCount][1] = j;
                    board[i][j] = -vectorCount;
                    qCount++;

                    for (int i2 = 0; i2 < board.length; i2++) {
                        for (int j2 = 0; j2 < board[i2].length; j2++) {
                            if (board[i2][j2] != -1)
                            {
                                if (i2 == i - j + j2
                                || i2 == i + j - j2
                                || i2 == i || j2 == j)
                                {   
                                    if (board[i2][j2] == 0)                               
                                        board[i2][j2] = vectorCount;                                   
                                }
                            }                          
                        }                       
                    }
                    vectorCount++;
                    
                    //PrintBoard(board);
                }

                if (i == board.length -1 && j == board[i].length -1 && qCount != 8)
                {
                    System.out.println("!!!");
                    for (int i2 = 0; i2 < board.length; i2++) {
                        for (int j2 = 0; j2 < board[i2].length; j2++) {
                            if (board[i2][j2] == vectorCount-1 || board[i2][j2] == -vectorCount+1)
                            {
                                board[i2][j2] = 0;
                            }
                        }
                    }
                    vectorCount--;
                    i = 0;
                    j = 0;
                    avoid[0] = queenOnePos[qCount-1][0];
                    avoid[1] = queenOnePos[qCount-1][1];
                    queenOnePos[qCount-1][0] = 0;
                    queenOnePos[qCount-1][1] = 0;
                    qCount--;
                }

            }
            System.out.println("Ittertion: " + i);
            PrintBoard(board);
            System.out.println("qCOunt "+ qCount);
        }

        for (int[] is : queenOnePos) {
            for (int is2 : is) {
                System.out.print(is2);
            }  
            System.out.println();  
        }
        System.out.println(qCount);
    }

    public static void PrintBoard(int[][] board)
    {
        for (int i3 = 0; i3 < board.length; i3++) {
            for (int j3 = 0; j3 < board[i3].length; j3++) {
                if (board[i3][j3] < 0)
                    System.out.print(-board[i3][j3]+ "! ");
                else if (board[i3][j3] > 0)
                    System.out.print(board[i3][j3]+ "  ");
                else
                    System.out.print("0  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
