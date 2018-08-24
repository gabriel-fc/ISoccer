package controller;


import controller.DataManagement.*;
import controller.Menu;

public class Main {

    public static void main(String[] args) {
        EmployeeDataManagement employees = new EmployeeDataManagement();
        SupporterDataManagement supporters = new SupporterDataManagement();
        ResourceDataManagement resources = new ResourceDataManagement();
        Menu menu = new Menu();
        menu.mainMenu(true, employees, supporters, resources);
    }
}
