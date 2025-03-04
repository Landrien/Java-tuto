package Exo4;

public class Application {
    public static void main(String[] args){
        Etudiant Enzo = new Etudiant("Zaro","Enzo","2027-2030" );
        Etudiant Marion = new Etudiant("Zaro","Marion","2027-2030" );
        Employe Jacob = new Employe("Puys", "Jacob", 1800);
        Employe James = new Employe("Viro", "James", 1800);
        Professeur M_Bernouillie = new Professeur("Bernouillie", "Paul",2100,"Physique-Chimie");
        Professeur M_Bolt = new Professeur("Bolt", "Paolo",2100,"EPS");

        System.out.println(Enzo);
        System.out.println(Marion);
        System.out.println(Jacob);
        System.out.println(James);
        System.out.println(M_Bernouillie);
        System.out.println(M_Bolt);
    }
}
