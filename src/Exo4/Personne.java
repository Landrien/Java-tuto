package Exo4;

public class Personne {
    int id;
    String nom;
    String prenom;
    static int idCounter = 1;

    Personne(String nom, String prenom){
        this.id = idCounter++;
        this.nom = nom;
        this.prenom = prenom;
    }
    public String toString() {
        return "Id="+this.id + ", nom=" + this.nom + ", prenom=" + this.prenom;
    }
}

