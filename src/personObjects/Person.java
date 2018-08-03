package personObjects;

import inputPackage.Input;
import java.util.Scanner;

class Person {
   public Scanner input = new Scanner(System.in);
   private String fullName;
   private String email;
   private String cpf;
   private String phone;

    Person(){
        System.out.printf("Nome completo: ");
        this.fullName = input.nextLine();
        System.out.printf("\nCPF(somente números): ");
        this.cpf = Input.longInput();
        System.out.printf("\nEmail: ");
        this.email = Input.emailInput();
        System.out.printf("\nTelefone(somente números): ");
        this.phone = Input.longInput();
        System.out.printf("\n");
    }


    public String getFullName(){
        return this.fullName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;

    }

    public void setEmail(){
        this.email = Input.emailInput();
    }

    public void setCpf(){
        this.cpf = Input.longInput();
    }

    public void setPhone(){
        this.phone = Input.longInput();
    }

}
