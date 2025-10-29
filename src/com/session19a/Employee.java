package com.session19a;

public class Employee extends User {
    private String position;
    private Team team;

    public Employee(String name, String email, Roles role, String position) {
        super(name, email, role);
        this.position = position;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
