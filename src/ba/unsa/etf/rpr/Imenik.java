package ba.unsa.etf.rpr;

import java.util.*;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime, broj);
    }

    public String dajBroj(String ime){
        return imenik.get(ime).Ispisi();
    }

    public String dajIme(TelefonskiBroj broj){
        if(imenik.containsValue(broj)){
            for(Map.Entry<String, TelefonskiBroj> e: imenik.entrySet()){
                if(e.getValue().equals(broj))
                    return e.getKey().toString();
            }
        }
        return null;
    }

    

}
