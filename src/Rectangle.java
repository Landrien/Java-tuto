import java.util.Scanner;

public class Rectangle {
    int a;
    int b;
    public int surface(int a, int b){
        return a*b;
    }

    public void Somme (int a, int b){
        this.a = a;
        this.b = b;
    }

    public int addition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donne moi un nombre");
        a = sc.nextInt();
        System.out.println("Donne moi un deuxième nombre");
        b = sc.nextInt();
        return a+b;

    }
    public static void main(String[] args){
         Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.surface(6,7));
        System.out.println(rectangle.addition());


        }
}
