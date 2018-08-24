package model.resourcesClasses;

import controller.*;
import view.*;

public class Resources {

    private int resourceType;
    private String identification;
    private boolean status;

    public Resources(int resourceType, String identification){
        Input newInput = new Input();

        this.identification = identification;
        setResourceType(resourceType);
        ResourcesDefaultMessages display = new ResourcesDefaultMessages();
        display.selectResourcesStatus();
        if (newInput.numberedInput(2) == 1){
            this.status = true;
            return;
        }
        this.status = false;
    }


    public void setResourceType(int resourceType){
        this.resourceType = resourceType;
    }

    public int getResourceType() {
        return resourceType;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void changeStatus(){
        this.status = !(this.status);
    }

    public String toString(){
        ToStringFunctions aux = new ToStringFunctions();
        ResourcesDefaultMessages display = new ResourcesDefaultMessages();

        return display.resourceTypeMessage() + aux.toStringResourceType(this.resourceType) + "\n"
                + display.resourceIdentificationMessage() + this.identification + "\n"
                + display.resourceDisponibilityMessage() + aux.toStringResourceStatus(this.status)+ "\n";
    }
}

