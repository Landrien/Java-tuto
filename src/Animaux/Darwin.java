package Animaux;

public class Darwin{
    public static void main(String[] args) {
        Animaux[] tableau = new Animaux[4];
        tableau[0] = new Oiseaux();
        tableau[1] = new Poisson();
        tableau[2] = new Reptile();
        tableau[3] = new Mammifère();
        for (int i=0; i<tableau.length; i++){
            tableau[i].seDeplacer();
        }
    }
}
