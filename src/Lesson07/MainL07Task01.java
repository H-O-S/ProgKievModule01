/**
 * Java Start. Lesson 07.
 *
 * @author Oleg Khrulov
 * @version dated 19.03.2019
 */
package Lesson07;

public class MainL07Task01 {
    public static void main(String[] args) {

        int byte1 = 0b00101010;
        int byte2 = 0b11101110;
        int byte3 = 0b10100010;
        int byte4 = 0b10001010;

        int check = 0b00101010111011101010001010001010;
        int res = (byte1 << 24) | (byte2 << 16) | (byte3 << 8) | byte4;

        System.out.println(check);
        System.out.println(res);

    }
}
