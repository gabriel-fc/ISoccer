package model.personClasses;

import controller.Input;
import view.*;


abstract class Person {
   protected String fullName;
   protected String email;
   protected String cpf;
   protected String phone;

    Person(){
        Input newInput = new Input();
        MembersDefaultMessages newOutput = new MembersDefaultMessages();
        GeneralDefaultMessages.showMessage(newOutput.fullNameMessage());
        this.fullName = newInput.simpleString();
        GeneralDefaultMessages.showMessage(newOutput.cpfMessage());
        this.cpf = newInput.longInput();
        GeneralDefaultMessages.showMessage(newOutput.emailMessage());
        this.email = newInput.emailInput();
        GeneralDefaultMessages.showMessage(newOutput.phoneMessage());
        this.phone = newInput.longInput();
    }


    public String getFullName(){
        return this.fullName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;

    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

}
