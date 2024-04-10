import java.util.HashSet;
import java.util.Set;

public class Antrenor {
    private int nrLicenta;
    private String nume;
    private String tip;
    private Salariu salariu;
    private Echipa echipaCurenta;
    private String cetatenie;

    // Set pentru a ține evidența numerelor de licență deja utilizate
    private static Set<Integer> numereLicentaUtilizate = new HashSet<>();

    public Antrenor(int nrLicenta, String nume, String tip, Salariu salariu,Echipa echipaCurenta, String cetatenie) {
        // Verificăm dacă numărul de licență este unic
        if (!numereLicentaUtilizate.contains(nrLicenta)) {
            this.nrLicenta = nrLicenta;
            numereLicentaUtilizate.add(nrLicenta);
        } else {
            throw new IllegalArgumentException("Numărul de licență trebuie să fie unic");
        }

        this.nume = nume;
        this.tip = tip;
        this.salariu = salariu;
        this.echipaCurenta = echipaCurenta;
        this.cetatenie = cetatenie;
    }

    // Metode de acces pentru atributele private
    public int getNrLicenta() {
        return nrLicenta;
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

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Salariu getSalariu() {
        return salariu;
    }

    public void setSalariu(Salariu salariu) {
        this.salariu = salariu;
    }
    public Echipa getEchipaCurenta() {
        return echipaCurenta;
    }

    public void setEchipaCurenta(Echipa echipaCurenta) {
        this.echipaCurenta = echipaCurenta;
    }
    public String getCetatenie() {
        return cetatenie;
    }

    public void setCetatenie(String cetatenie) {
        this.cetatenie = cetatenie;
    }
}

