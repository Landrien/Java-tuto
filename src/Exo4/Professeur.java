package Exo4;

public class Professeur extends Employe{
    String specialite;

    Professeur(String nom, String prenom,int salaire, String specialite){
        super(nom,prenom, salaire);
        this.specialite = specialite;

    }

    public String toString() {
        return "Id="+this.id + ", nom=" + this.nom + ", prenom=" + this.prenom+", salaire="+this.salaire+", Spécialité=" + this.specialite;
    }
}
