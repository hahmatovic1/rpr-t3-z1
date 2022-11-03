package ba.unsa.etf.rpr;

import java.util.Objects;

public class MobilniBroj extends TelefonskiImenik {
    private Integer mobilnaMreza;
    private String broj;

    public MobilniBroj(Integer mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    public Integer getMobilnaMreza() {
        return mobilnaMreza;
    }

    public void setMobilnaMreza(Integer mobilnaMreza) {
        this.mobilnaMreza = mobilnaMreza;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public String Ispisi() {
        return mobilnaMreza.toString() + "/" + broj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobilniBroj that = (MobilniBroj) o;
        return mobilnaMreza.equals(that.mobilnaMreza) && broj.equals(that.broj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobilnaMreza, broj);
    }
}
