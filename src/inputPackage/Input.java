package inputPackage;

import java.util.Scanner;
public class Input {
    public static float  floatInput(){
        Scanner input = new Scanner(System.in);
        float variable = -1;
        boolean correctInput = false;

        while(!correctInput){
            try{
                variable = Float.parseFloat(input.nextLine());
                correctInput = true;
            }catch (NumberFormatException exception){
                System.out.println("Entrada inválida. Por favor tente novamente.");
            }
        }
        return variable;
    }

    // this method is used for string inputs composed only by integer numbers
    public static String longInput(){
        Scanner input = new Scanner(System.in);
        String variable = input.nextLine();
        for (int i = 0; i < variable.length(); i++) {
            if (Character.isDigit(variable.charAt(i))) {
                if (i == variable.length() - 1) {
                    return variable;
                }
            } else {
                System.out.println("Entrada inválida. Por favor tente novamente.");
                variable = input.nextLine();
                i = -1;
            }
        }
        return variable;
    }

    //the input needs to have '@' as substring
    public static String emailInput(){
        Scanner input = new Scanner(System.in);
        String variable = input.nextLine();
        while(!variable.contains("@")){
            System.out.println("Email inválido. Por favor tente novamente.");
            variable = input.nextLine();
        }
        return variable;
    }

    public static String simpleString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();

    }

    //Receives the number of valid inputs and returns a valid input
    public static int numberedInput(int numbOfOptions){
        Scanner input = new Scanner(System.in);
        int variable = -1;
        boolean correctInput = false;
        while (!correctInput){
            try {
                variable = Integer.parseInt(input.nextLine());
                if (variable >=1 && variable<=numbOfOptions){
                    correctInput = true;
                }
                else{
                    System.out.println("Digite um número válido");
                }
            }
            catch (NumberFormatException exception){
                System.out.println("Entrada inválida. Por favor tente novamente.");
            }
        }
        return variable;
    }

    public static int intNum(){
        Scanner input = new Scanner(System.in);
        boolean correctInput = false;
        int variable = -1;
        while (!correctInput){
            variable = Integer.parseInt(input.nextLine());
            try {
                variable = input.nextInt();
                correctInput = true;
            } catch (NumberFormatException exception){
                System.out.println("Entrada inválida. Por favor tente novamente.");
                variable = input.nextInt();

            }
        }
        return variable;
    }

    public static String toStringPlayerFunction(int playerFunction){
        switch (playerFunction){
            case 1:
                return "Goleiro";
            case 2:
                return "Lateral Esquerdo";
            case 3:
                return "Zagueiro";
            case 4:
                return "Lateral Direito";
            case 5:
                return "Volante";
            case 6:
                return "Meia";
            case 7:
                return "Atacante";
            default:
                return null;
        }
    }

    public static String toStringEmployeeFunction(int employeeFunction){
        switch (employeeFunction){
            case 1:
                return "Presidente";
            case 2:
                return "Médico";
            case 3:
                return "Técnico";
            case 4:
                return "Preparador Físico";
            case 5:
                return "Motorista";
            case 6:
                return "Cozinheiro";
            case 7:
                return "Advogado";
            case 8:
                return "Jogador";
            default:
                return null;
        }
    }

    public static String toStringSupporterCategory(int category){
        switch (category){
            case 1:
                return "Júnior";
            case 2:
                return "Sênior";
            case 3:
                return "Elite;";
            default:
                return null;

        }
    }

    public static String toStringSupporterCompliance(boolean compliance){
        if(compliance){
            return "Adimplente";
        }
        return "Inadimplente";
    }

}
