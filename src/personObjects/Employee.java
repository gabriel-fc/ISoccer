package personObjects;

import inputPackage.Input;

public class Employee extends Person {
    private float salary;
    private int employeeFunction;

    public Employee(){
        System.out.printf("\nSalário(somente números): ");
        this.salary = Input.floatInput();
        System.out.println();
        }

    public int getEmployeeFunction(){
        return this.employeeFunction;
    }

    public float getSalary(){
        return this.salary;
    }

    /*System.out.printf("\nDefina a função do empregado.\n1. Presidente\n2. Médico\n3. Técnico\n4. Preparador Físico\n5. Motorista\n6. Cozinheiro\n7. Advogado\n8. Jogador");
    employeeFunction = Input.numberedInput(8);*/
    public void setEmployeeFunction(int employeeFunction) {
        this.employeeFunction = employeeFunction;
    }

    public void setSalary() {
        this.salary = Input.floatInput();
    }

    public void print(){
        System.out.println("Nome do funcionário: " + super.getFullName());

        System.out.println("Cpf do funcionário: "+ super.getCpf());
        System.out.println("E-mail do funcionário: "+ super.getEmail());
        System.out.println("Telefone do funcionário: "+ super.getPhone());
        System.out.println("Salário do funcionário: "+ this.salary +" reais\n");

    }
}


