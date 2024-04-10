import java.util.List;
import java.util.Map;
public class ClasamentService {
    private Clasament clasament;

    public ClasamentService(Clasament clasament) {
        this.clasament = clasament;
    }

    // Actualizarea clasamentului în funcție de statistici meciuri
    public void actualizeazaClasament(List<StatisticaMeci> statisticiMeci) {
        clasament.actualizeazaClasament(statisticiMeci);
    }

    // Obținerea echipelor din clasament
    public List<Echipa> getEchipe() {
        return clasament.getEchipe();
    }

    // Obținerea punctajelor echipelor din clasament
    public Map<Echipa, Integer> getPunctaje() {
        return clasament.getPunctaje();
    }

    // Obținerea locurilor echipelor din clasament
    public Map<Echipa, Integer> getLocuri() {
        return clasament.getLocuri();
    }
}
