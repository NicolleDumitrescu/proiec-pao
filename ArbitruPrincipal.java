public class ArbitruPrincipal extends Arbitru {
    private int experienta;

    public ArbitruPrincipal(String idArbitru, String nume, int varsta, String categorie, int experienta) {
        super(idArbitru, nume, varsta, categorie);
        this.experienta = experienta;
    }

    public int getExperienta() {
        return experienta;
    }

    public void setExperienta(int experienta) {
        this.experienta = experienta;
    }
}
