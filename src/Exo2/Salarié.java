package Exo2;

public class Salarié extends Personne {
    double salaire;
    int AF = 300;

    Salarié(String nom, int nbrEnfant,int salaire, int AF ){
        super (nom, nbrEnfant);
        this.salaire = salaire;
        this.AF = AF;
    }

    int primeAF(){
       return super.nbrEnfant * 300;
    }
    void afficher() {
       System.out.println("nom="+ super.nom + " Prime="+ primeAF() + "€");
    }
}
