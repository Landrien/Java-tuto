import java.util.Scanner;

public class Student {
    String nom; // attribut
    int note1, note2;

    public Student (String nom, int note1, int note2){ // constructeur

        this.nom = nom;
        this.note1 = note1;
        this.note2 = note2;
    }

    public static int calc_moy(int note1, int note2){ // fais la moyenne
        return (note1+note2)/2;
    }
    public static int note (){ // demande et enregistre la note
        Scanner sc = new Scanner(System.in);
        System.out.println("Donne moi ta note");
        int a = sc.nextInt();
        return a;
}
    public static String nom1(){ // demande et enregistre le nom
        Scanner sc = new Scanner(System.in);
        System.out.println("Donne moi ton nom");
        String a = sc.next();
        return a;
}
    public void show (){ // affiche le nom et la moyenne des notes
        System.out.println(this.nom);
        System.out.println(Student.calc_moy(this.note1,this.note2));
    }

    public String toString(){ // Permet d'afficher plus simplement les attributs de la classe
        return nom+" " +note2+" "+note1;
    }

    public static void main (String[] args){

        Student student = new Student(nom1(),note(),note()); // Initialisation de l'objet
        student.show();
        System.out.println(student); // comment afficher toString
    }
}
