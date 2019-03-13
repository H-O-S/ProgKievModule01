/**
 * Java Start. Home Work 01.
 *
 * @author Oleg Khrulov
 * @version dated 01.03.2019
 */

/*
        Набрать и запустить приведенный в задании код,
        разобраться с выводимыми на экран параметрами.
*/

package HW01;

public class MainHW01 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println(System.getProperty("os.name")); // replace quotes
        System.out.println(System.getProperty("os.version"));
        System.out.println(r. availableProcessors());
// total amount of memory in the Java virtual machine.
        System.out.println(r. totalMemory());
    }
}
