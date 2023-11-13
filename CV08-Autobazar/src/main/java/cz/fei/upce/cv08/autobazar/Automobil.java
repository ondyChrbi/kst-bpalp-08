package cz.fei.upce.cv08.autobazar;

public class Automobil {

    private final String vyrobce;
    private final String modelVozu;
    private double pocetNajetychKilometru;
    private double prumernaSpotreba;

    public Automobil(String vyrobce, String modelVozu, double pocetNajetychKilometru, double prumernaSpotreba) {
        this.vyrobce = vyrobce;
        this.modelVozu = modelVozu;
        this.pocetNajetychKilometru = pocetNajetychKilometru;
        this.prumernaSpotreba = prumernaSpotreba;
    }

    public void pridejNajeteKilometry(double najeteKilometry) {
        this.pocetNajetychKilometru += najeteKilometry;
    }
    
    public String getVyrobce() {
        return this.vyrobce;
    }

    public String getModelVozu() {
        return modelVozu;
    }

    public double getPocetNajetychKilometru() {
        return pocetNajetychKilometru;
    }

    public double getPrumernaSpotreba() {
        return prumernaSpotreba;
    }

    public void setPrumernaSpotreba(double prumernaSpotreba) {
        this.prumernaSpotreba = prumernaSpotreba;
    }

    @Override
    public String toString() {
        return "{" + "vyrobce=" + vyrobce + ", modelVozu=" + modelVozu + ", pocetNajetychKilometru=" + pocetNajetychKilometru + ", prumernaSpotreba=" + prumernaSpotreba + '}';
    }
}
