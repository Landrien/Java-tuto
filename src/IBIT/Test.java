package IBIT;

public class Test {
    public static void main(String[] args) {
        Manager man1 = new Manager("DUPONT","Marie",3000,"Informatique" );
        Manager man2 = new Manager("Dampierre", "Eric", 5000, "Marketing");
        Developpeur dev1 = new Developpeur("EVEN", "Catherine", 25000, "PHP");
        Developpeur dev2 = new Developpeur("NEVER", "Charles", 20000, "Python");

        man1.afficher();
        man2.afficher();
        dev1.afficher();
        dev2.afficher();

    }

}
