import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Exo8 {

    static ArrayList<String> Inverse(ArrayList<String> a){
        ArrayList<String> reversedList = new ArrayList<>();

        // Parcours de la liste originale en ordre inverse
        for (int i = a.size() - 1; i >= 0; i--) {
            reversedList.add(a.get(i)); // Ajout à la nouvelle liste
        }

        return reversedList; // Retourne la liste inversée
    }

    public static void main(String[] args){
    ArrayList<String> c = new ArrayList<>();
        c.add("e");
        c.add("s");
        c.add("r");
        c.add("e");
        c.add("v");
        c.add("n");
        c.add("i");

        System.out.println(Inverse(c));

   /* Iterator iter = c.iterator();
        while (iter.hasNext()){}*/

}}
