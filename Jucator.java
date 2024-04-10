import java.util.HashSet;
import java.util.Set;

public class Jucator {
    private String nume;
    private int varsta;
    protected double inaltime;
    protected double greutate;
    private Salariu salariu;
    private Echipa[] echipeAnterioare; // Modificarea aici
    private Echipa echipaCurenta;
    protected String pozitie;
    protected String cetatenie;
    private int nrLicenta;
    private StatisticaJucator statistica;
    private static Set<Integer> numereLicentaUtilizate = new HashSet<>();

    public Jucator(String nume, int varsta, double inaltime, double greutate, Salariu salariu,
                   Echipa[] echipeAnterioare, Echipa echipaCurenta, String pozitie, String cetatenie, int nrLicenta,
                   StatisticaJucator statistica) {
        this.nume = nume;
        this.varsta = varsta;
        this.inaltime = inaltime;
        this.greutate = greutate;
        this.salariu = salariu;
        this.echipeAnterioare = echipeAnterioare;
        this.echipaCurenta = echipaCurenta;
        this.pozitie = pozitie;
        this.cetatenie = cetatenie;
        this.statistica = statistica;

        // Verificăm dacă numărul de licență este unic
        if (!numereLicentaUtilizate.contains(nrLicenta)) {
            this.nrLicenta = nrLicenta;
            numereLicentaUtilizate.add(nrLicenta);
        } else {
            throw new IllegalArgumentException("Numărul de licență trebuie să fie unic");
        }
    }

    // Metode de acces pentru atributele private
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public Salariu getSalariu() {
        return salariu;
    }

    public void setSalariu(Salariu salariu) {
        this.salariu = salariu;
    }

    public Echipa[] getEchipeAnterioare() { // Modificarea aici
        return echipeAnterioare;
    }

    public void setEchipeAnterioare(Echipa[] echipeAnterioare) { // Modificarea aici
        this.echipeAnterioare = echipeAnterioare;
    }

    public Echipa getEchipaCurenta() {
        return echipaCurenta;
    }

    public void setEchipaCurenta(Echipa echipaCurenta) {
        this.echipaCurenta = echipaCurenta;
    }

    public String getPozitie() {
        return pozitie;
    }

    public void setPozitie(String pozitie) {
        this.pozitie = pozitie;
    }

    public String getCetatenie() {
        return cetatenie;
    }

    public void setCetatenie(String cetatenie) {
        this.cetatenie = cetatenie;
    }

    public int getNrLicenta() {
        return nrLicenta;
    }
    public StatisticaJucator getStatistica() {
        return statistica;
    }

    public void setStatistica(StatisticaJucator statistica) {
        this.statistica = statistica;
    }

    public void setNrLicenta(int nrLicenta) {
        // Ștergem numărul de licență vechi din setul de numere de licență utilizate
        numereLicentaUtilizate.remove(this.nrLicenta);

        // Verificăm dacă noul număr de licență este unic
        if (!numereLicentaUtilizate.contains(nrLicenta)) {
            this.nrLicenta = nrLicenta;
            numereLicentaUtilizate.add(nrLicenta);
        } else {
            throw new IllegalArgumentException("Numărul de licență trebuie să fie unic");
        }
    }
}
