/**
 * Java Start. Home Work 06.
 *
 * @author Oleg Khrulov
 * @version dated 10.04.2019
 */

/*
        Написать свой вариант ф-и Arrays.equals для short[].
*/

package HW06;

public class MainHW06Task02 {

    static boolean equals(short[] a1, short[] a2){
        if (a1.length != a2.length){
            return false;
        }

        for (int i = 0; i < a1.length; i++){
            if (a1[i] != a2[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        short[] a1 = {1, 2, 3, 4, 5};
        short[] a2 = {1, 2, 3, 4, 5};
        short[] a3 = {5, 4, 3, 2, 1};
        short[] a4 = {1, 2, 3};

        System.out.println(equals(a1, a2));
        System.out.println(equals(a2, a3));
        System.out.println(equals(a1, a4));
    }
}