package controller.DataManagement;

import controller.Input;
import model.personClasses.Supporter;
import view.*;

import java.util.ArrayList;

public class SupporterDataManagement {
    private ArrayList <Supporter> defaulterArrayList = new ArrayList<>();
    private ArrayList <Supporter> defaultingArrayList = new ArrayList<>();
    private float[] categoryValues = new float[3];

    public SupporterDataManagement(){
        for (int i = 0; i < 3; i++) {
            categoryValues[i] = -1;
        }
    }

    public void setCategoryValue(){
        int key;
        float aux;
        MembersDefaultMessages display = new  MembersDefaultMessages();
        Input newInput = new Input();

        display.setCategoryValueMessage();
        key = newInput.numberedInput(4);

        if(key == 4){
            GeneralDefaultMessages.canceledOperation();
            return;

        }
        display.typeNewCategoryValueMessage();
        aux =newInput.floatInput();
        if(key == 1) {
            categoryValues[0] = aux;
            GeneralDefaultMessages.succesfullOperation();
        }
        else if (key == 2) {
            categoryValues[1] = aux;
            GeneralDefaultMessages.succesfullOperation();
        }else if (key == 3) {
            categoryValues[2] = aux;
            GeneralDefaultMessages.succesfullOperation();
        }
        setCategoryValue();
    }

    public void addSupporter(){
        Supporter newSupporter = new Supporter();

        this.defaulterArrayList.add(newSupporter);
        GeneralDefaultMessages.succesfullOperation();

    }

    public void changeCompliance(String cpf){
        Supporter aux = getSupporter(cpf);
        if (aux == null){
            GeneralDefaultMessages.employeeNotfound();
            GeneralDefaultMessages.canceledOperation();
            return;
        }
        if (aux.getSupporterCompliance()){
            defaultingArrayList.add(aux);
            defaulterArrayList.remove(aux);
        }else{
            defaulterArrayList.add(aux);
            defaultingArrayList.remove(aux);
        }
        GeneralDefaultMessages.succesfullOperation();
    }

    public Supporter getSupporter(String cpf){
        Supporter aux;
        for (int i = 0; i < defaulterArrayList.size(); i++) {
            aux = defaulterArrayList.get(i);
            if (aux.getCpf().compareTo(cpf) == 0){
                return aux;
            }
        }
        for (int i = 0; i < defaultingArrayList.size(); i++) {
            aux = defaultingArrayList.get(i);
            if (aux.getCpf().compareTo(cpf) == 0){
                return aux;
            }
        }
        GeneralDefaultMessages.supporterNotfound();
        return null;
    }

    public void printSupporter(String cpf){
        Supporter aux = getSupporter(cpf);

        if (aux == null){
            return;
        }
        GeneralDefaultMessages.showMessage(aux.toString());
        GeneralDefaultMessages.succesfullOperation();
    }

    public void printDefaulterReport(){
        MembersDefaultMessages display = new MembersDefaultMessages();

        display.supporterQuantity(defaulterArrayList.size() + defaultingArrayList.size());
        display.defaulterMessage();
        for (int i = 0; i < defaulterArrayList.size(); i++) {
            GeneralDefaultMessages.showMessage(defaulterArrayList.get(i).toString());
        }

    }

    public void printDefaultingReport(){
        MembersDefaultMessages display = new MembersDefaultMessages();

        display.defaultingMessage();
        for (int i = 0; i < defaultingArrayList.size(); i++) {
            GeneralDefaultMessages.showMessage(defaultingArrayList.get(i).toString());
        }
    }

    public void printReport(){
        printDefaulterReport();
        GeneralDefaultMessages.showMessage("\n");
        printDefaultingReport();
    }

    public int numOfSupporters(){
        return defaulterArrayList.size() + defaultingArrayList.size();
    }

}
