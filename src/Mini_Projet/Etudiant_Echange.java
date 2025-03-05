package Mini_Projet;

public class Etudiant_Echange extends Etudiant{
    String universiteOrigine;

    Etudiant_Echange(String nom, int annee, String section, String universiteOrigine){
        super(nom, annee, section);
       this.universiteOrigine=universiteOrigine;
    }

    @Override
    public void affichage() {
        System.out.println("Etudiant_Echange ");
        super.affichage();
        System.out.println("\tuniversiteOrigine=" + universiteOrigine);
    }
}
