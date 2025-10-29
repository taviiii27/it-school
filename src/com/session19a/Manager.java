package com.session19a;

import java.util.ArrayList;
import java.util.List;

public class Manager extends User implements Management {

    private List<Employee> employees;
    private List<Resource> resources;

    public Manager(String name, String email) {
        super(name, email, Roles.MANAGER);
        this.employees = new ArrayList<>();
        this.resources = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee e) {
        employees.add(e);
    }

    @Override
    public void removeEmployee(Employee e) {
        employees.remove(e);
    }


    @Override
    public void changeEmployeeRole(Employee e, Roles newRole) {
        e.role = newRole;
        System.out.println("Changed role of " + e.name + " to " + newRole);
    }

    public void viewTeamStructure(Team team) {
        System.out.println("\nTeam: " + team.getTeamName());
        System.out.println("Leader: " + team.getTeamLead().name);
        System.out.println("Members:");
        for (Employee e : team.getMembers()) {
            System.out.println(" - " + e.name + " (" + e.getPosition() + ")");
        }
    }

    public void viewResources() {
        System.out.println("\nAvailable Resources:");
        for (Resource r : resources) {
            System.out.println(" - " + r.getName() + " (" + r.getQuantity() + ")");
        }
    }

    public void addResource(Resource r) {
        resources.add(r);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Resource> getResourcesList() {
        return resources;
    }
}

