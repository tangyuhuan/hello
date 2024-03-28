package week7;
//传值
//函数每次运行，就产生了一个独立的变量空间，在这个空间中的变量，是函数这次运行所独有的，称为本地变量
//定义在函数内部的就是本地变量，参数也是本地变量
//函数传递的是值
public class Swap {
    public static void swap(int a, int b){
        int t;
        t = a;
        a = b;
        b = t;
    }

    public static void main(String[] args){
        int a = 5;
        int b = 6;
        swap(a,b);
        System.out.println("a="+a+",b="+b);
    }
}
