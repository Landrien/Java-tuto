package IBIT;

public class Developpeur extends Personne{
    String specialite;

    Developpeur( String nom, String prenom, double salaire,String specialite){
        super(nom, prenom, salaire);
        this.specialite = specialite;
    }

    @Override
    double CalculerSalaire() {
        salaire = salaire + (salaire*0.2);
        return salaire;
    }

    public void afficher(){
        System.out.println("Nom="+nom+"; Prénom="+prenom+"; Salaire="+CalculerSalaire()+"; Spécialité="+specialite);
    }
}
