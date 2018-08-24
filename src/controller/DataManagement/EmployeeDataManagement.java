package controller.DataManagement;

import model.personClasses.*;
import view.GeneralDefaultMessages;

import java.util.ArrayList;

public class EmployeeDataManagement {
    private ArrayList<Employee> regularEmployeeArrayList = new ArrayList<>();
    private ArrayList<Employee> teamArrayList = new ArrayList<>();

    private Employee president = null;
    private Employee coach = null;


    public void addEmployee(int employeeFunction){

        if (employeeFunction == 2){
            Doctor newEmployee = new Doctor(employeeFunction);

        }else if (employeeFunction == 5){
            Driver newEmployee = new Driver(employeeFunction);
            regularEmployeeArrayList.add(newEmployee);

        }else if (employeeFunction == 8) {
            FootballPlayer newEmployee = new FootballPlayer(employeeFunction);
            teamArrayList.add(newEmployee);
        }else{
            Employee newEmployee = new Employee(employeeFunction);
            if (employeeFunction == 1){
                president = newEmployee;

            }else if (employeeFunction == 3){
                coach = newEmployee;
            }else {
                regularEmployeeArrayList.add(newEmployee);
            }

        }
        GeneralDefaultMessages.succesfullOperation();
    }

    public Employee getEmployee(String cpf){
        GeneralDefaultMessages display = new GeneralDefaultMessages();

        if (president != null && president.getCpf().compareTo(cpf) == 0){
            return president;
        }
        if (coach != null && coach.getCpf().compareTo(cpf) == 0){
            return coach;
        }

        for (int i = 0; i < regularEmployeeArrayList.size(); i++) {
            if ((regularEmployeeArrayList.get(i).getCpf()).compareTo(cpf) == 0){
                return regularEmployeeArrayList.get(i);
            }
        }
        for (int i = 0; i < teamArrayList.size(); i++) {
            if ((teamArrayList.get(i).getCpf()).compareTo(cpf) == 0){
                return teamArrayList.get(i);
            }
        }
        GeneralDefaultMessages.employeeNotfound();
        return null;
    }

    public Employee getCoach(){
        return coach;
    }

    public Employee getPresident() {
        return president;
    }

    public void printEmployee(String cpf){
        Employee aux = getEmployee(cpf);

        if (aux == null){
            return;
        }
        GeneralDefaultMessages.showMessage(aux.toString());
        GeneralDefaultMessages.succesfullOperation();
    }

    public void printPlayersReport(){

        GeneralDefaultMessages.team();
        GeneralDefaultMessages.showMessage("Treinador:\n");
        if (coach != null){
            GeneralDefaultMessages.showMessage(coach.toString());
        }else{
            GeneralDefaultMessages.employeeNotfound();
        }
        GeneralDefaultMessages.showMessage("Jogadores:\n");
        for (int i = 0; i <teamArrayList.size(); i++) {
            GeneralDefaultMessages.showMessage(teamArrayList.get(i).toString());

        }
        GeneralDefaultMessages.succesfullOperation();
    }

    public void printRegularEmployeesReport(){
        GeneralDefaultMessages.regularEmployees();
        GeneralDefaultMessages.showMessage("Presidente:\n");
        if (president != null){
            GeneralDefaultMessages.showMessage(president.toString());
        }else{
            GeneralDefaultMessages.employeeNotfound();
        }
        GeneralDefaultMessages.showMessage("Jogadores:\n");
        for (int i = 0; i <regularEmployeeArrayList.size(); i++) {
            GeneralDefaultMessages.showMessage(regularEmployeeArrayList.get(i).toString());

        }
        GeneralDefaultMessages.succesfullOperation();
    }
    
}
