package Exo6;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5,6);
        Rectangle rectangle = new Rectangle(7,9);
        Cercle cercle = new Cercle(4);

        triangle.getSurface();
        rectangle.getSurface();
        cercle.getSurface();
    }
}
