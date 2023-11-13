package cz.fei.upce.cv08.autobazar;

public class Autobazar {
    private String jmeno;
    private final Automobil[] automobily;
    private int aktualniPozice;

    public Autobazar(String jmeno, int velikost) {
        this.jmeno = jmeno;
        this.automobily = new Automobil[velikost];
        this.aktualniPozice = 0;
    }
    
    public void vlozAutomobil(Automobil automobil) {
        this.automobily[this.aktualniPozice] = automobil;
        ++this.aktualniPozice;
    }
    
    public void vypisAutomobily() {
        for (int i = 0; i < aktualniPozice; i++) {
            System.out.println(automobily[i]);
        }
    }

    // TODO Doimplementovat zbyle metody

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    
    @Override
    public String toString() {
        return "Autobazar{" + "jmeno=" + jmeno + '}';
    }
}
