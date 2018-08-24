package model.personClasses;

import controller.*;
import view.*;

public class FootballPlayer extends Employee {
    private int playerFunction;
    private int playerStatus;

    public FootballPlayer(int employeeFunction) {
        super(employeeFunction);
        Input newInput = new Input();
        MembersDefaultMessages display = new MembersDefaultMessages();
        GeneralDefaultMessages.showMessage(display.playerFunctionMessage());
        this.playerFunction = newInput.numberedInput(7);
        GeneralDefaultMessages.showMessage(display.playerStatusMessage());
        this.playerStatus = newInput.numberedInput(3);
    }

    public int getPlayerFunction() {
        return this.playerFunction;
    }


    public int getPlayerStatus(){
        return this.playerStatus;
    }

    public void setPlayerFunction(int playerFunction) {
        this.playerFunction = playerFunction;
    }

    public void setPlayerStatus(int playerStatus) {

        this.playerStatus = playerStatus;
    }

    public String toString(){
        MembersDefaultMessages newOutput = new MembersDefaultMessages();
        ToStringFunctions stringFunction = new ToStringFunctions();

        return newOutput.fullNameMessage() + super.getFullName()
                + newOutput.cpfMessage() + super.getCpf()
                + newOutput.emailMessage() + super.getEmail()
                + newOutput.phoneMessage() + super.getPhone()
                + newOutput.functionMessage() + stringFunction.
                toStringEmployeeFunction(super.employeeFunction)
                + newOutput.salaryMessage() + super.salary
                + "\nPosição do jogador: " + stringFunction.toStringPlayerFunction(this.playerFunction)+ "\n"
                + "Status do jogador: " + stringFunction.toStringPlayerStatus(this.playerStatus);

    }
}