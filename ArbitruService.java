import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class ArbitruService {
    private Map<String, Arbitru> arbitri = new HashMap<>();

    // Adăugarea unui arbitru
    public void adaugaArbitru(Arbitru arbitru) {
        arbitri.put(arbitru.getIdArbitru(), arbitru);
    }

    // Ștergerea unui arbitru
    public void stergeArbitru(String idArbitru) {
        arbitri.remove(idArbitru);
    }

    // Actualizarea informațiilor unui arbitru
    public void actualizeazaArbitru(String idArbitru, String nume, int varsta, String categorie) {
        Arbitru arbitru = arbitri.get(idArbitru);
        if (arbitru != null) {
            arbitru.setNume(nume);
            arbitru.setVarsta(varsta);
            arbitru.setCategorie(categorie);
        }
    }

    // Metoda pentru a obține un arbitru după id-ul său
    public Arbitru getArbitru(String idArbitru) {
        return arbitri.get(idArbitru);
    }

    // Metoda pentru a obține toți arbitrii
    public Map<String, Arbitru> getTotiArbitrii() {
        return arbitri;
    }
    // Metoda pentru a obține numărul de meciuri arbitrate de un arbitru
    public int numarMeciuriArbitrate(String idArbitru, List<StatisticaMeci> statisticiMeci) {
        int numarMeciuriArbitrate = 0;
        for (StatisticaMeci statisticaMeci : statisticiMeci) {
            for (Arbitru arbitru : statisticaMeci.getArbitrii()) {
                if (arbitru.getIdArbitru().equals(idArbitru)) {
                    numarMeciuriArbitrate++;
                    break; // Trecem la următorul meci dacă am găsit arbitrul
                }
            }
        }
        return numarMeciuriArbitrate;
    }
}
