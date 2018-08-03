package resourcesObjects;

import inputPackage.Input;

public class TrainingCenter extends Resources{
    private int numOfBedrooms;
    public TrainingCenter(){
        System.out.printf("Número de dormitórios: ");
        this.numOfBedrooms = Integer.parseInt(Input.longInput());
    }

    public int getNumOfBedrooms() {
        return this.numOfBedrooms;
    }

    public void setNumOfBedrooms() {
        this.numOfBedrooms = Integer.parseInt(Input.longInput());
    }

    public void print(){
        System.out.println("Identificação: "+ super.getIdentification());
        System.out.println("Disponibilidade: "+ super.toStringStatus());
        System.out.println("Número de dormitórios: "+ this.numOfBedrooms);
    }
}

