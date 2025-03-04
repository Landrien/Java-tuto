package Exo4;

public class Etudiant extends Personne {
    String annee;

    Etudiant(String nom, String prenom, String année){
        super(nom,prenom);
        this.annee = année;

    }

    public String toString() {
        return "Id="+this.id + ", nom=" + this.nom + ", prenom=" + this.prenom+", année=" + this.annee;
    }
}
