package OtherProject.hust.soict.dsai.lab01;
import java.util.Scanner;
import java.time.YearMonth;

public class bt6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month, year;
        do {
            System.out.println("Nguyen Viet Anh 20183479 - Enter the month (number): ");
            month = scanner.nextInt();

            System.out.println("Nguyen Viet Anh 20183479 - Enter the year: ");
            year = scanner.nextInt();

            if (month < 1 || month > 12 || year < 1) {
                System.out.println("Nguyen Viet Anh 20183479 - Invalid month/year. Please enter again.\n");
            }
        } while (month < 1 || month > 12 || year < 1);

        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();

        System.out.println("Nguyen Viet Anh 20183479 - Number of days in the given month and year: " + daysInMonth);

        scanner.close();
    }
}
