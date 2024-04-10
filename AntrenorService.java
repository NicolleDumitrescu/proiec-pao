import java.util.HashMap;
import java.util.Map;

public class AntrenorService {
    private Map<Integer, Antrenor> antrenori = new HashMap<>();

    // Adăugarea unui antrenor
    public void adaugaAntrenor(Antrenor antrenor) {
        antrenori.put(antrenor.getNrLicenta(), antrenor);
    }

    // Ștergerea unui antrenor
    public void stergeAntrenor(int nrLicenta) {
        antrenori.remove(nrLicenta);
    }

    // Metoda pentru a actualiza echipa curentă a unui antrenor
    public void actualizeazaEchipaCurentaAntrenor(int nrLicenta, Echipa echipa) {
        Antrenor antrenor = antrenori.get(nrLicenta);
        if (antrenor != null) {
            antrenor.setEchipaCurenta(echipa);
        }
    }

    // Metoda pentru a obține un antrenor după numărul său de licență
    public Antrenor getAntrenor(int nrLicenta) {
        return antrenori.get(nrLicenta);
    }

    // Metoda pentru a obține toți antrenorii
    public Map<Integer, Antrenor> getTotiAntrenorii() {
        return antrenori;
    }
}
