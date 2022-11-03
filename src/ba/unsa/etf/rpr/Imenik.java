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

    public String naSlovo(char s){
        StringBuilder sviBrojeviNaSlovo = new StringBuilder();
        int redniBroj = 1;
        for(Map.Entry<String, TelefonskiBroj> e: imenik.entrySet()){
            if(e.getKey().charAt(0) == s){
                sviBrojeviNaSlovo.append(redniBroj).append(".").append(e.getKey()).append(" - ").append(e.getValue().Ispisi());
                redniBroj++;
            }
        }
        return sviBrojeviNaSlovo.toString();
    }

    public Set<String> izGrada(Grad g){
        Set<String> ljudiIzIstogGrada = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toLowerCase().compareTo(o2.toLowerCase());
            }
        });
        for(Map.Entry<String, TelefonskiBroj> e: imenik.entrySet()){
            if(e.getValue().Ispisi().equals(g.toString())){
                ljudiIzIstogGrada.add(e.getKey().toString());
            }
        }
        return ljudiIzIstogGrada;
    }


    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> brojeviIzIstogGrada = new TreeSet<>();
        for(Map.Entry<String, TelefonskiBroj> e: imenik.entrySet()){
            if(e.getValue() instanceof  FiksniBroj && ((FiksniBroj) e.getValue()).getGrad().equals(g)){
                brojeviIzIstogGrada.add(e.getValue());
            }
        }
        return  brojeviIzIstogGrada;
    }

}
