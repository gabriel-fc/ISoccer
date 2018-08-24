package model.resourcesClasses;

import controller.*;
import view.GeneralDefaultMessages;
import view.ResourcesDefaultMessages;

public class Stadium extends Resources {
    private int numOfSeats;
    private int numOfBathrooms;
    private int numOfSnackBars;


    public Stadium(int resourceType, String identification){
        super(resourceType, identification);

        ResourcesDefaultMessages display = new ResourcesDefaultMessages();
        Input newInput = new Input();

        GeneralDefaultMessages.showMessage(display.numOfSeatsMessage());
        this.numOfSeats = newInput.integerInput();

        GeneralDefaultMessages.showMessage(display.numOfBathroomsMessage());
        this.numOfBathrooms = newInput.integerInput();

        GeneralDefaultMessages.showMessage(display.numOfSnackBarsMessage());
        this.numOfSnackBars = newInput.integerInput();
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public int getNumOfBathrooms() {
        return numOfBathrooms;
    }

    public int getNumOfSnackbars() {
        return numOfSnackBars;
    }

    public void setNumOFSeats(int numOfFans) {
        this.numOfSeats = numOfFans;
    }

    public void setNumOfBathrooms(int numOfBathrooms) {
        this.numOfBathrooms = numOfBathrooms;
    }

    public void setNumOfSnackbars(int numOfSnackBars) {
        this.numOfSnackBars =  numOfSnackBars;
    }

    public String toString(){
        ToStringFunctions aux = new ToStringFunctions();
        ResourcesDefaultMessages display = new ResourcesDefaultMessages();

        return  display.resourceTypeMessage() + aux.toStringResourceType(getResourceType()) + "\n"
                + display.resourceIdentificationMessage() + super.getIdentification()+ "\n"
                + display.resourceDisponibilityMessage() + aux.toStringResourceStatus(super.getStatus()) + "\n"
                + display.numOfSeatsMessage() + this.numOfSeats + "\n"
                + display.numOfBathroomsMessage() + this.numOfBathrooms + "\n"
                + display.numOfSnackBarsMessage() + this.numOfSnackBars+ "\n";


    }

}
