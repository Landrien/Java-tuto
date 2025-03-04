package Exo3;

public class Student extends Person{

    Student(int Age){
        super(Age);
    }



   public void GoToClasses() {
        System.out.println("I'm going to class");
   }

   public void DisplayAge() {
       System.out.println("My age is : " + super.Age + " years old");
   }

    public static void main(String[] args){
        Student Enzo = new Student(10);
        Enzo.GoToClasses();
        Enzo.DisplayAge();
        Enzo.setAge(9);
        Enzo.DisplayAge();
    }
}
