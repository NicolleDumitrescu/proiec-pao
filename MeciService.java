import java.util.ArrayList;
import java.util.List;

public class MeciService {
    private List<Meci> meciuri = new ArrayList<>();

    // Adăugarea unui meci
    public void adaugaMeci(Meci meci) {
        meciuri.add(meci);
    }

    // Ștergerea unui meci
    public void stergeMeci(Meci meci) {
        meciuri.remove(meci);
    }

    // Actualizarea informațiilor unui meci
    public void actualizeazaMeci(Meci meci, Echipa echipaGazda, Echipa echipaOaspete, int bileteVandute, double pretBilet) {
        if (meci != null) {
            meci.setEchipaGazda(echipaGazda);
            meci.setEchipaOaspete(echipaOaspete);
            meci.setBileteVandute(bileteVandute);
            meci.setPretBilet(pretBilet);
        }
    }

    // Metoda pentru a obține toate meciurile
    public List<Meci> getToateMeciurile() {
        return meciuri;
    }
}
