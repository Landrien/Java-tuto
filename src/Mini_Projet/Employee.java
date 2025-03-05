package Mini_Projet;

public class Employee extends Personne{

    String institut;
    double salaire;

    Employee(String nom, int annee ,String institut, double salaire){
        super(nom, annee);
        this.institut = institut;
        this.salaire=salaire;
    }

    @Override
    public void affichage() {
        super.affichage();
        System.out.println("\tInstitut : " + institut +"\n\tSalaire=" + salaire);
    }
}
