{
    public static void main(String[] args) {
        // Crearea unei instanțe a clasei SalariuService
        SalariuService salariuService = new SalariuService();

        // Adăugarea unui salariu pentru un jucător
        int nrLicentaJucator1 = 1;
        double valoareSalariuJucator1 = 1000.0;
        salariuService.setSalariuJucator(nrLicentaJucator1, valoareSalariuJucator1);

        // Obținerea salariului unui jucător după numărul său de licență
        Salariu salariuJucator1 = salariuService.getSalariuJucator(nrLicentaJucator1);
        System.out.println("Salariul jucătorului cu numărul de licență " + nrLicentaJucator1 + " este: " + salariuJucator1.getValoare());

        // Actualizarea salariului unui jucător după numărul său de licență
        double nouaValoareSalariuJucator1 = 1200.0;
        salariuService.actualizeazaSalariuJucator(nrLicentaJucator1, nouaValoareSalariuJucator1);

        // Obținerea noului salariu al jucătorului după actualizare
        salariuJucator1 = salariuService.getSalariuJucator(nrLicentaJucator1);
        System.out.println("Noul salariu al jucătorului cu numărul de licență " + nrLicentaJucator1 + " este: " + salariuJucator1.getValoare());

        // Crearea unei instanțe a clasei EchipaService
        EchipaService echipaService = new EchipaService();

        // Adăugarea datelor pentru prima echipă
        int cifEchipa1 = 123456; // CIF unic
        String denumireEchipa1 = "Echipa A";
        String adresaEchipa1 = "Str. Primăverii, nr. 1";
        double bugetEchipa1 = 100000.0;

        Echipa echipa1 = new Echipa(cifEchipa1, denumireEchipa1, adresaEchipa1, bugetEchipa1);
        echipaService.adaugaEchipa(echipa1);

        // Adăugarea datelor pentru a doua echipă
        int cifEchipa2 = 654321; // CIF unic
        String denumireEchipa2 = "Echipa B";
        String adresaEchipa2 = "Str. Mihai Eminescu, nr. 2";
        double bugetEchipa2 = 150000.0;

        Echipa echipa2 = new Echipa(cifEchipa2, denumireEchipa2, adresaEchipa2, bugetEchipa2);
        echipaService.adaugaEchipa(echipa2);

        // Afișarea informațiilor despre toate echipele
        List<Echipa> toateEchipele = echipaService.getToateEchipele();
        for (Echipa echipa : toateEchipele) {
            System.out.println("Echipa:");
            System.out.println("CIF: " + echipa.getCif());
            System.out.println("Denumire: " + echipa.getDenumire());
            System.out.println("Adresă: " + echipa.getAdresa());
            System.out.println("Buget: " + echipa.getBuget());
            System.out.println();
        }
    }
}
