package model.resourcesClasses;

import controller.*;
import view.GeneralDefaultMessages;
import view.ResourcesDefaultMessages;

public class TrainingCenter extends Resources {
    private int numOfBedrooms;
    public TrainingCenter(int resourceType, String identification){
        super(resourceType, identification);
        ResourcesDefaultMessages display = new ResourcesDefaultMessages();
        Input newInput = new Input();

        GeneralDefaultMessages.showMessage(display.numOfBedroomsTC());
        this.numOfBedrooms = newInput.integerInput();
    }

    public int getNumOfBedrooms() {
        return this.numOfBedrooms;
    }

    public void setNumOfBedrooms(int numOfBedrooms) {
        this.numOfBedrooms = numOfBedrooms;
    }

    public String toString(){
        ToStringFunctions aux = new ToStringFunctions();
        ResourcesDefaultMessages display = new ResourcesDefaultMessages();

        return display.resourceTypeMessage() + aux.toStringResourceType(getResourceType()) + "\n"
                + display.resourceIdentificationMessage() + getIdentification()+ "\n"
                + display.resourceDisponibilityMessage() + aux.toStringResourceStatus(getStatus())+ "\n"
                + display.numOfBedroomsTC() + this.numOfBedrooms+ "\n";
    }

}

