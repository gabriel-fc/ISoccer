package mainPackage;

import hashPackage.PlayersHashMap;
import hashPackage.RegularEmployeesHashMap;
import hashPackage.ResourcesHashMap;
import hashPackage.SupportersHashMap;
import inputPackage.Input;
import personObjects.*;
import resourcesObjects.Resources;
import resourcesObjects.Stadium;
import resourcesObjects.TrainingCenter;

public class Menu {

    public static void firstOption(PlayersHashMap playersHt, RegularEmployeesHashMap employeesHt){
        System.out.printf("\nDefina a função do empregado.\n1. Presidente\n2. Médico\n3. Técnico\n4. Preparador Físico\n5. Motorista\n6. Cozinheiro\n7. Advogado\n8. Jogador\n ou 9 para cancelar\n");
        int function = Input.numberedInput(9);
        if(function == 9){
            System.out.println("Operação cancelada!\n\n");
            return;
        }
        else if (function == 2){
            Doctor newDoctor = new Doctor();
            newDoctor.setEmployeeFunction(function);
            if (!employeesHt.addEmployee((Doctor)newDoctor)){
                return;
            }
        }
        else if (function == 5){
            Driver newDriver = new Driver();
            newDriver.setEmployeeFunction(function);
            if (!employeesHt.addEmployee((Driver)newDriver)){
                return;
            }
        }
        else if (function == 8){
            FootballPlayer newPlayer = new FootballPlayer();
            newPlayer.setEmployeeFunction(function);
            if(!playersHt.addPlayer(newPlayer)){
                return;
            }
        }
        else{
            if(function == 1 || function == 3){
                if (!employeesHt.hashIsEmpty(function)){
                    System.out.printf("Informações do antigo ");
                    if (function == 1){
                        System.out.printf("presidente");
                    }else{
                        System.out.printf("técnico");
                    }
                    System.out.printf(" serão sobrescritas. Deseja continuar?\n1. Sim\n2. Não\n");
                    if(Input.numberedInput(2) == 2) {
                        System.out.println("Operação cancelada!");
                        return;
                    }
                    employeesHt.clearHash(function);
                }
            }
            Employee newEmployee = new Employee();
            newEmployee.setEmployeeFunction(function);
            if (!employeesHt.addEmployee(newEmployee)){
                return;
        }
        System.out.println("Funcionário adicionado com sucesso!\n\n");
        }
    }

    public static void secondOption(SupportersHashMap supportersHt) {
        System.out.format("Escolha a função desejada:\n1. Adicionar Sócio-Torcedor\n2. Alterar Estado de Pagamento de Um Sócio Cadastrado\n3. Alterar Valores dos Planos\n Ou Digite 4 Para Sair\n");
        int function = Input.numberedInput(4);
        if (function == 4) {
            System.out.println("Operação cancelada!");
            return;
        }

        if (function == 1) {
            Supporter newSupporter = new Supporter();
            if (!supportersHt.addSupporter(newSupporter)) {
                return;
            }
            System.out.println("Sócio- torcedor cadastrado com sucesso!");
        } else if (function == 2) {
            System.out.printf("Informe o cpf do sócio desejado: ");
            String cpf = Input.longInput();
            if (supportersHt.getSupporter(cpf) == null) {
                System.out.println("Sócio não cadastrado");
                return;
            }
            Supporter currentSupporter = supportersHt.getSupporter(cpf);
            System.out.println("O sócio está " + currentSupporter.toStringSupporterCompliance() + " atualmente. Deseja alterar o estado?\n1. Sim\n2. Não");
            function = Input.numberedInput(2);
            if (function == 2) {
                System.out.println("Operação cancelada!");
                return;
            }
            supportersHt.changeSupporterCompliace(currentSupporter);
            System.out.println("Operação realizada com sucesso!");
        } else if (function == 3) {
            supportersHt.printCurrentCategoryValues();
            supportersHt.setCategoryValue();
        }
    }

