import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clasament {
    private List<Echipa> echipe;
    private Map<Echipa, Integer> punctaje;
    private Map<Echipa, Integer> locuri;

    public Clasament(List<Echipa> echipe) {
        this.echipe = echipe;
        this.punctaje = new HashMap<>();
        this.locuri = new HashMap<>();
        initializeazaPunctaje();
    }

    private void initializeazaPunctaje() {
        for (Echipa echipa : echipe) {
            punctaje.put(echipa, 0);
        }
    }

    public void actualizeazaClasament(List<StatisticaMeci> statisticiMeci) {
        for (StatisticaMeci statisticaMeci : statisticiMeci) {
            Echipa echipaCastigatoare = statisticaMeci.getEchipaCastigatoare();
            if (echipaCastigatoare != null) {
                int punctajVechi = punctaje.get(echipaCastigatoare);
                punctaje.put(echipaCastigatoare, punctajVechi + 2);
            }
        }
        actualizeazaLocuri();
    }

    private void actualizeazaLocuri() {
        List<Echipa> echipeSortate = new ArrayList<>(echipe);
        echipeSortate.sort((e1, e2) -> punctaje.get(e2).compareTo(punctaje.get(e1)));

        int loc = 1;
        for (Echipa echipa : echipeSortate) {
            locuri.put(echipa, loc++);
        }
    }

    public List<Echipa> getEchipe() {
        return echipe;
    }

    public Map<Echipa, Integer> getPunctaje() {
        return punctaje;
    }

    public Map<Echipa, Integer> getLocuri() {
        return locuri;
    }
}
