package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Employee ===");
        IEmployee employee = new Employee();
        employee.doTask();

        System.out.println("=== Team Leader ===");
        IEmployee leader = new Leader(employee);
        leader.doTask();

        System.out.println("=== Project Manager ===");
        IEmployee manager = new ProjectManager(leader);
        manager.doTask();
    }
}