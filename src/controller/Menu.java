package controller;

import controller.DataManagement.*;
import controller.Input;
import model.personClasses.*;
import securityPackage.Login;
import view.*;

public class Menu {


    private void firstOption(EmployeeDataManagement employees){
        MenuDefaultMessages display = new MenuDefaultMessages();
        Input newInput = new Input();

        display.employeesMenu();
        int function = newInput.numberedInput(9);
        if(function == 9){
            GeneralDefaultMessages.canceledOperation();
            return;
        }
        employees.addEmployee(function);
        }

    private void secondOption(SupporterDataManagement supporters) {
       MenuDefaultMessages display = new MenuDefaultMessages();
       Input newInput = new Input();
       MembersDefaultMessages display2 = new MembersDefaultMessages();

       display.supportersMenu();
        int function = newInput.numberedInput(4);
        if (function == 4) {
            GeneralDefaultMessages.canceledOperation();
            return;
        }
        if (function == 1) {
            supporters.addSupporter();

        } else if (function == 2) {
            GeneralDefaultMessages.showMessage(display2.cpfMessage());
            String cpf = newInput.longInput();
            Supporter aux = supporters.getSupporter(cpf);

            display.complianceMessage(aux.getSupporterCompliance());
            supporters.changeCompliance(cpf);

        } else if (function == 3) {
            supporters.setCategoryValue();
        }
        secondOption(supporters);
    }

    private void thirdOption(ResourceDataManagement resources){
        MenuDefaultMessages display = new MenuDefaultMessages();
        Input newInput = new Input();
        ResourcesDefaultMessages display2 = new ResourcesDefaultMessages();

        display.resourcesManagementMessage();
        int function = newInput.numberedInput(4);
        if (function == 4){
            GeneralDefaultMessages.canceledOperation();
            return;
        }
            String identification;
            GeneralDefaultMessages.showMessage(display2.resourceIdentificationMessage());
            identification = newInput.simpleString();
            if (resources.getResource(identification) != null) {
                resources.printResource(identification);
            }

            else {
                GeneralDefaultMessages.showMessage(display2.resourceIdentificationMessage() + GeneralDefaultMessages.additionQuestion());

                if (newInput.numberedInput(2) == 2) {
                    GeneralDefaultMessages.canceledOperation();
                    return;
                }
                display2.setTypeMessage();
                function = newInput.numberedInput(3);
                resources.addResource(function, identification);
            }
            thirdOption(resources);
        }

    private void fourthOption(EmployeeDataManagement employees, SupporterDataManagement supporters, ResourceDataManagement resources) {
        MenuDefaultMessages display = new MenuDefaultMessages();
        MembersDefaultMessages display2 = new MembersDefaultMessages();
        Input newInput = new Input();

        display.reportsMenu();
        int function = newInput.numberedInput(4);
        if (function == 4){
            GeneralDefaultMessages.canceledOperation();
            return;
        }

        if (function == 1){
            display.employeesReportMenu();

            if (newInput.numberedInput(2) == 1){
                display.teamReportMenu();

                if (newInput.numberedInput(2) == 1){
                   employees.printPlayersReport();
                }else{
                    GeneralDefaultMessages.showMessage(display2.cpfMessage());
                    String cpf = newInput.longInput();
                    employees.printEmployee(cpf);
                }
            }else{
                GeneralDefaultMessages.regularEmployees();
                employees.printRegularEmployeesReport();
            }

        }else if (function == 2){
            GeneralDefaultMessages.resources();
            resources.printReport();

        }else if (function == 3){
            display.supportersReportMenu();

            while (function != 5) {

                function = newInput.numberedInput(5);
                if (function == 5){
                    GeneralDefaultMessages.canceledOperation();
                }
                if (function == 1){
                   display2.supporterQuantity(supporters.numOfSupporters());

                }else if (function == 2){
                  supporters.printDefaulterReport();

                }else if (function == 3){
                    supporters.printDefaultingReport();

                }else if (function == 4){
                   supporters.printReport();
                }
            }
        }
        fourthOption(employees, supporters, resources);

    }

    public void mainMenu(boolean flag, EmployeeDataManagement employees, SupporterDataManagement supporters, ResourceDataManagement resources ){
        MenuDefaultMessages display = new MenuDefaultMessages();
        Input newInput = new Input();

        int option;
        if (flag){
            Login login = new Login();
            flag = !flag;
        }

        display.mainMenuMessage();
        option = newInput.numberedInput(5);

        switch (option) {
            case 1:
                firstOption(employees);break;
            case 2:
                secondOption(supporters);break;
            case 3:
                thirdOption(resources);break;
            case 4:
                fourthOption(employees, supporters, resources);break;
            case 5:
                GeneralDefaultMessages.endOfProgramMessage(); return;
        }

        mainMenu(flag, employees, supporters, resources);
    }



}
