package Exo3;

public class Person {
    int Age;

    Person(int Age){
        this.Age = Age;
    }
    public void Hello() {
        System.out.println("Hello");
    }

    int getAge(){
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
