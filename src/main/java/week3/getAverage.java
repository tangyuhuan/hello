package week3;

import java.util.Scanner;
public class getAverage {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum = 0;
        int count = 0;
        while(number != -1){
            sum += number;
            count++;
            number = in.nextInt();
        }
        if(count>0){
            System.out.println("平均数："+(double)sum/count);
        }
    }
}
