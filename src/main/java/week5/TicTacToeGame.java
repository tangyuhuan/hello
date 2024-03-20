package week5;


import java.util.Scanner;

//TicTacToeGame
//读入一个3*3的矩阵，某一列、某一行、某对角线有3个1 or 3个0，则获胜
public class TicTacToeGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SIZE = 3;
        int[][] board = new int[SIZE][SIZE];
        boolean gotResult = false;
        int numOf1 = 0;
        int numOf0 = 0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j] = in.nextInt();
            }
        }
        //判断行
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==1){
                    numOf1++;
                }else{
                    numOf0++;
                }
            }
            if(numOf1 == SIZE || numOf0 == SIZE)
            {
                gotResult = true;
                break;
            }
            numOf1 = 0;
            numOf0 = 0;
        }
        //判断列
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[j][i]==1){
                    numOf1++;
                }else{
                    numOf0++;
                }
            }
            if(numOf1 == SIZE || numOf0 == SIZE)
            {
                gotResult = true;
                break;
            }
            numOf1 = 0;
            numOf0 = 0;
        }

        //判断对角线1
        numOf1 = 0;
        numOf0 = 0;
        for(int i=0;i<board.length;i++){
            if(board[i][i]==1){
                numOf1++;
            }else{
                numOf0++;
            }
            if(numOf1 == SIZE || numOf0 == SIZE)
            {
                gotResult = true;
                break;
            }

        }

        //判断对角线2
        numOf1 = 0;
        numOf0 = 0;
        for(int i=0;i<board.length;i++){
            if(board[i][board.length-i-1]==1){
                numOf1++;
            }else{
                numOf0++;
            }
            if(numOf1 == SIZE || numOf0 == SIZE)
            {
                gotResult = true;
                break;
            }
        }


        System.out.println(gotResult);

    }
}
