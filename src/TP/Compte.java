package TP;

public class Compte {
    int solde = 0;
    String nom;
    String num_compte;

    Compte(String nom){
        this.nom = nom;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNum_compte() {
        return num_compte;
    }

    public void setNum_compte(String num_compte) {
        this.num_compte = num_compte;
    }

    void deposer(int montant){
        solde = solde + montant;
    }
    void retirer(int montant){
        solde = solde-montant;
    }
    void virerVers(int montant, Compte destination){
        if (montant > 0 && solde >= montant) {
            this.retirer(montant);
            destination.deposer(montant);
    }}
    void afficher(){
        System.out.println("nom:"+ nom +" solde: "+solde);
    }
}
