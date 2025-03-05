package Mini_Projet;

public class Secretaire extends Employee{

    Secretaire(String nom, int annee ,String institut, double salaire){
        super(nom,annee ,institut, salaire);
    }

    @Override
    public void affichage() {
        System.out.println("Secrétaire: "); super.affichage();
    }
}
