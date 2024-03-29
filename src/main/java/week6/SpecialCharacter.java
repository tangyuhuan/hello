package week6;

//逃逸字符：由反斜杠\开头，后面跟上另一个字符，这两个字符合起来组成了一个字符
//\b回退一格， 它的作用是将光标向左移动一格（并不是删除一格），但是它的行为可能依赖于你的环境（操作系统、终端程序、文本编辑器等）。IntelliJ IDEA 的控制台会尝试模拟退格字符的效果，即删除前一个字符的显示。
//\t到下一个表格位（表格位是指每行中的固定位置，一个/t使得输出从下一个制表位开始，用\t才能使得上下两行对齐）
//\n换行 源自打字机的动作，将光标移动到下一行的开头位置，然后输出后续的字符。在Java中，通常使用\n表示换行操作，而不使用\r。
//\r回车 源自打字机的动作，表示回到行首
//在不同的操作系统和环境中，它的行为可能会有所不同。在类 Unix 系统（如 Linux 或 macOS）中，换行通常只由 \n（换行符）控制，而在 Windows 系统中，换行由一对字符 \r\n（回车加换行符）控制。
//当你在 IntelliJ IDEA 或其他 IDE 的控制台输出中使用 \r 时，它通常会将光标移回当前行的开头，而不是向下移动到新的一行。如果在回车符后面输出了更多的文本，那么这些新文本将会从当前行的开始位置写起，从而覆盖掉原来行开头的文本。
public class SpecialCharacter {
    public static void main(String[] args) {
        System.out.println("abc\bd"); //abd
        System.out.println("abc\b"); //IDEA 中返回ab，终端执行返回abc
        System.out.println("x\b");//IDEA 返回空，终端执行返回x
        System.out.println("x\t123");//x	123
        System.out.println("xyz\t123");//xyz	123
        System.out.println("xyz\n123");//xyz 换行 123
        System.out.println("xyz\r123"); //123
        System.out.print("Hello, World!\r");
        System.out.print("Java");
        String str = "hello\\bworld";
        System.out.println(str);
    }
}