    public static void thirdOption(ResourcesHashMap resourcesHt){
        int function = -1;
        while(true){
            System.out.printf("Gerenciar:\n1. Ônibus\n2. Estádio\n3. Centro de Treinamento\nOu digite 4 para sair\n");
            function = Input.numberedInput(4);
            if (function == 4){
                System.out.println("Operação finalizada!");
                return;
            }
            String identification;
            System.out.printf("Informe.\nIdentificação do recurso: ");
            identification = Input.simpleString();
            if (resourcesHt.getResource(identification) != null) {
                System.out.printf("\n");
                resourcesHt.getResource(identification).print();
                System.out.printf("\n");
            } else {
                System.out.printf("Recurso não encontrado. Deseja adiciona-lo?\n1. Sim\n2. Não\n");
                if (Input.numberedInput(2) == 1) {
                    if(function == 1) {
                        Resources newResource = new Resources();
                        newResource.setIdentification(identification);
                        resourcesHt.addResource(newResource, "Ônibus");
                    }else if (function == 2){
                        Stadium newStadium = new Stadium();
                        newStadium.setIdentification(identification);
                        resourcesHt.addResource((Stadium)newStadium, "Estádio");
                    }else{
                        TrainingCenter newcT = new TrainingCenter();
                        newcT.setIdentification(identification);
                        resourcesHt.addResource((TrainingCenter)newcT, "Centro de Treinamento");
                    }
                    System.out.println("Recurso adicionado com sucesso!");
                }
            }

        }
    }

    public static void fourthOption(PlayersHashMap playersHt, RegularEmployeesHashMap employeesHt, SupportersHashMap supportersHt, ResourcesHashMap resourcesHt) {
        int function;
        System.out.println("1. Funcionários\n2. Recursos Físicos\n3. Sócio-Torcedor\n Ou digite 4 para sair\n");
        function = Input.numberedInput(4);
        if (function == 4){
            System.out.println("Operação finalizada!\n\n");
            return;
        }

        if (function == 1){
            System.out.println("\n1. Time\n2. Serviços gerais\n");
            if (Input.numberedInput(2) == 1){
                System.out.println("1. Informações do time\n2. Buscar jogador");
                if (Input.numberedInput(2) == 1){
                    System.out.println("~~~~~~ Técnico ~~~~~~\n"  );
                     if (employeesHt.getPresidentorCoach(3) == null){
                         System.out.println("Técnico não cadastrado!\n");
                     }else{
                         employeesHt.getPresidentorCoach(3).print();
                     }
                     System.out.println("~~~~~~ Time~~~~~~\n"  );
                     playersHt.printAll();
                }else{
                    System.out.println("Informe o cpf do jogador: \n");
                    String cpf = Input.longInput();
                    if (playersHt.getPlayer(cpf) == null){
                        System.out.println("Jogador não cadastrado!\n");
                    }else{
                        System.out.println("Status do jogador "+playersHt.getPlayer(cpf).getFullName()+": "+ playersHt.getPlayer(cpf).toStringPlayerStatus()+"\n");
                    }
                }
            }else{
                System.out.println("Funcionários Administrativos\n");
                employeesHt.printAll();
                System.out.println();
            }

        }else if (function == 2){
            System.out.println("Recursos\n");
            resourcesHt.printAll();
        }else if (function == 3){
            while (function != 5) {
                System.out.println("\n1. Quantidade de Sócios\n2. Sócios Adimplentes\n3. Sócios Inadimplentes\n4. Lista com dados individuais  Ou digite 5 para sair\n");
                function = Input.numberedInput(5);
                if (function == 5){
                    System.out.println("Operação finalizada!\n");
                }
                if (function == 1){
                    System.out.println("Número de sócios: "+ supportersHt.getNumOfSupporters()+"\n");

                }else if (function == 2){
                    System.out.println("Sócios Adimplentes:\n");
                    supportersHt.printTrueCompliance();
                    System.out.println();

                }else if (function == 3){
                    System.out.println("Sócios Inadimplentes:\n");
                    supportersHt.printFalseCompliance();
                    System.out.println();

                }else if (function == 4){
                    supportersHt.printAll();
                    System.out.println();
                }
            }
        }




    }
}
