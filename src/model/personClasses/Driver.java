package model.personClasses;

import controller.*;
import view.*;


public class Driver extends Employee {
    private String driverLicense;

   public Driver(int employeeFunction){
       super(employeeFunction);
       Input newInput = new Input();
       MembersDefaultMessages display = new MembersDefaultMessages();

       GeneralDefaultMessages.showMessage(display.driverLicenseMessage());
        this.driverLicense = newInput.longInput();
    }

    public String getDriverLicense() {
        return this.driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String toString(){
        MembersDefaultMessages newOutput = new MembersDefaultMessages();
        ToStringFunctions stringFunction = new ToStringFunctions();

        return newOutput.fullNameMessage() + super.getFullName() + "\n"
                + newOutput.cpfMessage() + super.getCpf() + "\n"
                + newOutput.emailMessage() + super.getEmail() + "\n"
                + newOutput.phoneMessage() + super.getPhone() + "\n"
                + newOutput.functionMessage() + stringFunction.
                toStringEmployeeFunction(super.employeeFunction) + "\n"
                + newOutput.salaryMessage() + super.salary + "\n"
                + newOutput.driverLicenseMessage() + this.driverLicense + "\n";


    }
}
