/**
 * Java Start. Home Work 06.
 *
 * @author Oleg Khrulov
 * @version dated 10.04.2019
 */

/*
        Ввести с консоли дату. Сравнить ее с текущей датой в
        системе. Вывести отличающиеся части (год, месяц) на
        экран.
*/

package HW06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainHW06Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date dateEntered = new Date();
        Date systemDate = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        SimpleDateFormat dateFormatYear = new SimpleDateFormat("yyyy");
        SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MM");
        SimpleDateFormat dateFormatDay = new SimpleDateFormat("dd");


        System.out.println("Input date in format - yyyy.MM.dd:");
        String dateText = scanner.nextLine();

        try {
            dateEntered = dateFormat.parse(dateText);

            System.out.println(dateEntered);
            System.out.println(systemDate);

            System.out.printf("%nThe date entered is equal to the current system date - %s%n%n",
                    dateEntered.equals(systemDate));

            if (!dateEntered.equals(systemDate)){
                String dateEnteredYear = dateFormatYear.format(dateEntered);
                String dateEnteredMonth = dateFormatMonth.format(dateEntered);
                String dateEnteredDay = dateFormatDay.format(dateEntered);

                String systemDateYear = dateFormatYear.format(systemDate);
                String systemDateMonth = dateFormatMonth.format(systemDate);
                String systemDateDay = dateFormatDay.format(systemDate);


                if (!dateEnteredYear.equals(systemDateYear)){
                    System.out.println("The year of the entered date and the system date are NOT equal!");
                    System.out.printf("Date entered year: %s%n", dateFormatYear.format(dateEntered));
                    System.out.printf("System date year: %s%n%n", dateFormatYear.format(systemDate));
                }else {
                    System.out.printf("The year of the entered date and the system date are equal!%n%n");
                }

                if (!dateEnteredMonth.equals(systemDateMonth)){
                    System.out.println("The month of the entered date and the system date are NOT equal!");
                    System.out.printf("Date entered month: %s%n", dateFormatMonth.format(dateEntered));
                    System.out.printf("System date month: %s%n%n", dateFormatMonth.format(systemDate));
                }else {
                    System.out.printf("The month of the entered date and the system date are equal!%n%n");
                }

                if (!dateEnteredDay.equals(systemDateDay)){
                    System.out.println("The day of month of the entered date and the system date are NOT equal!");
                    System.out.printf("Date entered day of month: %s%n", dateFormatDay.format(dateEntered));
                    System.out.printf("System date day of month: %s%n%n", dateFormatDay.format(systemDate));
                }else {
                    System.out.printf("The day of month of the entered date and the system date are equal!%n%n");
                }
            }
        } catch (ParseException e) {
            System.out.printf("!!ERROR!!%nDate entry error:%n%s%n%n", e);
        }

        System.out.println("The End of the program!");
        scanner.close();
    }
}