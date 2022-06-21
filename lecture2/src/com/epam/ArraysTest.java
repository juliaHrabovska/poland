package com.epam;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
//        example1();
//        example2();
//        example3();
        example4();
//        example5();
    }

    private static void example1() {
        String[] seasons = new String[4]; // creating an array

        // initializing of the array
        seasons[0] = "Winter";
        seasons[1] = "Spring";
        seasons[2] = "Summer";
        seasons[3] = "Autumn";
//        String[] seasons  = new String[] {"Winter", "Spring", "Summer", "Autumn"};

        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }
    }

    private static void example2() {
        int[][] twoDimArray; //two-dimensional array
        String[][][] threeDimArray; //3D array
        double[][][][][] fiveDimArray; // five-dimensional array

    }

    private static void example3() {
        int[][] twoDimArray = new int[3][4];
        twoDimArray[0][0] = 5;
        twoDimArray[0][1] = 7;
        twoDimArray[0][2] = 3;
        twoDimArray[0][3] = 17;
        twoDimArray[1][0] = 7;
        twoDimArray[1][1] = 0;
        twoDimArray[1][2] = 1;
        twoDimArray[1][3] = 12;
        twoDimArray[2][0] = 8;
        twoDimArray[2][1] = 1;
        twoDimArray[2][2] = 2;
        twoDimArray[2][3] = 3;

//        int [][] twoDimArray = {{5,7,3,17},
//                                {7,0,1,12},
//                                {8,1,2,3}};

        for (int i = 0; i < 3; i++) { // rows
            for (int j = 0; j < 4; j++) { // columns
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println(); // new line for printing it as a table
        }

        System.out.println(Arrays.deepToString(twoDimArray));
    }

    private static void example4() {
        int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        System.out.println(twoDimArray.length);
        System.out.println(twoDimArray[0].length);
    }

    private static void example5() {
        // chess board
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(chessBoard[i][j] = "W");
                } else {
                    System.out.print(chessBoard[i][j] = "B");
                }
            }
            System.out.println();
        }

    }
}
