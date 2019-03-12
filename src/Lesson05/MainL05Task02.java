/**
 * Java Start. Lesson 05.
 *
 * @author Oleg Khrulov
 * @version dated 12.03.2019
 */
package Lesson05;

public class MainL05Task02 {
    static void doJob(String s) {
        for (int i = 0; i < 10; i++)
            System.out.println(s + ":" + i);
    }
    public static void main(String[] args) {
        doJob("hello1");
        doJob("hello2");
    }
}
