package week5;

import java.util.Scanner;

//输入数量不确定的[0,9]范围内的整数，统计每一种数字出现的次数，输入-1表示结束
public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int[] numbers = new int[10];//每一位存储数字的数量
        while(x!=-1){
            if(x>=0 && x<=9){
                numbers[x]++;
            }
            x = in.nextInt();
        }
        for(int i=0;i<numbers.length;i++){
            System.out.println(i+":"+numbers[i]);
        }
    }
}
