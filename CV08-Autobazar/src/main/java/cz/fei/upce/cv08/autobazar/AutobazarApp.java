package cz.fei.upce.cv08.autobazar;

public class AutobazarApp {

    public static void main(String[] args) {
        Automobil automobil = new Automobil("Mazda", "8",
                100000, 6.9);

        Autobazar autobazar = new Autobazar("Fei bazar", 10);
        System.out.println(autobazar.getJmeno());
        
        autobazar.vlozAutomobil(automobil);
        autobazar.vlozAutomobil(new Automobil(
                "Skoda", "Octavia", 
                250000, 5.5
        ));
        
        autobazar.vypisAutomobily();
        
    }
}
