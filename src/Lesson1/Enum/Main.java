package Lesson1.Enum;

public class Main {

    public static String[] allDay = {DayOfWeek.Monday.name(), DayOfWeek.Tuesday.name(), DayOfWeek.Wednesday.name(), DayOfWeek.Thursday.name(), DayOfWeek.Friday.name(), DayOfWeek.Saturday.name(), DayOfWeek.Sunday.name()};

    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.Tuesday));

    }

    public static int getWorkingHours(DayOfWeek day) {
        int summ = 0;
        int ind = day.ordinal();
        // Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        if (day.getWeekend()) {
            System.out.println("Сегодня выходной");
        } else {
            for (int i = ind; i < allDay.length; i++) {
                DayOfWeek d = DayOfWeek.valueOf(allDay[i]);
                summ += d.getWorkHour();

            }
        }
        return summ;
    }

}
