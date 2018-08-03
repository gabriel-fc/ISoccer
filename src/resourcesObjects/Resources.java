package resourcesObjects;

import inputPackage.Input;

public class Resources {
    private String identification;
    private boolean available;

    public Resources(){
        System.out.println("\nDisponibilidade do recurso:\n1. Disponível\n2. Não Disponível");
        if (Input.numberedInput(2) == 1){
            this.available = true;
            return;
        }
        this.available = false;
    }


    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public boolean getStatus(){
        return this.available;
    }

    public String toStringStatus(){
        if(available){
            return "Disponível";
        }
        return "Indisponível";
    }

    public void changeStatus(){
        this.available = !(this.available);
    }

    public void print(){
        System.out.println("Identificação: "+ this.getIdentification());
        System.out.println("Disponibilidade: "+ this.toStringStatus());
    }
}

