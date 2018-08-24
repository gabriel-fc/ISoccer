package model.personClasses;

import controller.*;
import view.*;

public class Employee extends Person {
    protected float salary;
    protected int employeeFunction;

    public Employee(int employeeFunction){
        Input newInput = new Input();

        this.employeeFunction = employeeFunction;
        MembersDefaultMessages display = new MembersDefaultMessages();
        GeneralDefaultMessages.showMessage(display.salaryMessage());
        this.salary = newInput.floatInput();
        }

    public int getEmployeeFunction(){
        return this.employeeFunction;
    }

    public float getSalary(){
        return this.salary;
    }

    public void setEmployeeFunction(int employeeFunction) {
        this.employeeFunction = employeeFunction;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString(){
        MembersDefaultMessages newOutput = new MembersDefaultMessages();
        ToStringFunctions stringFunction = new ToStringFunctions();

        return newOutput.fullNameMessage() + super.fullName
                + newOutput.cpfMessage() + super.cpf + "\n"
                + newOutput.emailMessage() + super.email + "\n"
                + newOutput.phoneMessage() + super.phone + "\n"
                + newOutput.functionMessage() + stringFunction.
                toStringEmployeeFunction(this.employeeFunction) + "\n"
                + newOutput.salaryMessage() + this.salary + "\n";

    }

}


