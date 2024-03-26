package week5;
import java.util.Scanner;
import java.util.Arrays;

//多项式加法
//实际上这道题是需要用户输入两个多项式，每一个多项式需要输入每一项的指数（也称次幂或指数）和系数，直到输入的项的指数为0时，即输入的项是常数项时，就结束一个多项式的输入。
// 之后再输入第二个多项式

//一定要注意几个点：
//　　1.只有常数项的时候
//　　2.系数为1时候，系数不输出
//　　3.指数为1时候，指数不输出
//　　4.常数项即使为0，也要输出,即多项式加法结果等于0时要输出0
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array1 = new int[101];
        int[] array2 = new int[101];
        int index1 = 0;
        int number1 = 0;
        do{
            index1 = in.nextInt();//幂次
            number1 = in.nextInt();
            array1[index1] += number1;
        }while(index1>0);

        int index2 = 0;
        int number2 = 0;
        do{
            index2 = in.nextInt();//幂次
            number2 = in.nextInt();;
            array2[index2] += number2;
        }while(index2>0);

        int flag = 0;
        for(int i=100;i>=0;i--){
            int sum = array1[i]+array2[i];
            if(sum!=0){
                flag++;
                if((sum>0)&&(flag!=1)){
                    System.out.print("+");
                }
                if(sum==-1){
                    System.out.print("-");
                }
                if((sum!=1)&&(sum!=-1)){
                    System.out.print(sum);
                }
                if(i!=0){
                    System.out.print("x");
                }
                if((i!=0)&&(i!=1)){
                    System.out.print(i);
                }
            }else{
                if(i==0){
                    if(flag==0){
                        System.out.print(sum);
                    }
                }

            }
        }

    }
}