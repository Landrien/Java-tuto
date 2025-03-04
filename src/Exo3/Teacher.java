package Exo3;

public class Teacher extends Person{
    private String subject;

    Teacher (int Age){
        super(Age);
    }

   public void Explain() {
       System.out.println("Explanation begins");
   }
}
