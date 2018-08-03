package hashPackage;

import resourcesObjects.Resources;

import java.util.HashMap;

public class ResourcesHashMap {
    private HashMap<String, HashMap<String,Resources>> resourcesHt = new HashMap<>();

    HashMap makeHash(){
        HashMap<String, Resources> newHash = new HashMap<>();
        return newHash;
    }

    public ResourcesHashMap(){
        resourcesHt.put("Ônibus", makeHash());
        resourcesHt.put("Estádio", makeHash());
        resourcesHt.put("Centro de Treinamento", makeHash());

    }

    public Resources getResource(String identification){
        for (String key: resourcesHt.keySet()) {
            if(resourcesHt.get(key).containsKey(identification)){
                return resourcesHt.get(key).get(identification);
            }
        }
        return null;
    }

    public boolean addResource(Resources newResource, String type){
        if (this.getResource(newResource.getIdentification()) != null) {
            System.out.println("Este recurso já está cadastrado");
            return false;
        }
        this.resourcesHt.get(type).put(newResource.getIdentification(), newResource);
        return true;
    }

    public void printAll(){
        for (String key: this.resourcesHt.keySet()) {
            System.out.println("~~~~~~ " + key +" ~~~~~~");
            if (this.resourcesHt.get(key).isEmpty()){
                System.out.println("Nenhum recurso desse tipo foi cadastrado");
            }else{
                HashMap<String, Resources> aux = this.resourcesHt.get(key);
                for (String key2 : aux.keySet()){
                    aux.get(key2).print();
                    System.out.printf("\n");
                }
            }
        }
    }


}
