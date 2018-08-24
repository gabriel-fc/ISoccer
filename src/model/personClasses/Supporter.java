package model.personClasses;

import controller.*;
import view.*;


public class Supporter extends Person {

    private int category;
    private boolean compliance;
    public Supporter(){
        MembersDefaultMessages display = new MembersDefaultMessages();
        Input newInput = new Input();

        display.selectSupporterCategoryMessage();
        category = newInput.numberedInput(3);
        compliance = true;
    }

    public int getSupporterCategory(){
        return this.category;
    }

    public boolean getSupporterCompliance(){
        return this.compliance;
    }

    public void setSupporterCategory() {
        MembersDefaultMessages display = new MembersDefaultMessages();
        display.selectSupporterCategoryMessage();
        Input newInput = new Input();

        this.category = newInput.numberedInput(3);
    }

    public void setSupporterCompliance(boolean compliance) {
        this.compliance = compliance;
    }

    public String toString(){
        MembersDefaultMessages newOutput = new MembersDefaultMessages();
        ToStringFunctions stringFunction = new ToStringFunctions();

        return newOutput.fullNameMessage() + super.fullName
                + newOutput.cpfMessage() + super.cpf
                + newOutput.emailMessage() + super.email
                + newOutput.phoneMessage() + super.phone
                + newOutput.supporterCategoryMessage() + stringFunction.toStringSupporterCategory(this.category) + "\n"
                + newOutput.supporterComplianceMessage() + stringFunction.toStringSupporterCompliance(this.compliance);

    }

}
