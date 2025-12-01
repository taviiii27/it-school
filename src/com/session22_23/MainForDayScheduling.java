package com.session22_23;

public class MainForDayScheduling {
    public static void main(String[] args) {
        DayScheduling schedule = new DayScheduling();
        schedule.assign(Day.MONDAY, "School");
        schedule.assign(Day.FRIDAY, "Party");

        System.out.println("Monday → " + schedule.getActivity(Day.MONDAY));
        System.out.println("Sunday → " + schedule.getActivity(Day.SUNDAY));
    }
}
