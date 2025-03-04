package TP;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCompte {
    public static void main(String[] args){
        Compte compte1 = new Compte("Jérome");
        Compte compte2 = new Compte("Charle");

        compte1.deposer(500);
        compte2.deposer(1000);
        compte2.retirer(10);
        compte1.virerVers(75,compte2);
        compte1.afficher();
        compte2.afficher();
        int nbComptes = 10;

        Compte[] tab = new Compte[nbComptes];
        tab[0] = new Compte("JJ");
        tab[1] = new Compte("Paul");
        tab[2] = new Compte("Marc");
        tab[3] = new Compte("Antoine");
        tab[4] = new Compte("Xavier");
        tab[5] = new Compte("Charles");
        tab[6] = new Compte("Benoit");
        tab[7] = new Compte("Damien");
        tab[8] = new Compte("Daniel");
        tab[9] = new Compte("Théo");

        for (Compte compte : tab) {
            compte.deposer(200);
        }
        for (int i = 0; i < nbComptes; i++) {
            for (int j = i + 1; j < nbComptes; j++) {
                tab[i].virerVers(20, tab[j]);
            }
        }

        for (Compte compte : tab) {
            compte.afficher();
        }





    }

}
