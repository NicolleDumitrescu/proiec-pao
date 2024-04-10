import java.util.HashSet;
import java.util.Set;

public class Arbitru {
    private static Set<String> idArbitriUnici = new HashSet<>();

    private String idArbitru;
    private String nume;
    private int varsta;
    private String categorie;

    public Arbitru(String idArbitru, String nume, int varsta, String categorie) {
        if (idArbitriUnici.contains(idArbitru)) {
            throw new IllegalArgumentException("Id-ul arbitru este deja utilizat.");
        }
        this.idArbitru = idArbitru;
        idArbitriUnici.add(idArbitru);
        this.nume = nume;
        this.varsta = varsta;
        this.categorie = categorie;
    }

    public String getIdArbitru() {
        return idArbitru;
    }

    public void setIdArbitru(String idArbitru) {
        this.idArbitru = idArbitru;
    }

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

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}

