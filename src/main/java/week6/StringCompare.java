package week6;
import java.util.Scanner;
//字符串变量是字符串的管理者，而非所有者
//比较两个String内容是否相同，应该用.equals()
public class StringCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next(); //控制台录入bye
        System.out.println(s=="bye"); //false，比较是否同一个
        System.out.println(s.equals("bye"));//true，比较内容是否相同

        //访问String里的字符
        //s.charAt(index)返回在index上的单个字符
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
        //但不能用for-each循环遍历字符串
//        for(char c:s){
//            System.out.println(c);
//        }
        //得到字串
//        s.substring(n)得到从n号位置到末尾的全部内容
//        s.substring(b,e)得到从b号位置到e号位置之前的内容
        String s1 = " 0123A56389汉字 ";
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,4));//23
        //寻找字符s.indexOf(c)得到c字符所在的位置，-1表示不存在
        System.out.println(s1.indexOf('4'));
        System.out.println(s1.indexOf('A'));
        //s.indexOf(c,n)从n号位置开始寻找c字符，包括n
        int loc = s1.indexOf('3');
        System.out.println(s1.indexOf('3',loc+1));
        //s.indexOf(t)找到字符串t所在的位置
        System.out.println(s1.indexOf("9汉"));
        //s.lastIndexOf(t)从右边开始找
        System.out.println(s1.lastIndexOf("9汉"));

        //注意：在java中所有的字符串都是不可变的，对他们的操作结果都是制造新的字符串出来
        String s4 = "abc";
        System.out.println(s4.trim());//把字符串两端的空格删掉
        System.out.println(s4.startsWith("a"));//true
        String s2 = "abcd";
        String s3 = s2.toUpperCase();
        System.out.println(s2);//abcd
        System.out.println(s3);//ABCD



    }

}
