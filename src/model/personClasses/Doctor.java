package model.personClasses;

import controller.*;
import view.*;

public class Doctor extends Employee{
    private String crm;

    public Doctor(int employeeFunction){
        super(employeeFunction);
        Input newInput = new Input();
        MembersDefaultMessages display = new MembersDefaultMessages();
        GeneralDefaultMessages.showMessage(display.crmMessage());
        this.crm = newInput.longInput();
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String toString(){
        MembersDefaultMessages newOutput = new MembersDefaultMessages();
        ToStringFunctions stringFunction = new ToStringFunctions();

        return newOutput.fullNameMessage() + super.getFullName() + "\n"
                + newOutput.cpfMessage() + super.getCpf() + "\n"
                + newOutput.emailMessage() + super.getEmail() + "\n"
                + newOutput.phoneMessage() + super.getPhone() + "\n"
                + newOutput.functionMessage() + stringFunction.
                toStringEmployeeFunction(super.employeeFunction)+ "\n"
                + newOutput.salaryMessage() + super.salary+ "\n"
                + newOutput.crmMessage() + this.crm + "\n";


    }
}
