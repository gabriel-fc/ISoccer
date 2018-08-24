package view;

public class GeneralDefaultMessages {

    public static void showMessage(String message){
        System.out.println(message);
    }

    public static void succesfullOperation(){
        System.out.print("\nOperação realizada com sucesso!\n\n");
    }

    public static void canceledOperation(){
        System.out.print("\nOperação cancelada!\n\n");
    }

    public static void employeeNotfound(){
        System.out.print("\nFuncionário não cadastrado!\n\n");
    }

    public static void supporterNotfound(){
        System.out.print("\nSócio não cadastrado!\n\n");
    }

    public static void resourceNotfound(){
        System.out.print("\nRecurso não cadastrado!\n\n");
    }

    public static void regularEmployees(){
        System.out.print("\nFuncionários Administrativos:\n");
    }

    public static void team(){
        System.out.print("\nEquipe de futebol:\n");
    }

    public static String additionQuestion(){
        return "Deseja adiciona-lo?\n1." +
                "Sim\n2." +
                "Não\n";
    }

    public static void resources(){
        System.out.print("\nRecursos físicos:\n");
    }

    public static void welcome(){
        System.out.println("~~~~~~~~~~~~~~~~~~Bem-vindo ao Isoccer!~~~~~~~~~~~~~~~~~~");
    }

    public static void endOfProgramMessage(){
        System.out.print("\nAté logo!");
    }
}
