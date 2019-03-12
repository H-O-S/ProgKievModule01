/**
 * Java Start. Lesson 05.
 *
 * @author Oleg Khrulov
 * @version dated 12.03.2019
 */
package Lesson05;

public class MainL05Task01 {
    public static void main(String[] args) {

        int[] x = new int[14];
        for (int i = 0; i < x.length; i++) {

            assert i == 0 : "The i varieble value is: " + i;
            // проверка значения, если не равно, то генерирует ошибку и выводит сообщение

            if ((i * 444) % 17 > 0)
                x[i] = i;
            else
                x[i] = -1;
        }

        System.out.format("Hello!");
    }
}