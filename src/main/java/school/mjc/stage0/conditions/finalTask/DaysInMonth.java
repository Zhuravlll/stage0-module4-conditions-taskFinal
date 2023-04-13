package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int leap = year / 100;
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
        } else if ((leap % 2 == 0) && (year % 4 == 0) && (month == 2)) {
            System.out.println("29");
        } else {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31");
                case 2 -> System.out.println("28");
                default -> System.out.println("30");
            }
        }
    }
}
