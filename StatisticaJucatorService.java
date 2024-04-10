import java.util.HashMap;
import java.util.Map;

public class StatisticaJucatorService {
    private Map<Integer, StatisticaJucator> statisticiJucatori = new HashMap<>();

    // Adăugarea unei statistici pentru un jucător
    public void adaugaStatisticaJucator(int nrLicentaJucator, StatisticaJucator statisticaJucator) {
        statisticiJucatori.put(nrLicentaJucator, statisticaJucator);
    }

    // Ștergerea unei statistici pentru un jucător
    public void stergeStatisticaJucator(int nrLicentaJucator) {
        statisticiJucatori.remove(nrLicentaJucator);
    }

    // Actualizarea statisticilor unui jucător
    public void actualizeazaStatisticiJucator(int nrLicentaJucator, int rebounds, int assists, int puncte) {
        StatisticaJucator statisticaJucator = statisticiJucatori.get(nrLicentaJucator);
        if (statisticaJucator != null) {
            statisticaJucator.setRebounds(rebounds);
            statisticaJucator.setAssists(assists);
            statisticaJucator.setPuncte(puncte);
        }
    }

    // Metoda pentru a obține statisticile unui jucător
    public StatisticaJucator getStatisticaJucator(int nrLicentaJucator) {
        return statisticiJucatori.get(nrLicentaJucator);
    }

    // Metoda pentru a obține toate statisticile jucătorilor
    public Map<Integer, StatisticaJucator> getToateStatisticileJucatorilor() {
        return statisticiJucatori;
    }
}

