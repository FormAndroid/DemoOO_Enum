package be.bxl.formation.enums;

public enum TauxTVA {
    NORMAL(0.21, "Normal"),
    REDUIT(0.06, "Reduit"),
    PARKING(0.12, "Parking");

    //region Champs (Variable final -> Initialiser dans le Ctor)
    // -> Les valeurs liées au choix de l'enum
    private final double taux;
    private final String nom;
    //endregion

    //region Constructeur (Appeler via les choix de l'enum)
    private TauxTVA(double taux, String nom) {
        this.taux = taux;
        this.nom = nom ;
    }
    //endregion

    public double getTaux() {
        return taux;
    }

    public double appliquerTVA(double prixHT) {
        return prixHT + prixHT * getTaux();
    }

    @Override
    public String toString() {
        return nom;
    }
}
