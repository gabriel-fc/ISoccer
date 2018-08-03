package resourcesObjects;

import inputPackage.Input;

public class Stadium extends Resources {
    private int numOfFans;
    private int numOfBathrooms;
    private int numOfSnackbars;

    public Stadium(){
        System.out.printf("Número de torcedores suportados: ");
        this.numOfFans = Integer.parseInt(Input.longInput());
        System.out.printf("\nNúmero de banheiros: ");
        this.numOfBathrooms = Integer.parseInt(Input.longInput());
        System.out.printf("\nNúmero de lanchonetes: ");
        this.numOfSnackbars = Integer.parseInt(Input.longInput());
    }

    public int getNumOfFans() {
        return numOfFans;
    }

    public int getNumOfBathrooms() {
        return numOfBathrooms;
    }

    public int getNumOfSnackbars() {
        return numOfSnackbars;
    }

    public void setNumOfFans() {
        this.numOfFans = Integer.parseInt(Input.longInput());
    }

    public void setNumOfBathrooms() {
        this.numOfBathrooms = Integer.parseInt(Input.longInput());
    }

    public void setNumOfSnackbars() {
        this.numOfSnackbars =  Integer.parseInt(Input.longInput());
    }

    public void print(){
        System.out.println("Identificação: "+ super.getIdentification());
        System.out.println("Disponibilidade: "+ super.toStringStatus());
        System.out.println("Número máximo de torcedores: "+ this.numOfFans);
        System.out.println("Número de banheiros: "+ this.numOfBathrooms);
        System.out.println("Número de lanchonetes: "+ this.numOfBathrooms);
    }

}
