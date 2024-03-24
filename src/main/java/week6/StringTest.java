package week6;

public class StringTest {
    public static void main(String[] args) {
//方法一：用new创建一个字符串，交给一个字符串的变量的完整过程
//        1.创建了一个String对象
//        2.用"a string"初始化这个对象
//        3.创建管理这个对象的变量s
//        4.让s管理这个对象
        String s = new String("a string");
//方法二：字面量初始化
        String s2 = "a string";

        System.out.println(1+2+s2);
        System.out.println("string test".indexOf('t',3));
    }
}
