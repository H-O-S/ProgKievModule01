/**
 * Java Start. Home Work 05.
 *
 * @author Oleg Khrulov
 * @version dated 10.04.2019
 */

/*
        Написать ф-ю, которая принимает на вход массив чисел и
        возвращает его длину в байтах как результат.
*/

package HW05;

import java.util.Arrays;

public class MainHW05Task02 {
    private static byte[] arrayByte = new byte[10];
    private static int[] arrayInt = new int[10];

    private static int sizeOfByte(byte[] array) {
        return array.length;
    }
    private static int sizeOfByte(int[] array) {
        return array.length * 4;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            arrayByte[i] = (byte) (Math.random() * 100);
            arrayInt[i] = (int) (Math.random() * 100);
        }

        System.out.println(sizeOfByte(arrayByte) + ", " + sizeOfByte(arrayInt));
        System.out.println(Arrays.toString(arrayByte));
        System.out.println(Arrays.toString(arrayInt));
    }
}
