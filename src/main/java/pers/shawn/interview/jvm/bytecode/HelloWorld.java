package pers.shawn.interview.jvm.bytecode;

/**
 * 字节码如下
 * public class JVM.HelloWorld {
 *   public JVM.HelloWorld();
 *     Code:
 *        0: aload_0
 *        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 *        4: return
 *
 *   public static void main(java.lang.String[]);
 *     Code:
 *        0: getstatic     #2                  // Field java/lang/System.out:Ljava/pers.shawn.interview.io/PrintStream;
 *        3: ldc           #3                  // String Hello World!
 *        5: invokevirtual #4                  // Method java/pers.shawn.interview.io/PrintStream.println:(Ljava/lang/String;)V
 *        8: return
 * }
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

}
