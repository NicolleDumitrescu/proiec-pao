import java.util.HashMap;
import java.util.Map;

public class JucatorService {
    private Map<Integer, Jucator> jucatori = new HashMap<>();

    // Adăugarea unui jucător
    public void adaugaJucator(Jucator jucator) {
        jucatori.put(jucator.getNrLicenta(), jucator);
    }

    // Ștergerea unui jucător
    public void stergeJucator(int nrLicenta) {
        jucatori.remove(nrLicenta);
    }

    // Actualizarea statisticilor unui jucător
    public void actualizeazaStatisticiJucator(int nrLicenta, int rebounds, int assists, int puncte) {
        Jucator jucator = jucatori.get(nrLicenta);
        if (jucator != null && jucator.getStatistica() != null) {
            StatisticaJucator statistica = jucator.getStatistica();
            statistica.setRebounds(rebounds);
            statistica.setAssists(assists);
            statistica.setPuncte(puncte);
        }
    }

    // Calcularea eficienței unui jucător
    public double calculeazaEficientaJucator(int nrLicenta) {
        Jucator jucator = jucatori.get(nrLicenta);
        if (jucator != null && jucator.getStatistica() != null) {
            StatisticaJucator statistica = jucator.getStatistica();
            return statistica.getEficienta();
        }
        return 0.0; // Sau altă valoare implicită
    }

    // Metoda pentru a obține un jucător după numărul său de licență
    public Jucator getJucator(int nrLicenta) {
        return jucatori.get(nrLicenta);
    }

    // Metoda pentru a obține toți jucătorii
    public Map<Integer, Jucator> getTotiJucatorii() {
        return jucatori;
    }
}
