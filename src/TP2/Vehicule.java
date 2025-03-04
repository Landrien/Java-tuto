package TP2;

import java.io.StringReader;

public class Vehicule {
    String marque;
    int annee_achat;
    double prix_achat;
    double prix_courant;

    Vehicule(String marque, int annee_achat, double prix_achat){
        this.marque = marque;
        this.annee_achat = annee_achat;
        this.prix_achat = prix_achat;
    }

    void calculPrix(int anneActuelle){
       this.prix_courant= this.prix_achat*((0.01)*(anneActuelle-this.annee_achat));
    }

    void affiche (){
        System.out.println("marque ="+this.marque+"; année d'achat="+ this.annee_achat+"; prix d'achat="+this.prix_achat+"; prix courant="+this.prix_courant);
    }
}
