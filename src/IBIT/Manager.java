package IBIT;

public class Manager extends Personne{
    String service;

    Manager( String nom, String prenom, double salaire,String service){
        super(nom, prenom, salaire);
        this.service = service;
    }

    @Override
    double CalculerSalaire() {
        salaire = salaire + (salaire*0.35);
        return salaire;
    }

    void afficher(){
        System.out.println("Nom="+nom+"; Prénom="+prenom+"; Salaire="+CalculerSalaire()+"; Service="+service);
    }
}
