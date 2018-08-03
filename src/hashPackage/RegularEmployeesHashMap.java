package hashPackage;

import inputPackage.Input;
import personObjects.Employee;

import java.util.HashMap;

public class RegularEmployeesHashMap {
    protected HashMap <Integer, HashMap<String, Employee>> employeesHt = new HashMap<>();
    private int numOfEmployees;

    public HashMap<String, Employee> makehash(){
        HashMap<String, Employee> newHash = new HashMap<>();
        return newHash;
    }

    public RegularEmployeesHashMap(){
        numOfEmployees = 0;
        employeesHt.put(1, makehash());
        employeesHt.put(2, makehash());
        employeesHt.put(3, makehash());
        employeesHt.put(4, makehash());
        employeesHt.put(5, makehash());
        employeesHt.put(6, makehash());
        employeesHt.put(7, makehash());
    }

    public Employee getEmployee(String cpf){
        for (int key: this.employeesHt.keySet()) {
            if (this.employeesHt.get(key).containsKey(cpf)){
                return this.employeesHt.get(key).get(cpf);
            }
        }
        return null;
    }

    //this hash adds employees based on its functions
    public boolean addEmployee(Employee newEmployee){
        if (this.getEmployee(newEmployee.getCpf()) != null){
            System.out.println("Este funcionário já está cadastrado");
            return false;
        }
        employeesHt.get(newEmployee.getEmployeeFunction()).put(newEmployee.getCpf(), newEmployee);
        numOfEmployees++;
        return true;
    }

    public Employee getPresidentorCoach(int function){
        if (hashIsEmpty(function)){
            return null;
        }
        for (String key : this.employeesHt.get(function).keySet()) {
            return this.employeesHt.get(function).get(key);
        }
        return null;
    }

    public boolean hashIsEmpty(int function){
        return employeesHt.get(function).isEmpty();
    }

    public void clearHash(int function){
        this.employeesHt.get(function).clear();
    }

    public void printAll(){
        for (int key: this.employeesHt.keySet()) {
            if (key != 3) {
                System.out.println("~~~~~~ " + Input.toStringEmployeeFunction(key) + " ~~~~~~");
                if (this.employeesHt.get(key).isEmpty()) {
                    System.out.println("Nenhum funcionário cadastrado nessa função\n");
                } else {
                    HashMap<String, Employee> aux = this.employeesHt.get(key);
                    for (String key2 : aux.keySet()) {
                        aux.get(key2).print();
                        System.out.printf("\n");
                    }
                }
            }
        }
    }

}
