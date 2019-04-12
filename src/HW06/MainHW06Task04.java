/**
 * Java Start. Home Work 06.
 *
 * @author Oleg Khrulov
 * @version dated 12.04.2019
 */

/*
        Написать код, который позволит менять и читать значения
        произвольных битов в массиве int-ов.
*/

package HW06;

public class MainHW06Task04 {
    static int setBit(int x, int pos){
        return x | (1 << pos);
    }

    static boolean isBitSet(int x, int pos){
        return (x & (1 << pos)) != 0;
    }

    static void setBit(int[] a, int pos){
        int intN = a.length - (pos / 32) - 1;
        int bitN = pos % 32;
        a[intN] = setBit(a[intN], bitN);
    }

    static boolean isBitSet(int[] a, int pos){
        int intN = a.length - (pos / 32) - 1;
        int bitN = pos % 32;
        return isBitSet(a[intN], bitN);
    }

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
        int[] array = {0, 0};

        setBit(array, 0);
        setBit(array, 1);
        setBit(array, 32);
        setBit(array, 63);

        System.out.println(isBitSet(array, 0));
        System.out.println(isBitSet(array, 1));
        System.out.println(isBitSet(array, 32));
        System.out.println(isBitSet(array, 63));
        System.out.println(isBitSet(array, 55));

        System.out.println(toString(array));
    }
}