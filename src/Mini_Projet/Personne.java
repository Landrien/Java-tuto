package Mini_Projet;

public class Personne {
    String nom;
    int annee;

    Personne(String nom, int annee){
        this.nom=nom;
        this.annee=annee;
    }


    public void affichage() {
        System.out.println("\tNom : " + nom +"\n\tAnnee : " + annee);
    }
}
