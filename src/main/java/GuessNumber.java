import java.util.Scanner;
import java.util.Random;
//猜数小游戏
public class GuessNumber {
    public static void main(String[] args) {
        System.out.print("请输入你猜的整数：");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 1;
//        Math.random()得到[0,1)的随机数----->[1,100]
        int randomNumber = (int)(Math.random()*100+1);
//        System.out.println(randomNumber);
        while(number!=randomNumber){
            if(number<randomNumber){
                System.out.println("太小了");
            }else{
                System.out.println("太大了");
            }
            count++;
            number = in.nextInt();
        }
        System.out.print("猜中了!猜了"+count+"次");

    }
}
