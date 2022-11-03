package ba.unsa.etf.rpr;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj {

    private String broj;
    private Grad grad;

    public FiksniBroj(String broj, Grad grad) {
        this.broj = broj;
        this.grad = grad;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    @Override
    public String Ispisi() {
        return this.getGrad()+"/"+getBroj();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FiksniBroj that = (FiksniBroj) o;
        return broj.equals(that.broj) && grad == that.grad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(broj, grad);
    }
}
