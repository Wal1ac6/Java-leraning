public class HelloWorld {
    // 主方法，程序的入口
    public static void main(String[] args) {
        // 输出字符串"Hello, World!"到控制台
        System.out.println("Hello World!");
        System.out.println("-------------------");
        // 调用printHelloWorld方法，打印3行Hello World
        printHelloWorld();
    }

    //打印3行HelloWorld
    // 定义一个名为printHelloWorld的静态方法，用于打印Hello World!
    public static void printHelloWorld() {
        // 打印Hello World!
        System.out.println("Hello World!");
        // 打印Hello World!
        System.out.println("Hello World!");
        // 打印Hello World!
        System.out.println("Hello World!");
    }
}