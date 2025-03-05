package Exo5;

public class Main {
    public static void main(String[] args) {
        Jouable football = new Football();
        Jouable volleyball = new Volleyball();
        Jouable basketball = new Basketball();
        football.play();
        volleyball.play();
        basketball.play();
    }
}
