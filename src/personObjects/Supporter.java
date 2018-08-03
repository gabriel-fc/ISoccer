package personObjects;

import inputPackage.Input;

public class Supporter extends Person {
    private int category;
    private boolean compliance;
    public Supporter(){
        System.out.format("Digite o número referente à categoria desejada do novo sócio-torcedor:\n1. Júnior\n2. Sênior\n3. Elite\n");
        category = Input.numberedInput(3);
        compliance = true;

    }

    public int getSupporterCategory(){
        return this.category;
    }

    public boolean getSupporterCompliance(){
        return this.compliance;
    }

    public String toStringSupporterCompliance(){
        if(this.getSupporterCompliance()){
            return "Adimplente";
        }
        return "Inadimplente";
    }

    public void setSupporterCategory() {
        System.out.format("Digite o número referente à categoria desejada do novo sócio-torcedor:\n1. Júnior\n2. Sênior\n3. Elite\n");
        category = inputPackage.Input.numberedInput(3);
    }

    public void setSupporterCompliance(boolean compliance) {
        this.compliance = compliance;
    }

    public void print(){
        System.out.println("Nome do sócio-Torcedor: " + super.getFullName());

        System.out.println("Cpf do sócio-Torcedor: "+ super.getCpf());
        System.out.println("E-mail do sócio-Torcedor: "+ super.getEmail());
        System.out.println("Telefone do sócio-Torcedor: "+ super.getPhone());
        System.out.println("Categoria do sócio-Torcedor: "+ Input.toStringSupporterCategory(this.category)+"\n");

    }

}
