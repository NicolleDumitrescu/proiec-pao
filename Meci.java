import java.util.HashSet;
import java.util.Set;

public class Meci {
    private static Set<Integer> numereMeciuriUnice = new HashSet<>();
    private int nrMeci;
    private Echipa echipaGazda;
    private Echipa echipaOaspete;
    private int bileteVandute;
    private double pretBilet;
    private double profit;

    public Meci(Echipa echipaGazda, Echipa echipaOaspete, int bileteVandute, double pretBilet) {
        this.nrMeci = genereazaNumarMeciUnic();
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
        this.bileteVandute = bileteVandute;
        this.pretBilet = pretBilet;
        calculeazaProfit();
    }

    private int genereazaNumarMeciUnic() {
        int nrMeciGenerat = (int) (Math.random() * 1000) + 1; // Generăm un număr aleatoriu între 1 și 1000

        while (numereMeciuriUnice.contains(nrMeciGenerat)) {
            nrMeciGenerat = (int) (Math.random() * 1000) + 1; // Dacă numărul generat există deja, generăm altul
        }

        numereMeciuriUnice.add(nrMeciGenerat);
        return nrMeciGenerat;
    }

    public int getNrMeci() {
        return nrMeci;
    }

    public Echipa getEchipaGazda() {
        return echipaGazda;
    }

    public void setEchipaGazda(Echipa echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public Echipa getEchipaOaspete() {
        return echipaOaspete;
    }

    public void setEchipaOaspete(Echipa echipaOaspete) {
        this.echipaOaspete = echipaOaspete;
    }



    public int getBileteVandute() {
        return bileteVandute;
    }

    public void setBileteVandute(int bileteVandute) {
        this.bileteVandute = bileteVandute;
        calculeazaProfit();
    }

    public double getPretBilet() {
        return pretBilet;
    }

    public void setPretBilet(double pretBilet) {
        this.pretBilet = pretBilet;
        calculeazaProfit();
    }

    public double getProfit() {
        return profit;
    }

    private void calculeazaProfit() {
        this.profit = getBileteVandute() * getPretBilet();
    }

}

