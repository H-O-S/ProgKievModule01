/**
 * Java Start. Lesson 07.
 *
 * @author Oleg Khrulov
 * @version dated 19.03.2019
 */
package Lesson07;

import java.util.Arrays;

public class MainL07Task04 {
    public static void main(String[] args) {
        byte[] a = {1,2,3,4,5,6,7,8,9,10,11};
        byte[] b = new byte[a.length/2];
        System.arraycopy(a, 5, b, 1, 2);
        System.out.println(Arrays.toString(b)); // На экране?
    }
}