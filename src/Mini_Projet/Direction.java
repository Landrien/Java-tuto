package Mini_Projet;

public class Direction {
 static int annee_actuelle = 2024;

    static double moyenne ( int annee_actuelle, Personne[] people){
        double a = 0;
        for (Personne person : people) {
            int b;
            b = annee_actuelle - person.annee;
            a += b;
        }
        return a/ people.length;
    }

    static int countEtudiant (Personne[] people){
        int a = 0;
        for (Personne person : people) { // for (int i = 0; i< people.length; i++)
            if (person instanceof Etudiant) {
                a++;
            }
        }
        return a;
    }


    public static void main(String[] args) {
        Personne[] people = {
                new Etudiant_Reguliers("Gaston Peutimide",  2020, "systèmes de communication", 6),
                new Etudiant_Reguliers("Yvan Rattrapeur",  2016, "systèmes de communication", 2.5),
                new Etudiant_Echange("Björn Borgue",  2018, "systèmes d'informatique", "KTH"),
                new Enseignant("Mathieu Matheu",  2015, "Laboratoires des Mathématiques Extrêmement Pures (LMEP) ", 10000,"section de physique" ),
                new Secretaire("Sophie Scribona", 2005, "Laboratoire des Machines à Taper (LMT) ", 5000)
        };
        System.out.println("Parmi les "+ people.length +" EPFLiens, "+ countEtudiant(people) + " sont des étudiants");
        System.out.println("Ils sont ici depuis en moyenne "+ moyenne(annee_actuelle ,people) + " ans");
        for (Personne p : people) {
            p.affichage();
        }

    }
}
