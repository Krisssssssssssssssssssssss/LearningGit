
public class Main {
    public static void main(String[] args) {
        printCalendarForMonth("January", 31, 0);
        printCalendarForMonth("February", 28, 3);
        printCalendarForMonth("March", 31, 4);
        printCalendarForMonth("April", 30, 0);
        printCalendarForMonth("May", 31, 2);
        printCalendarForMonth("June", 30, 5);
        printCalendarForMonth("July", 31, 0);
        printCalendarForMonth("August", 31, 3);
        printCalendarForMonth("September", 30, 6);
        printCalendarForMonth("October", 31, 1);
        printCalendarForMonth("November", 30, 4);
        printCalendarForMonth("December", 31, 6);
    }

    public static void printCalendarForMonth(String monthName, int daysInMonth, int offsetDays) {
        System.out.println(monthName);
        System.out.println("Mo Tu We Th Fr Sa Su");

        for (int i = 0; i < offsetDays; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);

            if ((day + offsetDays) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }
}