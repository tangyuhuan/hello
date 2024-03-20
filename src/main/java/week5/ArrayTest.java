package week5;

//每个数组有一个内部成员length，他会告诉你元素的数量
public class ArrayTest {
    public static void main(String[] args) {
//        int[] scores = {87,43,21,454,25,12,2};//直接初始化数组
//        for(int i=0;i<scores.length;i++){
//            System.out.print(scores[i]+" ");
//        }
//        int[] arr = new int[10];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=i;
//        }
        int[][] arr = new int[3][5];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = i*j;
            }
        }
        System.out.println(arr);
    }
}
