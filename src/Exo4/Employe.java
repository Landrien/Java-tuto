package Exo4;

public class Employe extends Personne{
    double salaire;

    Employe(String nom, String prenom, double salaire){
        super(nom,prenom);
        this.salaire = salaire;

    }

    public String toString() {
        return "Id="+this.id + ", nom=" + this.nom + ", prenom=" + this.prenom+", salaire=" + this.salaire;
    }

}
