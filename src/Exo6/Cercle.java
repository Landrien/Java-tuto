package Exo6;

public class Cercle implements Forme{
    int rayon;

    Cercle(int rayon){
        this.rayon=rayon;
    }

    @Override
    public void getSurface() {
        double surface = 3.14*this.rayon*this.rayon;
        System.out.println("La surface de se cercle est de : "+ surface +"cm²");
    }
}
