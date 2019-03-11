/**
 * Java Start. Home Work 02.
 *
 * @author Oleg Khrulov
 * @version dated 11.03.2019
 */
package HW02;

import java.util.Scanner;

public class MainHW02Task01 {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = null;
        String s3 = null;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++){
            System.out.print("Enter string " + i + ": ");

            switch (i){
                case 1:
                    s1 = scanner.nextLine();
                    break;
                case 2:
                    s2 = scanner.nextLine();
                    break;
                case 3:
                    s3 = scanner.nextLine();
                    break;
            }
        }

        System.out.println(s1 + s2);
        System.out.println(s3 + s2 + s1);
        System.out.println(s1 + s2 + s3);

    }
}



/*
            if (i == 1) {
                s1 = scanner.nextLine();
            } else if (i == 2) {
                s2 = scanner.nextLine();
            } else if (i == 3) {
                s3 = scanner.nextLine();
            }
*/
