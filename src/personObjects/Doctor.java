package personObjects;

import inputPackage.Input;

public class Doctor extends Employee {
    private String crm;

    public Doctor(){
        System.out.printf("\nCRM(somente números): ");
        this.crm = Input.longInput();
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm() {
        this.crm = Input.longInput();
    }

    public void print(){
        System.out.println("Nome do funcionário: " + super.getFullName());
        System.out.println("Cpf do funcionário: "+ super.getCpf());
        System.out.println("E-mail do funcionário: "+ super.getEmail());
        System.out.println("Telefone do funcionário: "+ super.getPhone());
        System.out.println("Salário do funcionário: "+ super.getSalary() +" reais");
        System.out.println("CRM do funcionário: "+this.crm);

    }
}
