package week1;

import java.util.Scanner;

public class HelloFloat {
    public static void main(String[] args){
        System.out.println(1.2-1.1);
        System.out.println(3/4);
        int ff = (int)(32/3.0);
        System.out.println(ff);
        int a = 10;
        int b = -20;
        double c = b;
        System.out.println(c);
        System.out.println(a* -b);//单目运算符，优先级最高
//        int foot;
//        int inch;
//        Scanner in = new Scanner(System.in);
//        foot=in.nextInt();
//        inch=in.nextInt();
//        System.out.println((foot+inch/12.0)*0.3048);
        int foot;
        double inch;
        Scanner in = new Scanner(System.in);
        foot=in.nextInt();
        inch=in.nextDouble();
//        inch=in.nextInt(); //读一个整数，交给一个浮点数变量
        System.out.println("foot:"+foot+",inch:"+inch);
        System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");//将double 强制转换为int
    }
}
