package Mini_Projet;

public class Enseignant extends  Employee{
    String enseignement;

    Enseignant(String nom, int annee ,String institut, double salaire, String enseignement){
        super(nom,annee ,institut, salaire);
        this.enseignement=enseignement;
    }

    @Override
    public void affichage() {
        System.out.println("Enseignant ");
        super.affichage();
        System.out.println("\tEnseignement='" + enseignement);
    }
}
