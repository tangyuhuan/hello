package week6;

public class WrapperClass {
    public static void main(String[] args) {
        //int整数类型用四个字节(32个bit)来表达，所以范围是-2^31,2^31-1
        int i = 10;
        Integer k = 10;
        k=i;
        //当需要让一个类或对象做事情的时候，用.运算符
        System.out.println(Integer.MAX_VALUE);//2147483647,即2^31-1
        System.out.println(Integer.MIN_VALUE);//-2147483648,即-2^31
        System.out.println(Character.isDigit('1'));//判断这个字符是不是数字
        System.out.println(Character.toLowerCase('I'));//把这个字符转换成小写

    }
}
