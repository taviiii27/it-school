package com.session19a;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private Employee teamLead;
    private List<Employee> members;

    public Team(String teamName, Employee teamLead) {
        this.teamName = teamName;
        this.teamLead = teamLead;
        this.members = new ArrayList<>();
        this.members.add(teamLead);
    }

    public void addMember(Employee e) {
        members.add(e);
        e.setTeam(this);
    }

    public void removeMember(Employee e) {
        members.remove(e);
        e.setTeam(null);
    }

    public void setTeamLead(Employee newLead) {
        if (members.contains(newLead)) {
            this.teamLead = newLead;
            newLead.role = Roles.TEAM_LEAD;
        }
    }

    public Employee getTeamLead() {
        return teamLead;
    }

    public List<Employee> getMembers() {
        return members;
    }

    public String getTeamName() {
        return teamName;
    }
}
