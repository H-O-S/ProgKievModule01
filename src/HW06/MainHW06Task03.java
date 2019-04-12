/**
 * Java Start. Home Work 06.
 *
 * @author Oleg Khrulov
 * @version dated 12.04.2019
 */

/*
        Написать свой вариант ф-и Arrays.toString() для int[].
*/

package HW06;

public class MainHW06Task03 {
    @SuppressWarnings("Duplicates")
    static String toString(int[] array){
        StringBuilder stringBuilder = new StringBuilder("int[] array [");

        for (int i = 0; i < array.length; i++){
            if (i < array.length - 1){
                stringBuilder.append(array[i]).append(", ");
            }
            else {
                stringBuilder.append(array[i]);
            }
        }

        return stringBuilder.append("] ").toString();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(toString(array));
    }
}
