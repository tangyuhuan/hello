package week6;

//大小写转换
//字母和数字在unicode中是顺序排列的，大写字母和小写字母是分开排列的，并不在一起
//'a'-'A'可以得到两段之间的距离
public class Transform {
    public static void main(String[] args) {
        char c2 = 'A';
        char c1 = 'a';
        System.out.println((int)('A'));
        System.out.println((int)('a'));
        System.out.println('a'-'A');//'a'-'A'可以得到两段之间的距离
        System.out.println((char)('A'+'a'-'A'));//a+'a'-'A'可以把一个大写字母变成小写字母
        System.out.println((char)('a'+'A'-'a'));//a+'a'-'A'可以把一个小写字母变成大写字母
    }
}
