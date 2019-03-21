/**
 * Java Start. Lesson 07.
 *
 * @author Oleg Khrulov
 * @version dated 19.03.2019
 */
package Lesson07;

public class MainL07Task02 {
    public static void main(String[] args) {

        final byte CREATE = 0b00001000;
        final byte READ =   0b00000100;
        final byte UPDATE = 0b00000010;
        final byte DELETE = 0b00000001;

        byte rights = 0b00010110;

        System.out.println("Has CREATE: " + ((CREATE & rights) > 0));
        System.out.println("Has READ: " + ((READ & rights) > 0));
        System.out.println("Has UPDATE: " + ((UPDATE & rights) > 0));
        System.out.println("Has DELETE: " + ((DELETE & rights) > 0));

    }
}
