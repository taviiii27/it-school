package com.session19a;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Alexandra", "alexandra@company.com");

        Employee engineer1 = new Employee("Bogdan", "bogdan@company.com", Roles.ENGINEER, "Civil Engineer");
        Employee engineer2 = new Employee("Andrei", "andrei@company.com", Roles.ENGINEER, "Structural Engineer");

        Team teamA = new Team("Foundation Team", engineer1);
        teamA.addMember(engineer2);

        Resource cement = new Resource("Cement", 1000, ResourceTypes.MATERIAL);
        manager.addResource(cement);

        Project project = new Project("SkyTower", "Downtown");
        project.addTeam(teamA);
        project.addResource(cement);

        manager.viewTeamStructure(teamA);
        manager.viewResources();

        Email.sendAnnouncement(teamA.getMembers(), "Project Update", "Phase 1 completed successfully!");
    }
}
