public class StatisticaJucator {
    private int nrLicentaJucator;
    private int rebounds;
    private int assists;
    private int puncte;
    private double eficienta;

    public StatisticaJucator(Jucator jucator, int rebounds, int assists, int puncte) {
        this.nrLicentaJucator = jucator.getNrLicenta();
        this.rebounds = rebounds;
        this.assists = assists;
        this.puncte = puncte;
        calculeazaEficienta();
    }

    public int getNrLicentaJucator() {
        return nrLicentaJucator;
    }

    public void setNrLicentaJucator(int nrLicentaJucator) {
        this.nrLicentaJucator = nrLicentaJucator;
    }

    public int getRebounds() {
        return rebounds;
    }

    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
        calculeazaEficienta();
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
        calculeazaEficienta();
    }

    public int getPuncte() {
        return puncte;
    }

    public void setPuncte(int puncte) {
        this.puncte = puncte;
        calculeazaEficienta();
    }
    public double getEficienta() {
        return eficienta;
    }
    public static StatisticaJucator getStatistica(Jucator jucator) {
        return jucator.getStatistica();
    }


    private void calculeazaEficienta() {
        this.eficienta = ((getRebounds() + getAssists() + getPuncte()) * 2.0) / 7;
    }
}

