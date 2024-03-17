package week2;

public class SwitchTest {
    public static void main(String[] args){
        int type=3;
        switch(type){
            case 1:
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");//如果没有break就会执行到下面case里去，直到遇到一个break或switch结束为止
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("default");
                break;

        }
    }
}
