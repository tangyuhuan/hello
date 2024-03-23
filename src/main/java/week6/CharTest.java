package week6;

//单个的字符是一种特殊的类型char，用单引号表示字符的字面量
//Java使用Unicode来表示字符，可以表达包括汉字在内的多种文字
//一个字符加一个数字得到unicode码表中那个数之后的字符


public class CharTest {
    public static void main(String[] args) {
        char c = '汉';
        c++;
        char c2 = 'A';//等价于'\u0041',等价于65
//        c2++;
        char c3 = 'D';
        System.out.println(c);
        System.out.println((int)c2);//char也可以和int之间相互赋值，因为Unicode中，是使用一个数字来代表一个字母/汉字/其他字符
        System.out.println(c3-c2);
    }
}
