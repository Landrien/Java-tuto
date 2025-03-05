package Mini_Projet;

public class Etudiant_Reguliers extends Etudiant{
    double resultat;

    Etudiant_Reguliers(String nom, int annee, String section, double resultat){
        super( nom, annee, section);
        this.resultat=resultat;
    }


    @Override
    public void affichage() {
        System.out.println("Etudiant_Reguliers :" );
        super.affichage();
        System.out.println("\tresultat=" + resultat);
    }
}
