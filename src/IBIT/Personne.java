package IBIT;

public abstract class Personne {
    int id;
    int idCounter = 1;
    String nom;
    String prenom;
    String mail;
    String telephone;
    double salaire;

    Personne(String nom, String prenom, double salaire){
        this.id=idCounter++;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    abstract double CalculerSalaire();

}
