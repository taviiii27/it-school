package com.pack.session13_14_homework_17_09_2025;

import java.util.*;

abstract class Workout {
    protected String date;
    protected int duration; // in minutes

    public Workout(String date, int duration) {
        this.date = date;
        this.duration = duration;
    }

    public abstract String getDetails();
}

class Running extends Workout {
    private double distance;

    public Running(String date, int duration, double distance) {
        super(date, duration);
        this.distance = distance;
    }

    @Override
    public String getDetails() {
        return "Running on " + date + " | Duration: " + duration + " min | Distance: " + distance + " km";
    }
}

class Weightlifting extends Workout {
    private double weight;

    public Weightlifting(String date, int duration, double weight) {
        super(date, duration);
        this.weight = weight;
    }

    @Override
    public String getDetails() {
        return "Weightlifting on " + date + " | Duration: " + duration + " min | Weight lifted: " + weight + " kg";
    }
}

class Yoga extends Workout {
    public Yoga(String date, int duration) {
        super(date, duration);
    }

    @Override
    public String getDetails() {
        return "Yoga on " + date + " | Duration: " + duration + " min";
    }
}

class FitnessGoal {
    private String type;
    private double target;

    public FitnessGoal(String type, double target) {
        this.type = type;
        this.target = target;
    }

    public String getType() { return type; }
    public double getTarget() { return target; }
}

class User {
    private String name;
    private List<Workout> workouts = new ArrayList<>();
    private List<FitnessGoal> goals = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void logWorkout(Workout w) {
        workouts.add(w);
    }

    public void setGoal(FitnessGoal g) {
        goals.add(g);
    }

    public void weeklySummary() {
        System.out.println("Weekly Summary for " + name);
        for (Workout w : workouts) {
            System.out.println(w.getDetails());
        }
    }

    public void searchWorkouts(String type) {
        for (Workout w : workouts) {
            if (w.getClass().getSimpleName().equalsIgnoreCase(type)) {
                System.out.println(w.getDetails());
            }
        }
    }
}


public class FitnessTrackingSystem {
    public static void main(String[] args) {
        User user = new User("Diana");

        user.setGoal(new FitnessGoal("Running", 10));

        user.logWorkout(new Running("2025-09-01", 30, 5));
        user.logWorkout(new Yoga("2025-09-02", 40));
        user.logWorkout(new Weightlifting("2025-09-03", 60, 200));

        user.weeklySummary();

        System.out.println("\nSearching for Running Workouts:");
        user.searchWorkouts("Running");
    }
}
