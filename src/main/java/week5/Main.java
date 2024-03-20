package week5;
import java.util.Scanner;
//多项式加法
//实际上这道题是需要用户输入两个多项式，每一个多项式需要输入每一项的指数（也称次幂或指数）和系数，直到输入的项的指数为0时，即输入的项是常数项时，就结束一个多项式的输入。
// 之后再输入第二个多项式
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array1 = new int[101];
        int[] array2 = new int[101];
        int index1 = 0;
        int number1 = 0;
        do{
            index1 = in.nextInt();//幂次
            number1 = in.nextInt();;
            array1[index1] = number1;
        }while(index1>0);

        int index2 = 0;
        int number2 = 0;
        do{
            index2 = in.nextInt();//幂次
            number2 = in.nextInt();;
            array2[index2] = number2;
        }while(index2>0);

        for(int i=100;i>1;i--){
            if(array1[i]>0 || array2[i]>0){
                System.out.print((array1[i]+array2[i])+"x"+i+"+");
            }
        }
        if(array1[1]>0 || array2[1]>0){
            System.out.print((array1[1]+array2[1])+"x"+"+");
        }
        if(array1[0]>0 || array2[0]>0){
            System.out.print(array1[0]+array2[0]);
        }



    }
}
