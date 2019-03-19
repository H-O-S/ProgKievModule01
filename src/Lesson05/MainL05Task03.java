/**
 * Java Start. Lesson 05.
 *
 * @author Oleg Khrulov
 * @version dated 12.03.2019
 */

/*
        Написать функцию, которая принимает в качестве аргументов
        одну строку X, целое число Y и число с плавающей точкой Z и
        возвращает как результат строку в виде
        S = x + y + z.
*/

package Lesson05;

public class MainL05Task03 {
    static void doJob(String x, int y, double z) {
            System.out.println("S = " + x + y + z);
    }

    public static void main(String[] args) {
        doJob("hello", 5, 6.3);
    }
}