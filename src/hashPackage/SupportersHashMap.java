package hashPackage;

import inputPackage.Input;
import personObjects.Supporter;

import java.util.HashMap;

public class SupportersHashMap {
    //this hash is organized by supporter's compliance
    protected HashMap<Boolean, HashMap<String, Supporter>> supportersHt = new HashMap<>();
    private int numOfSupporters;
    //1º position = junior contribution value, 2° position = sênior contribution value, 3° position = elite contribution value
    private float[] categoryValue = new float[3];


    HashMap makehash(){
        HashMap<String, Supporter> newHm = new HashMap<>();
        return newHm;
    }

    public SupportersHashMap(){
        this.numOfSupporters = 0;
        this.supportersHt.put(true, makehash());
        this.supportersHt.put(false,makehash());
        this.categoryValue[0] = -1;
        this.categoryValue[1] = -1;
        this.categoryValue[2] = -1;
    }

    public void setCategoryValue(){
        int key;
        while (true){
            System.out.println("Selecione qual categoria deve ter sua taxa alterada:\n1. Júnior\n2. Sênior\n3. Elite\n Ou digite 4 para sair");
            key = Input.numberedInput(4);
            if(key != 4) System.out.printf("Digite o novo valor da categoria: ");
            if(key == 1) {
                categoryValue[0] = Input.floatInput();
                System.out.println("Valor alterado!");
            }
            else if (key == 2) {
                categoryValue[1] = Input.floatInput();
                System.out.println("Valor alterado!");
            }else if (key == 3) {
                 categoryValue[2] = Input.floatInput();
                 System.out.println("Valor alterado!");
             }else if (key == 4){
                    System.out.println("Operação cancelada!\n\n");
                    return;
            }
            System.out.printf("\n\n");
        }

    }

    //if supportersHt has a supporter with the informed cpf, returns it. If it doesn't, returns null.

    public void changeSupporterCompliace(Supporter supporter){
        boolean aux = supporter.getSupporterCompliance();
        this.supportersHt.get(!aux).put(supporter.getCpf(), supporter);
        this.supportersHt.get(aux).remove(supporter.getCpf());
        this.supportersHt.get(!aux).get(supporter.getCpf()).setSupporterCompliance(!aux);
    }

    public Supporter getSupporter(String cpf){
        for (boolean key : supportersHt.keySet()) {
            if (supportersHt.get(key).containsKey(cpf)){
                return supportersHt.get(key).get(cpf);
            }
        }
        return null;
    }

    public boolean addSupporter(Supporter newSupporter){
        if (this.getSupporter(newSupporter.getCpf()) != null){
            System.out.println("Sócio-torcedor já cadastrado!");
            return false;
        }
        supportersHt.get(newSupporter.getSupporterCompliance()).put(newSupporter.getCpf(), newSupporter);
        numOfSupporters++;
        return true;
    }

    public int getNumOfSupporters(){
        return this.numOfSupporters;
    }

    public void printCurrentCategoryValues(){
        System.out.printf("Os atuais valores são:\nJúnior: ");
        if (this.categoryValue[0] == -1){
            System.out.println("Valor não definido");
        }else{
            System.out.println(this.categoryValue[0]);
        }
        System.out.printf("Sênior: ");
        if (this.categoryValue[1] == -1){
            System.out.println("Valor não definido");
        }else{
            System.out.println(this.categoryValue[1]);
        }
        System.out.printf("Elite: ");
        if (this.categoryValue[2] == -1){
            System.out.println("Valor não definido");
        }else{
            System.out.println(this.categoryValue[2]);
        }
        System.out.printf("\n");
    }

    public void printTrueCompliance(){
        if (this.supportersHt.get(true).size() == 0){
            return;
        }
        for (String key: this.supportersHt.get(true).keySet()) {
            this.supportersHt.get(true).get(key).print();

        }
    }

    public void printFalseCompliance(){
        if (this.supportersHt.get(false).size() == 0){
            return;
        }
        for (String key: this.supportersHt.get(false).keySet()) {
            this.supportersHt.get(false).get(key).print();

        }
    }

    public void printAll() {
        this.printTrueCompliance();
        System.out.println();
        this.printFalseCompliance();
    }
}
