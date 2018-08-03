package mainPackage;


import hashPackage.PlayersHashMap;
import hashPackage.RegularEmployeesHashMap;
import hashPackage.ResourcesHashMap;
import hashPackage.SupportersHashMap;
import inputPackage.Input;
import securityPackage.Login;

public class Main {

    public static void main(String[] args) {
        Login login = new Login();
        System.out.println("Bem vindo ao Sistema de Gerenciamento de Clubes\nLogin: ");
        while (!(login.compareUser(Input.simpleString()))){
            System.out.println("Login incorreto. Tente novamente.");
        }
        System.out.println("\nSenha: ");
        while (!login.comparePassword(Input.simpleString())){
            System.out.println("Senha incorreta. Tente novamente.");
        }
        System.out.println();
        int function = -1;
        PlayersHashMap playersHt = new PlayersHashMap();
        RegularEmployeesHashMap employeesHt = new RegularEmployeesHashMap();
        SupportersHashMap supportersHt = new SupportersHashMap();
        ResourcesHashMap resourcesHt = new ResourcesHashMap();

     while (function  != 5) {
         System.out.println("\n1. Funcionários\n2. Sócios-Torcedores\n3. Recursos Físicos\n4. Relatórios\n ou digite 5 para encerrar o programa\n");
         function = Input.numberedInput(5);
         if (function == 5){
             System.out.println("~~~~~~~~~~~~ Até logo! ~~~~~~~~~~~~");
         } else if (function == 1) {
             Menu.firstOption(playersHt, employeesHt);
         }else if (function == 2) {
             Menu.secondOption(supportersHt);
         }else if (function == 3) {
             Menu.thirdOption(resourcesHt);
         }else {
             Menu.fourthOption(playersHt, employeesHt, supportersHt, resourcesHt);
         }
     }
    }
}
