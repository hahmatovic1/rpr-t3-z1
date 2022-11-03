package ba.unsa.etf.rpr;

public class Program {
    public static void main(String[] args) {
        Imenik i = new Imenik();
        i.dodaj("Neko3", new FiksniBroj("123-458", Grad.SARAJEVO));
        i.dodaj("Neko1", new FiksniBroj("123-456", Grad.SARAJEVO));
        i.dodaj("Neko2", new FiksniBroj("123-457", Grad.SARAJEVO));
        i.dodaj("Neko4", new FiksniBroj("123-459", Grad.BIHAC));
        var skup = i.izGradaBrojevi(Grad.SARAJEVO);
        skup.forEach(System.out::println);
    }
}