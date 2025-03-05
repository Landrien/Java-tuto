package Exo6;

import java.util.concurrent.TransferQueue;

public class Triangle implements Forme{
    int base;
    int hauteur;

    Triangle(int base, int hauteur){
        this.hauteur=hauteur;
        this.base=base;
    }

    @Override
    public void getSurface() {
        double surface = this.base*this.hauteur*0.5;
        System.out.println("La surface de se triangle est de : "+ surface +"cm²");
    }
}
