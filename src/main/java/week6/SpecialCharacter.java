package week6;

//逃逸字符：由反斜杠\开头，后面跟上另一个字符，这两个字符合起来组成了一个字符
// \b回退一格  \t到下一个表格位（表格位是指每行中的固定位置，一个/t使得输出从下一个制表位开始，用\t才能使得上下两行对齐）
// \n换行 源自打字机的动作
// \r回车 源自打字机的动作

//回退一个格子的位置
public class SpecialCharacter {
    public static void main(String[] args) {
        System.out.println("abc\bd"); //abd
        System.out.println("abc\b"); //abd
        System.out.println("x\b");
        System.out.println("x\t123");
        System.out.println("xyz\t123");
    }
}
