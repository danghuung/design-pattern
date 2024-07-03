package org.example;

public class ProjectManager extends EmployeeDecorator{

    protected ProjectManager(IEmployee iEmployee) {
        super(iEmployee);
    }

    public void manageProgress() {
        System.out.println("manage progress");
    }

    @Override
    public void doTask() {
        iEmployee.doTask();
        manageProgress();
    }
}
