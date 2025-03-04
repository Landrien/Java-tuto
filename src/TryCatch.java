import javax.sound.midi.Soundbank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    static void saisieCorrect3(){
        int[] a = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        int b = -1;
        while (true) {
            try {
                System.out.println("Donne-moi un nombre entre 0 et 4 :");
                b = scanner.nextInt();

                // Vérifier si l'index est valide
                if (b < 0 || b >= a.length) {
                    System.out.println("Erreur : L'index doit être entre 0 et 4.");
                    continue; // Redemande la saisie
                }

                // Si tout est bon, on affiche et on sort de la boucle
                System.out.println("Le résultat est : " + a[b]);
                break;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
                System.out.println("Erreur : L'index est en dehors des limites du tableau");
                scanner.next();
            }
             catch (InputMismatchException inputMismatchException) {
                System.out.println("Erreur : Veuillez entrer un nombre valide.");
                scanner.next(); // Nettoie l'entrée incorrecte pour éviter une boucle infinie
            }

        scanner.close(); // Fermeture du scanner
        }
    }

    static void saisieCorrect4() { // Pb : Erreur catch mais met quand même le finally
        Scanner scanner = new Scanner(System.in);
        int a = -1;
        while (true) {
            try {
                System.out.println("Donne moi une note entre 0 et 100");
                a = scanner.nextInt();
                if (a < 0 || a > 100) {
                    throw new IllegalArgumentException("Erreur : Veillez entrer un nombre entre 0 et 100");
                }
                break;
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Erreur : Veillez entre un  nombre entier valide");
            }finally {
                System.out.println("Nombre valide");
                scanner.close();
            }
        }
    }

    static void saisieCorrect5() { // Pb : Erreur catch mais met quand même le finally
        Scanner scanner = new Scanner(System.in);
        int a = -1;
        while (true) {
            try {
                System.out.println("Donne moi ton age");
                a = scanner.nextInt();
                if (a < 0 || a > 100) {
                    throw new IllegalArgumentException("Erreur : Veillez entrer votre age");
                }
                break;
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Erreur : Veillez entre un  nombre entier valide");
            }finally {
                System.out.println("Age validé");
                scanner.close();
            }
        }
    }


    public static void main(String[] args) {
        saisieCorrect4();

    }
}
