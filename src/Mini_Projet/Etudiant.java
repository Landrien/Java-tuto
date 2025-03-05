package Mini_Projet;

public class Etudiant extends Personne{
    String section;

    Etudiant(String nom, int annee, String section){
        super(nom, annee);
        this.section=section;
    }

    @Override
    public void affichage() {
        super.affichage();
        System.out.println("\tSection='" + section);
    }
}
