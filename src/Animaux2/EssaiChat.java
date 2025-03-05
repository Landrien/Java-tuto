package Animaux2;

import java.util.Random;

public class EssaiChat {
    static Random random = new Random();

    static Animal tirage1() {
        Animal animal = (random.nextInt(2)==1)? new Chat() : new Chien();
        animal.action();
        return animal;
    }
    // Si il y a 3 Objets ou +
    static Animal tirage2() {
        Animal animal;
        switch (random.nextInt(3)) { // Génère un nombre entre 0 et 2
            case 0 -> animal = new Chat();
            //case 1 -> animal = new Oiseau();
            default -> animal = new Chien();
        }
        animal.action();
        return animal;
    }


    public static void main(String[] args){
    tirage1();
    }
}
