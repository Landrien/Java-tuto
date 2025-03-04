package Exo2;

public class TestAF extends Salarié {
    TestAF(String nom, int nbrEnfant,int salaire, int AF){
        super(nom,nbrEnfant,salaire,AF);
    }
    public static void main(String[] args) {
        TestAF Salarié1 = new TestAF("Hadrien", 4, 1800,5);
        Salarié1.afficher();

    }
}
