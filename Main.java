import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Crearea echipelor
        EchipaService echipaService = new EchipaService();
        Echipa echipa1 = new Echipa(123, "Echipa1", "Adresa1", 100000);
        Echipa echipa2 = new Echipa(456, "Echipa2", "Adresa2", 120000);
        Echipa echipa3 = new Echipa(789, "Echipa3", "Adresa3", 90000);
        Echipa echipa4 = new Echipa(101, "Echipa4", "Adresa4", 110000);

        // Adăugarea echipelor
        echipaService.adaugaEchipa(echipa1);
        echipaService.adaugaEchipa(echipa2);
        echipaService.adaugaEchipa(echipa3);
        echipaService.adaugaEchipa(echipa4);

        // Adăugarea jucătorilor
        JucatorService jucatorService = new JucatorService();
        adaugaJucatoriLaEchipa(echipa1, jucatorService);
        adaugaJucatoriLaEchipa(echipa2, jucatorService);
        adaugaJucatoriLaEchipa(echipa3, jucatorService);
        adaugaJucatoriLaEchipa(echipa4, jucatorService);

        // Adăugarea arbitrilor
        ArbitruService arbitruService = new ArbitruService();
        adaugaArbitrii(arbitruService, 5);

        // Crearea meciurilor
        MeciService meciService = new MeciService();
        List<Meci> meciuri = creeazaMeciuri(echipaService.getToateEchipele());

        // Adăugarea meciurilor
        for (Meci meci : meciuri) {
            meciService.adaugaMeci(meci);
        }

        // Simularea unor statistici pentru meciuri
        StatisticaMeciService statisticaMeciService = new StatisticaMeciService();
        List<StatisticaMeci> statisticiMeci = generareStatisticiMeci(meciService.getToateMeciurile());
        for (StatisticaMeci statisticaMeci : statisticiMeci) {
            statisticaMeciService.adaugaStatisticaMeci(statisticaMeci);
        }

        // Actualizarea clasamentului
        ClasamentService clasamentService = new ClasamentService(new Clasament(echipaService.getToateEchipele()));
        clasamentService.actualizeazaClasament(statisticiMeci);

        // Afișarea clasamentului
        afiseazaClasament(clasamentService);
    }

    // Metodă pentru adăugarea jucătorilor la o echipă
    private static void adaugaJucatoriLaEchipa(Echipa echipa, JucatorService jucatorService) {
        Salariu salariu = new Salariu(1000);
        Echipa[] echipeAnterioare = null; // Presupunem că nu avem informații despre echipele anterioare ale jucatorului
        StatisticaJucator statistica = null; // Presupunem că nu avem statisticile jucatorului

        jucatorService.adaugaJucator(new Jucator("Jucator1", 25, 190.0, 90.0, salariu, echipeAnterioare, echipa, "Atacant", "Romania", 1, statistica));
        jucatorService.adaugaJucator(new Jucator("Jucator2", 25, 190.0, 90.0, salariu, echipeAnterioare, echipa, "Atacant", "Romania", 2, statistica));
        jucatorService.adaugaJucator(new Jucator("Jucator3", 25, 190.0, 90.0, salariu, echipeAnterioare, echipa, "Atacant", "Romania", 3, statistica));
        jucatorService.adaugaJucator(new Jucator("Jucator4", 25, 190.0, 90.0, salariu, echipeAnterioare, echipa, "Atacant", "Romania", 4, statistica));
        jucatorService.adaugaJucator(new Jucator("Jucator5", 25, 190.0, 90.0, salariu, echipeAnterioare, echipa, "Atacant", "Romania", 5, statistica));
    }




    // Metodă pentru adăugarea arbitrilor
    private static void adaugaArbitrii(ArbitruService arbitruService, int numarArbitrii) {
        for (int i = 0; i < numarArbitrii; i++) {
            Arbitru arbitru = new Arbitru("Arbitru" + i, "NumeArbitru" + i, 35 + i, "FIBA");
            arbitruService.adaugaArbitru(arbitru);
        }
    }

    // Metodă pentru crearea meciurilor
    private static List<Meci> creeazaMeciuri(List<Echipa> echipe) {
        List<Meci> meciuri = new ArrayList<>();
        for (int i = 0; i < echipe.size(); i++) {
            for (int j = i + 1; j < echipe.size(); j++) {
                Meci meci = new Meci(echipe.get(i), echipe.get(j), 5000, 50.0);
                meciuri.add(meci);
            }
        }
        return meciuri;
    }

    // Metodă pentru generarea unor statistici pentru meciuri (doar pentru scop demonstrativ)
    private static List<StatisticaMeci> generareStatisticiMeci(List<Meci> meciuri) {
        List<StatisticaMeci> statisticiMeci = new ArrayList<>();
        for (Meci meci : meciuri) {
            StatisticaMeci statisticaMeci = new StatisticaMeci(new ArrayList<>(), "2-1", meci, meci.getEchipaGazda());
            statisticiMeci.add(statisticaMeci);
        }
        return statisticiMeci;
    }

    // Metodă pentru afișarea clasamentului
    private static void afiseazaClasament(ClasamentService clasamentService) {
        List<Echipa> echipe = clasamentService.getEchipe();
        Map<Echipa, Integer> punctaje = clasamentService.getPunctaje();
        Map<Echipa, Integer> locuri = clasamentService.getLocuri();

        System.out.println("Clasament:");
        System.out.println("Loc\tEchipa\t\t\tPunctaj");
        System.out.println("------------------------------------------");
        for (Echipa echipa : echipe) {
            System.out.println(locuri.get(echipa) + "\t" + echipa.getDenumire() + "\t\t" + punctaje.get(echipa));
        }
    }
}

