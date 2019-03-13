/**
 * Java Start. Home Work 04.
 *
 * @author Oleg Khrulov
 * @version dated 13.03.2019
 */

/*
        Вывести на экран все числа от 1 до 100, которые
        делятся на 3 без остатка.
*/

package HW04;

public class MainHW04Task02 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++){
            if ((i % 3) == 0){
                System.out.println(i);
            }
        }
    }
}
