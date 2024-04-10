import java.util.HashSet;
import java.util.Set;

public class Echipa {
    private int cif;
    private String denumire;
    private String adresa;
    private double buget;
    private static Set<Integer> cifuriUtilizate = new HashSet<>();

    public Echipa(int cif, String denumire, String adresa, double buget) {
        // Verificăm dacă CIF-ul este unic
        if (!cifuriUtilizate.contains(cif)) {
            this.cif = cif;
            cifuriUtilizate.add(cif);
        } else {
            throw new IllegalArgumentException("CIF-ul trebuie să fie unic");
        }

        this.denumire = denumire;
        this.adresa = adresa;
        this.buget = buget;
    }

    // Metode de acces pentru atributele private
    public int getCif() {
        return cif;
    }

    public void setCif(int cif) {
        // Ștergem CIF-ul vechi din setul de CIF-uri utilizate
        cifuriUtilizate.remove(this.cif);

        // Verificăm dacă noul CIF este unic
        if (!cifuriUtilizate.contains(cif)) {
            this.cif = cif;
            cifuriUtilizate.add(cif);
        } else {
            throw new IllegalArgumentException("CIF-ul trebuie să fie unic");
        }
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getBuget() {
        return buget;
    }

    public void setBuget(double buget) {
        this.buget = buget;
    }
}
