/**
 * Java Start. Lesson04.
 *
 * @author Oleg Khrulov
 * @version dated 07.03.2019
 */
package Lesson04;

public class Main {
    public static void main(String[] args) {

        int[] x = new int[28];

        for (int i = 0; i < x.length; i++) {
            x[i] = i * 635;

            Integer result = (i == 0 || i == 14 || i == 27) ? x[i] : null; // это не правильная запись
            if (result != null){
                System.out.println(result);

/*
Это правильная запись
            switch (i){
                case 0:
                case 14:
                case 27:
                    System.out.println(x[i]);
*/
            }
        }
    }
}
