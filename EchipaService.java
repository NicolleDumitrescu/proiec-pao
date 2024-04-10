import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EchipaService {
    private List<Echipa> echipe = new ArrayList<>();

    // Adăugarea unei echipe
    public void adaugaEchipa(Echipa echipa) {
        echipe.add(echipa);
    }

    // Ștergerea unei echipe
    public void stergeEchipa(int cif) {
        Echipa echipa = gasesteEchipa(cif);
        if (echipa != null) {
            echipe.remove(echipa);
        } else {
            throw new IllegalArgumentException("Echipa cu CIF-ul dat nu există.");
        }
    }

    // Modificarea bugetului unei echipe
    public void modificareBuget(int cif, double bugetNou) {
        Echipa echipa = gasesteEchipa(cif);
        if (echipa != null) {
            echipa.setBuget(bugetNou);
        } else {
            throw new IllegalArgumentException("Echipa cu CIF-ul dat nu există.");
        }
    }

    // Metodă auxiliară pentru a găsi o echipă după CIF
    private Echipa gasesteEchipa(int cif) {
        for (Echipa echipa : echipe) {
            if (echipa.getCif() == cif) {
                return echipa;
            }
        }
        return null;
    }

    // Metodă pentru a returna o echipă specifică
    public Echipa getEchipa(int cif) {
        return gasesteEchipa(cif);
    }

    // Metodă pentru a returna toate echipele
    public List<Echipa> getToateEchipele() {
        return echipe;
    }
}
