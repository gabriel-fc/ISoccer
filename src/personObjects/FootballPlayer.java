package personObjects;

import inputPackage.Input;

public class FootballPlayer extends Employee {
    private int playerFunction;
    private int playerStatus;

    public FootballPlayer() {
        System.out.printf("\nDefina a função do jogador.\n1. Goleiro\n2. Lateral Esquerdo\n3. Zagueiro\n4. Lateral Direito\n5. Volante\n6. Meia\n7. Atacante\n");
        this.playerFunction = Input.numberedInput(7);
        System.out.printf("Defina o status do jogador:\n1. Apto\n2. Não Apto\n3. No Departamento médico\n");
        this.playerStatus = Input.numberedInput(3);
    }

    public int getPlayerFunction() {
        return this.playerFunction;
    }


    public int getPlayerStatus(){
        return this.playerStatus;
    }

    /*
 System.out.printf("\nDefina a função do jogador.\n1. Goleiro\n2. Lateral Esquerdo\n3. Zagueiro\n4. Lateral Direito\n5. Volante\n6. Meia\n7. Atacante\n");
        this.playerFunction = Input.numberedInput(7);
 */
    public void setPlayerFunction(int playerFunction) {
        this.playerFunction = playerFunction;
    }

    public void setPlayerStatus() {
        System.out.printf("Defina o status do jogador:\n1. Apto\n2. Não apto\n3. No departamento médico\n");
        this.playerStatus = Input.numberedInput(3);
    }

    public String toStringPlayerStatus() {
        switch (this.playerStatus) {
            case 1:
                return "Apto";
            case 2:
                return "Não Apto";
            case 3:
                return "No Departamento Médico";
            default:
                return null;
        }
    }

    public void print(){
        System.out.println("Nome do jogador: " + super.getFullName());
        System.out.println("Cpf do jogador: "+ super.getCpf());
        System.out.println("E-mail do jogador: "+ super.getEmail());
        System.out.println("Telefone do jogador: "+ super.getPhone());
        System.out.println("Salário do jogador: "+ super.getSalary() +" reais");
        System.out.println("Função do jogador: "+ this.playerFunction);
        System.out.println("Status do jogador: "+ Input.toStringPlayerFunction(this.playerFunction)+"\n");
    }
}