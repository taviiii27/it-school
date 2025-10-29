package com.session19a;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String projectName;
    private String location;
    private List<Team> teams;
    private List<Resource> resources;
    private double progress; // 0–100%

    public Project(String projectName, String location) {
        this.projectName = projectName;
        this.location = location;
        this.teams = new ArrayList<>();
        this.resources = new ArrayList<>();
        this.progress = 0;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void addResource(Resource resource) {
        resources.add(resource);
    }

    public void updateProgress(double percent) {
        this.progress = percent;
    }

    public double getProgress() {
        return progress;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getLocation() {
        return location;
    }
}
