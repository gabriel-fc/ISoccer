package controller;

import model.personClasses.FootballPlayer;

public class ToStringFunctions {

    public String toStringEmployeeFunction(int function){
        switch (function){
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

    public String toStringPlayerStatus(int playerStatus) {
        switch (playerStatus) {
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

    public String toStringPlayerFunction(int playerFunction){
        switch (playerFunction){
            case 1:
                return "Goleiro";
            case 2:
                return "Lateral esquerdo";
            case 3:
                return "Zagueiro";
            case 4:
                return "Lateral direito";
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

    public String toStringSupporterCompliance(boolean compliance){
        if(compliance){
            return "Adimplente";
        }
        return "Inadimplente";
    }

    public String toStringSupporterCategory(int category) {
        switch (category) {
            case 1:
                return "Júnior";
            case 2:
                return "Sênior";
            case 3:
                return "Elite";
            default:
                return null;
        }
    }

    public String toStringResourceStatus(boolean status){
        if (status){
            return "Disponível";
        }
        return "Indisponível";
    }

    public String toStringResourceType(int type){
        switch (type){
            case 1:
                return "Ônibus";
            case 2:
                return "Estádio";
            case 3:
                return "Centro de treinamento";
            default:
                return null;
        }
    }

}
