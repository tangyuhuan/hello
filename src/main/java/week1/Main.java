package week1;
//第一周题目——温度转换
import java.util.Scanner;
 public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int Ftem = in.nextInt();
        int Ctem = (int)((Ftem - 32)*5/9);
        System.out.println(Ctem);
    }

}

