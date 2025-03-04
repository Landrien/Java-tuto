import java.util.ArrayList;
import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        languageList();
    }

    public static void addition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Donne moi un nombre");
        int a = sc.nextInt();
        System.out.println("Donne moi un deuxième nombre");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Le résultat de "+ a +" + "+ b+" est "+ c);


    }
    public static void multiplication (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Donne moi un nombre");
        int a = sc.nextInt();
        System.out.println("Donne moi un deuxième nombre");
        int b = sc.nextInt();
        int c = a*b;
        System.out.println("Le résultat de "+ a +" + "+ b+" est "+ c);
    }
    public static void factorielle (int a){
        int f = 1;
        for (int i=2; i <= a; i++) {
            f = f*i;
        }
        System.out.println("Le factorielle est : " + f);
    }
    public static void moyenne1 (){
        int a = 7;
        int b = 6;
        int w = 2;
        int moyenne = (a+b+w)/3;
        System.out.println("La moyenne est de : " + moyenne);
    }

    public static void permute (int a, int b){
        int c = a;
        a = b;
        b = c;

        System.out.println("a ="+ a +" et b ="+ b);
    }
    public static void additionTableau () {
        int[] tab = new int[5];
        Scanner sc = new Scanner(System.in);
        int c = 0 ;
        for (int i = 0; i < 5; i++) {
            System.out.println("Donne moi un nombre");
            int a = sc.nextInt();
            tab[i] = a;
            c += a;
        }
        sc.close();
        System.out.println("La somme de ces nombres : " + c);
    }
    public static void bienvenue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Coucou donne moi ton prénom");
        String nom = sc.next();
        System.out.println("Donne moi ton genre");
        String sexe = sc.next();
        System.out.println("Tu t'appelle" +  nom + " et tu es un(e)" + sexe);
    }

    public static void moyenne2 (int a, int b , int c){
        int moyenne = (a+b+c)/3;
        if (moyenne > 12){
            System.out.println("Bien");
        } else if (moyenne < 10) {
            System.out.println("Non admis");
        } else
        System.out.println("Passable");
    }
    public static void languageList() {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
        System.out.println(languages);
    }

}
