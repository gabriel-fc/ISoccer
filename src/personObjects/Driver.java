package personObjects;

import inputPackage.Input;


public class Driver extends Employee {
    private String driverLicense;

   public Driver(){
        System.out.printf("Número da habilitação(somente números): ");
        this.driverLicense = Input.longInput();
        System.out.printf("\n");

    }

    public String getDriverLicense() {
        return this.driverLicense;
    }

    public void setDriverLicense() {
        this.driverLicense = Input.longInput();
    }

    public void print(){
        System.out.println("Nome do funcionário: " + super.getFullName());
        System.out.println("Cpf do funcionário: "+ super.getCpf());
        System.out.println("E-mail do funcionário: "+ super.getEmail());
        System.out.println("Telefone do funcionário: "+ super.getPhone());
        System.out.println("Salário do funcionário: "+ super.getSalary() +" reais");
        System.out.println("Licença de motorista do funcionário: "+this.driverLicense+"\n");
    }
}
