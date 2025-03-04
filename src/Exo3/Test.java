package Exo3;

public class Test {
    public static void main(String[] args){
        Student Enzo = new Student(15);
        Enzo.Hello();
        Enzo.GoToClasses();
        Enzo.DisplayAge();
        Enzo.setAge(9);
        Enzo.DisplayAge();
        Teacher Mme_Legrand = new Teacher(40);
        Mme_Legrand.Hello();
        Mme_Legrand.Explain();
    }
}
