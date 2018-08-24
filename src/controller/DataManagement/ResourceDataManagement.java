package controller.DataManagement;

import model.resourcesClasses.*;
import view.*;
import controller.ToStringFunctions;


import java.util.ArrayList;

public class ResourceDataManagement  {
    private ArrayList <Resources> busArrayList = new ArrayList<>();
    private ArrayList <Stadium> stadiumArrayList = new ArrayList<>();
    private ArrayList <TrainingCenter> cTArrayList = new ArrayList<>();

    public void addResource(int resourceType, String identification){

            if(resourceType == 1) {
                Resources newResource = new Resources(resourceType, identification);
                busArrayList.add(newResource);
            }else if (resourceType == 2) {
                Stadium newResource = new Stadium(resourceType, identification);
                stadiumArrayList.add(newResource);
            }else {
                TrainingCenter newResource = new TrainingCenter(resourceType, identification);
                cTArrayList.add(newResource);
            }
    }

    public Resources getResource(String identification){
        for (int i = 0; i < busArrayList.size(); i++) {
            if (busArrayList.get(i).getIdentification().compareTo(identification) == 0){
                return busArrayList.get(i);
            }
        }

        for (int i = 0; i < stadiumArrayList.size(); i++) {
            if (stadiumArrayList.get(i).getIdentification().compareTo(identification) == 0){
                return stadiumArrayList.get(i);
            }
        }

        for (int i = 0; i < cTArrayList.size(); i++) {
            if (cTArrayList.get(i).getIdentification().compareTo(identification) == 0){
                return cTArrayList.get(i);
            }
        }

        GeneralDefaultMessages.resourceNotfound();
        return null;
    }

    public void isAvailable(int type) {
        boolean availability = false;
            if (type == 1) {

                for (int i = 0; i < busArrayList.size(); i++) {
                    if (busArrayList.get(i).getStatus()){
                        availability = !availability;
                        break;
                    }
                }
            }else if(type == 2) {
                for (int i = 0; i < stadiumArrayList.size(); i++) {
                    if (stadiumArrayList.get(i).getStatus()){
                        availability = !availability;
                        break;
                    }
                }
            }else {
                for (int i = 0; i < cTArrayList.size(); i++) {
                    if (cTArrayList.get(i).getStatus()){
                        availability = !availability;
                        break;
                    }
                }
            }
        ResourcesDefaultMessages display = new ResourcesDefaultMessages();
        ToStringFunctions aux = new ToStringFunctions();

        GeneralDefaultMessages.showMessage(display.resourceDisponibilityMessage() + aux.toStringResourceStatus(availability));
    }

    public void printResource(String identification){
        Resources aux = getResource(identification);

        if (aux == null){
            return;
        }

        GeneralDefaultMessages.showMessage(aux.toString());
    }

    public void printReport(){
        GeneralDefaultMessages.showMessage("Transporte:\n");
        for (int i = 0; i < busArrayList.size(); i++) {
            GeneralDefaultMessages.showMessage(busArrayList.get(i).toString());
        }
        GeneralDefaultMessages.showMessage("Centro de treinamento:\n");
        for (int i = 0; i < cTArrayList.size(); i++) {
            GeneralDefaultMessages.showMessage(cTArrayList.get(i).toString());
        }
        GeneralDefaultMessages.showMessage("Estádio:\n");
        for (int i = 0; i < stadiumArrayList.size(); i++) {
            GeneralDefaultMessages.showMessage(stadiumArrayList.get(i).toString());
        }
    }
}
