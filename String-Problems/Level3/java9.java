import java.util.Scanner;

class java9 {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month - 1];
    }

    public static int firstDayOfMonth(int day, int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (day + x + (31 * m0) / 12) % 7;
    }

    public static void displayCalendar(int month, int year) {
        String[] months = {"January","February","March","April","May","June",
                           "July","August","September","October","November","December"};

        System.out.println("   " + months[month - 1] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int days = getDaysInMonth(month, year);
        int startDay = firstDayOfMonth(1, month, year);

        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%2d ", day);
            if (((day + startDay) % 7 == 0) || (day == days)) System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);

        sc.close();
    }
}
