package TP2;

public class Avion extends Vehicule{
    String type_moteur;
    int nbr_heures_vol;

    Avion(String marque, int annee_achat, double prix_achat, String type_moteur ,int nbr_heures_vol ){
        super(marque,annee_achat, prix_achat );
        this.type_moteur = type_moteur;
        this.nbr_heures_vol = nbr_heures_vol;
    }

    @Override
    void calculPrix(int anneActuelle) {
        if (this.type_moteur.equals("HELICES")){
            super.prix_courant = super.prix_achat-(super.prix_achat*((0.1)*(nbr_heures_vol/100)));
        }else {
            super.prix_courant = super.prix_achat-(super.prix_achat*((0.1)*(nbr_heures_vol/1000)));
        }
        if (super.prix_courant <= 0){
            super.prix_courant = 0;
        }
    }

    @Override
    void affiche() {
        super.affiche();
        System.out.println("; type de moteur="+type_moteur+"; nombre d'heure de vol="+nbr_heures_vol);
    }
}
