package week3;

import java.util.Scanner;

//反转输出一个整数
public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int digit = 0;
        int reverseNum = 0;
        while(number>0){
            digit = number%10;
            reverseNum = reverseNum*10+digit;
            System.out.print(digit); //一个一个数字输出
            number = number/10;
        }
        System.out.println();
        System.out.println(reverseNum);
    }
}


