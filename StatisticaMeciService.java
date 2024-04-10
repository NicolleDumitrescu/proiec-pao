import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StatisticaMeciService {
    private List<StatisticaMeci> statisticiMeciuri = new ArrayList<>();

    // Adăugarea unei statistici pentru un meci
    public void adaugaStatisticaMeci(StatisticaMeci statisticaMeci) {
        statisticiMeciuri.add(statisticaMeci);
    }

    // Ștergerea unei statistici pentru un meci
    public void stergeStatisticaMeci(StatisticaMeci statisticaMeci) {
        statisticiMeciuri.remove(statisticaMeci);
    }

    // Actualizarea unei statistici pentru un meci
    public void actualizeazaStatisticaMeci(StatisticaMeci statisticaMeci, String scorFinal, Echipa echipaCastigatoare) {
        statisticaMeci.setScorFinal(scorFinal);
        statisticaMeci.setEchipaCastigatoare(echipaCastigatoare);
    }

    // Obținerea unei statistici pentru un meci după numărul său
    public StatisticaMeci getStatisticaMeci(int nrMeci) {
        for (StatisticaMeci statisticaMeci : statisticiMeciuri) {
            if (statisticaMeci.getNrMeci().getNrMeci() == nrMeci) {
                return statisticaMeci;
            }
        }
        return null;
    }

    // Obținerea tuturor statisticilor meciurilor
    public List<StatisticaMeci> getToateStatisticiMeciuri() {
        return statisticiMeciuri;
    }
}

