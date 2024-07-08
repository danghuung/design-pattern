package org.example.structural.decorator;

public abstract class EmployeeDecorator implements IEmployee{

    protected IEmployee iEmployee;

    protected EmployeeDecorator(IEmployee iEmployee) {
        this.iEmployee = iEmployee;
    }
}
