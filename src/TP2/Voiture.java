package TP2;

public class Voiture extends Vehicule{
    double cylindre;
    int nbr_portes;
    double puissance;
    double kilometrage;

    Voiture(String marque, int annee_achat, double prix_achat, double cylindre, int nbr_portes, double puissance, double kilometrage ){
        super(marque,annee_achat, prix_achat );
        this.cylindre = cylindre;
        this.nbr_portes = nbr_portes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    void calculPrix(int anneActuelle) {
        double pourcentatge_annee =(0.01)*(anneActuelle-this.annee_achat);
        double pourcentage_kilometrage = (0.05)*(Math.round(this.kilometrage/10000));
        double pourcentage_marque = 0;
        if (super.marque.equals("Renault") || super.marque.equals("Fiat")){
            pourcentage_marque = 0.1;

        } else if (super.marque.equals("Ferrari") || super.marque.equals("Porsche")) {
            pourcentage_marque= 0.2;
        }
        double pourcentage_total = 1-(pourcentage_kilometrage + pourcentatge_annee + pourcentage_marque);
        super.prix_courant = super.prix_achat*pourcentage_total;
        if (super.prix_courant <= 0){
            super.prix_courant = 0;
        }

    }

    @Override
    void affiche() {
        super.affiche();
        System.out.println("cylindre="+cylindre+"; nombre de portes="+nbr_portes+"; puissance="+puissance+"; kilométrage="+kilometrage);
    }
}
