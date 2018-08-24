package controller;

import java.util.Scanner;
public class Input {

    private Scanner input = new Scanner(System.in);

    public float  floatInput(){
        float variable = -1;
        boolean correctInput = false;

        while(!correctInput){
            try{
                variable = Float.parseFloat(this.input.nextLine());
                correctInput = true;
            }catch (NumberFormatException exception){
                System.out.println("Entrada inválida. Por favor tente novamente.");
            }
        }
        return variable;
    }

    // this method is used for string inputs composed only by integer numbers
    public String longInput(){
        String variable = input.nextLine();
        for (int i = 0; i < variable.length(); i++) {
            if (Character.isDigit(variable.charAt(i))) {
                if (i == variable.length() - 1) {
                    return variable;
                }
            } else {
                System.out.println("Entrada inválida. Por favor tente novamente.");
                variable = this.input.nextLine();
                i = -1;
            }
        }
        return variable;
    }

    //the input needs to have '@' as substring
    public String emailInput(){
        String variable = this.input.nextLine();
        while(!variable.contains("@")){
            System.out.println("Email inválido. Por favor tente novamente.");
            variable = this.input.nextLine();
        }
        return variable;
    }

    public String simpleString(){
        return this.input.nextLine();
    }

    //Receives the number of valid inputs and returns a valid input
    public int numberedInput(int numbOfOptions){
        int variable = -1;
        boolean correctInput = false;
        while (!correctInput){
            try {
                variable = Integer.parseInt(this.input.nextLine());
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

    public int integerInput(){
        boolean correctInput = false;
        int variable = -1;
        while (!correctInput){
            try {
                variable = Integer.parseInt(this.input.nextLine());
                correctInput = true;
            } catch (NumberFormatException exception){
                System.out.println("Entrada inválida. Por favor tente novamente.");
            }
        }
        return variable;
    }

}
