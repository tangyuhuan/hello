package week6;
import java.util.Arrays;
//使用Java程序进行编码、解码
public class GetBytes {
    public static void main(String[] args) throws Exception {
        //1.编码
        String str = "h是A";
        byte[] byteArr = str.getBytes();//使用平台默认的字符集(UTF-8)将该String编码为一系列字节，将结果存储到字节数组中
        System.out.println(Arrays.toString(byteArr));

        //按照指定字符集编码
        byte[] byteArrGBK = str.getBytes("GBK");
        System.out.println(Arrays.toString(byteArrGBK));

        //2.解码
        String newStr = new String(byteArr);//使用平台默认的字符集(UTF-8)解码
        System.out.println(newStr);

        //按照指定字符集解码
        String newStrGBK = new String(byteArrGBK,"GBK");
        System.out.println(newStrGBK);

    }
}
