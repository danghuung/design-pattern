package org.example.structural.decorator;

public class Leader extends EmployeeDecorator{

    protected Leader(IEmployee iEmployee) {
        super(iEmployee);
    }

    public void planning() {
        System.out.println("planning for team");
    }

    @Override
    public void doTask() {
        iEmployee.doTask();
        planning();
    }
}
