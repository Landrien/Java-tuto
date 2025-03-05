package Exo6;

public class Rectangle implements Forme{
    int longeur;
    int largeur;

    Rectangle(int longeur, int largeur){
        this.largeur=largeur;
        this.longeur=longeur;
    }

    @Override
    public void getSurface() {
        double surface = this.largeur*this.longeur;
        System.out.println("La surface de se rectangle est de : "+ surface +"cm²");

    }
}
