package Lesson1.Enum;

public enum DayOfWeek {
    Monday(8, false), Tuesday(8, false), Wednesday(8, false), Thursday(8, false), Friday(8, false), Saturday(0, true), Sunday(0, true);
    private int workHour; //количество рабочих часов -8
    private boolean weekend; //выходной или нет, false не выходной, true выходной

    DayOfWeek(int workHour, boolean weekend) {
        this.workHour = workHour;
        this.weekend = weekend;
    }

    public int getWorkHour() {
        return workHour;
    }

    public boolean getWeekend() {
        return weekend;
    }

}
