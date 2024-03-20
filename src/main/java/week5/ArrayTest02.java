package week5;

public class ArrayTest02 {
    public static void main(String[] args) {
       int[] a = new int[10];
       a[0]=5;
       int[] b = a;
       b[0]=16;
       System.out.print(a[0]);
    }
}
