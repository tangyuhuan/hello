package week5;

import java.util.Scanner;

//获取大于平均数的数字
//数组是一种容器，特点是
//1.其中所有的元素具有相同数据类型
//2.一旦创建，大小不能改变
public class NumberBeyondAvg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();//有多少个数字要输入
        if(cnt>0){
            int[] numbers = new int[cnt];//定义数组
            double sum = 0;
            for(int i=0;i<numbers.length;i++){
                numbers[i] = in.nextInt();
                sum += numbers[i];
            }
            double avg = sum/cnt;
            for(int i=0;i<cnt;i++){
                if(numbers[i]>avg){
                    System.out.println(numbers[i]);
                }
            }
            System.out.println(avg);

        }

    }
}
