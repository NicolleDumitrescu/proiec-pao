import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class StatisticaMeci {
    private List<Arbitru> arbitrii; // Folosim o listă pentru a ține arbitrii
    private String scorFinal;
    private Meci nrMeci;
    private Echipa echipaCastigatoare;

    // Lista ordonată a categoriilor
    private static final List<String> ordineCategorii = List.of("FIBA", "LNBM", "LNBF", "Liga 1", "Juniori");

    // Comparator personalizat pentru compararea arbitrilor în funcție de categoria lor
    private static final Comparator<Arbitru> comparatorCategorie = Comparator.comparingInt(arbitru -> ordineCategorii.indexOf(arbitru.getCategorie()));

    public StatisticaMeci(List<Arbitru> arbitrii, String scorFinal, Meci nrMeci, Echipa echipaCastigatoare) {
        this.arbitrii = new ArrayList<>(arbitrii); // Folosim o listă pentru a stoca arbitrii
        this.arbitrii.sort(comparatorCategorie); // Sortăm arbitrii după categorie
        this.scorFinal = scorFinal;
        this.nrMeci = nrMeci;
        this.echipaCastigatoare = echipaCastigatoare;
    }

    // Metodele getter și setter pentru scor și echipa câștigătoare rămân neschimbate

    public List<Arbitru> getArbitrii() {
        return arbitrii;
    }

    public void setArbitrii(List<Arbitru> arbitrii) {
        this.arbitrii = arbitrii;
    }

    public String getScorFinal() {
        return scorFinal;
    }

    public void setScorFinal(String scorFinal) {
        this.scorFinal = scorFinal;
    }

    public Meci getNrMeci() {
        return nrMeci;
    }

    public void setNrMeci(Meci nrMeci) {
        this.nrMeci = nrMeci;
    }

    public Echipa getEchipaCastigatoare() {
        return echipaCastigatoare;
    }

    public void setEchipaCastigatoare(Echipa echipaCastigatoare) {
        this.echipaCastigatoare = echipaCastigatoare;
    }
}
