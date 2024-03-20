package week5;

//复制数组
//如果要判断两个数组对应位置上元素的值是否相等，也需要遍历
public class CopyArray {
    public static void main(String[] args) {
        int[] a = {87,43,21,454,25,12,2};//直接初始化数组
        int[] b = new int[a.length];
        for(int i=0;i<b.length;i++){
            b[i] = a[i];
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        System.out.println(a==b);
    }
}
