package ba.unsa.etf.rpr;

public enum Grad {

    BUGOJNO("030"),
    ORASJE("031"),
    ZENICA("032"),
    SARAJEVO("030"),
    LIVNO("034"),
    TUZLA("035"),
    MOSTAR("036"),
    BIHAC("037"),
    GORAZDE("038"),
    SIROKI_BRIJEG("039");

    public final String predznak;
    Grad(String predznak) {
        this.predznak = predznak;
    }

    public String getPredznak() {
        return predznak;
    }

    @Override
    public String toString() {
        return this.getPredznak();
    }
}
