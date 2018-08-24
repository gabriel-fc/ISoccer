package view;

public class ResourcesDefaultMessages {

    public void selectResourcesStatus(){
        GeneralDefaultMessages.showMessage("\nDisponibilidade do recurso:\n" +
                "1. Disponível\n" +
                "2. Não Disponível\n");
    }

    public String numOfSeatsMessage(){
        return "\nNúmero de torcedores suportados: ";
    }

    public String numOfBathroomsMessage(){
        return "\nNúmero de banheiros: ";
    }

    public String numOfSnackBarsMessage(){
        return "\nNúmero de lanchonetes: ";
    }

    public String resourceTypeMessage(){
        return "\nTipo de recurso: ";
    }

    public String resourceIdentificationMessage(){
        return  "\nIdentificação: ";
    }

    public String resourceDisponibilityMessage(){
        return  "\nDisponibilidade: ";
    }

    public String numOfBedroomsTC(){
        return "\nNúmero de dormitórios: ";
    }

    public void setTypeMessage(){
        GeneralDefaultMessages.showMessage("Qual a categoria do novo recurso?\n" +
                "1. Ônibus\n" +
                "2. Estádio\n" +
                "3. Centro de Treinamento\n" );

    }

}
