package view;

import controller.ToStringFunctions;

public class MenuDefaultMessages {
    public void employeesMenu(){
        System.out.print("\nDefina a função do empregado.\n" +
                "1. Presidente\n" +
                "2. Médico\n" +
                "3. Técnico\n" +
                "4. Preparador Físico\n" +
                "5. Motorista\n" +
                "6. Cozinheiro\n" +
                "7. Advogado\n" +
                "8. Jogador\n" +
                " ou 9 para cancelar\n");
    }

    public void supportersMenu(){
        System.out.print("\nEscolha a função desejada:\n" +
                "1. Adicionar Sócio-Torcedor\n" +
                "2. Alterar Estado de Pagamento de Um Sócio Cadastrado\n" +
                "3. Alterar Valores dos Planos\n" +
                "Ou Digite 4 Para Sair\n");
    }

    public void complianceMessage(boolean compliance){
        ToStringFunctions display = new ToStringFunctions();
        System.out.print("\nO sócio está " + display.toStringSupporterCompliance(compliance) +
                " atualmente. Deseja alterar o estado?\n" +
                "1. Sim\n" +
                "2. Não\n");
    }

    public void resourcesManagementMessage(){
        System.out.print("\nGerenciar/Adcionar:\n" +
                "1. Ônibus\n" +
                "2. Estádio\n" +
                "3. Centro de Treinamento\n" +
                "Ou digite 4 para sair\n");
    }

    public void reportsMenu(){
        System.out.print("1. Funcionários\n" +
                "2. Recursos Físicos\n" +
                "3. Sócio-Torcedor\n " +
                "Ou digite 4 para sair\n");
    }

    public void employeesReportMenu(){
        System.out.print("\n1. Time\n" +
                "2. Serviços gerais\n");
    }

    public void teamReportMenu(){
        System.out.print("1. Informações do time\n" +
                "2. Buscar jogador\n");
    }

    public void supportersReportMenu(){
        System.out.print("\n1. Quantidade de Sócios\n" +
                "2. Sócios Adimplentes\n" +
                "3. Sócios Inadimplentes\n" +
                "4. Lista com dados individuais  " +
                "Ou digite 5 para sair\n");
    }

    public void mainMenuMessage(){
        System.out.print("\nDigite o número referente à opção desejada.\n" +
                "1. Adicionar Funcionários\n" +
                "2. Adicionar novos sócios-torcedores\n" +
                "3. Gerenciar recursos físicos\n"+
                "4. Obter relatórios\n"+
                "5. Cancelar\n");
    }
}
