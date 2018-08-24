package view;

public class MembersDefaultMessages {

    public String fullNameMessage(){
        return "Nome completo: ";
    }

    public String cpfMessage(){
        return "\nCPF: ";
    }

    public String emailMessage(){
       return "\nEmail: ";
    }

    public String phoneMessage() {
       return "\nTelefone: ";
    }

    public String salaryMessage(){
        return "\nSalário: ";
    }

    public String functionMessage(){
        return "\nCargo: ";
    }

    public String crmMessage(){
        return "\nCRM: ";
    }

    public String driverLicenseMessage(){
        return "\nCarteira de habilitação: ";
    }

    public String playerFunctionMessage(){
        return "\n\nDefina a função do jogador:" +
                "\n1. Goleiro" +
                "\n2. Lateral Esquerdo" +
                "\n3. Zagueiro" +
                "\n4. Lateral Direito" +
                "\n5. Volante" +
                "\n6. Meia" +
                "\n7. Atacante";
    }

    public String playerStatusMessage(){
        return "\nDefina o status do jogador:" +
                "\n1. Apto" +
                "\n2. Não Apto" +
                "\n3. No Departamento médico";
    }

    public void selectSupporterCategoryMessage(){

        System.out.println("Digite o número referente à categoria desejada do novo sócio-torcedor:\n" +
                "1. Júnior\n" +
                "2. Sênior\n" +
                "3. Elite");
    }

    public String supporterComplianceMessage(){
        return "\nStatus de pagamento: ";
    }

    public String supporterCategoryMessage(){
        return "\nCategoria do sócio: ";
    }

    public String currentCategoryValuesMessage(float[] categoryValues){
        return "\n Os valores atuais de acordo com cada categoria são:" +
                "júnior: " + categoryValues[0] + "\n" +
                "Sênior: " + categoryValues[1] + "\n" +
                "Elite: " + categoryValues[2] + "\n";
    }

    public void setCategoryValueMessage(){
        System.out.print("\nSelecione qual categoria deve ter sua taxa alterada:\n1. Júnior\n2. Sênior\n3. Elite\n Ou digite 4 para sair\n");
    }

    public void typeNewCategoryValueMessage(){
        System.out.print("\nDigite o novo valor da categoria: ");
    }

    public void defaulterMessage(){
        System.out.print("\nAdimplentes:\n");
    }

    public void defaultingMessage(){
            System.out.print("\nInadimplentes:\n");
    }

    public void supporterQuantity(int numOfSupporters){
        System.out.printf("\nQuantidade de sócios: %d\n", numOfSupporters);
    }



}

