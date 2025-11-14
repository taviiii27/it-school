package com.session22_23;

import java.util.EnumMap;
import java.util.Map;

public class DayScheduling {
    private final Map<Day, String> schedule = new EnumMap<>(Day.class);

    public void assign(Day day, String activity) {
        schedule.put(day, activity);
    }

    public String getActivity(Day day) {
        return schedule.getOrDefault(day, "Nothing planned");
    }
}

