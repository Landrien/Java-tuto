import java.util.Scanner;

public class Voiture {
    int ID;
    String Marque;
    int Vitesse;
    int Puissance;
    private static int idCounter = 1;

    public Voiture (String Marque, int Vitesse, int Puissance) {
        this.ID = idCounter++;
        this.Marque = Marque;
        this.Vitesse = Vitesse;
        this.Puissance = Puissance;
    }
    // Getter
    public int getID() {
        return ID;
    }
    public String getMarque() {
        return Marque;
    }
    public int getVitesse() {
        return Vitesse;
    }
    public int getPuissance() {
        return Puissance;
    }

    // Setter
    public void setID(int newID) {
        this.ID = newID;
    }
    public void setMarque(String newMarque) {
        this.Marque = newMarque;
    }
    public void setVitesse(int newVitesse) {
        this.Vitesse = newVitesse;
    }
    public void setPuissance(int newPuissance) {
        this.Puissance = newPuissance;
    }

    public String toString() {
        return "Id="+this.ID + ", marque=" + this.Marque + ", vitesse=" + this.Vitesse+", puissance=" + this.Puissance;
    }


    public static void main(String[] args) {
        Voiture FeFe = new Voiture("Ferrari", 420,500);
        Voiture Lambo = new Voiture("Lanborghini",410,490 );

        System.out.println(FeFe);
        System.out.println(Lambo);
    }
}
