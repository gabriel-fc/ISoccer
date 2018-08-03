package hashPackage;

import inputPackage.Input;
import personObjects.FootballPlayer;

import java.util.HashMap;

public class PlayersHashMap {
    private  HashMap <Integer, HashMap<String, FootballPlayer>> playersHt = new HashMap<>();
    private int numOfPlayers;

    public HashMap<String, FootballPlayer> makehash(){
        HashMap<String, FootballPlayer> newHash = new HashMap<>();
        return newHash;
    }

    public PlayersHashMap(){
        numOfPlayers = 0;
        playersHt.put(1, makehash());
        playersHt.put(2, makehash());
        playersHt.put(3, makehash());
        playersHt.put(4, makehash());
        playersHt.put(5, makehash());
        playersHt.put(6, makehash());
        playersHt.put(7, makehash());
    }

    //get object trough its cpf
    public FootballPlayer getPlayer(String cpf){
        for (int key: playersHt.keySet()) {
            if(playersHt.get(key).containsKey(cpf)){
                return playersHt.get(key).get(cpf);
            }
        }
        return null;
    }

    public boolean addPlayer(FootballPlayer newPlayer){
        if (this.getPlayer(newPlayer.getCpf()) != null) {
            System.out.println("Este funcionário já está cadastrado");
            return false;
        }
        playersHt.get(newPlayer.getPlayerFunction()).put(newPlayer.getCpf(), newPlayer);
        this.numOfPlayers++;
        return true;
    }

    public int getNumbOfPlayers(){
        return this.numOfPlayers;
    }

    public void printAll(){
        for (int key: this.playersHt.keySet()) {
            System.out.println("~~~~~~ " +Input.toStringPlayerFunction(key) +" ~~~~~~");
            if (this.playersHt.get(key).isEmpty()){
                System.out.println("Nenhum jogador cadastrado nessa posição");
            }else{
                HashMap<String, FootballPlayer> aux = this.playersHt.get(key);
                for (String key2 : aux.keySet()){
                    aux.get(key2).print();
                    System.out.printf("\n");
                }
            }
        }
    }
}
