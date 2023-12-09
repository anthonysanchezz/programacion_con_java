/**
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio37
 */
import java.util.Scanner;
public class T05Ejercicio37 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número: ");
    String numero = sc.nextLine();

    int longitud = numero.length();

    int x = 0;

    System.out.print("El número " + numero + " en decimal es el ");

    for (int i = 0; i < longitud; i++) {
      x = Character.getNumericValue(numero.charAt(i));
      for (int j = 1; j <= x; j++) {
        System.out.print("| ");
      }
      System.out.print("- ");
    }

    System.out.println("en palotes.");

    sc.close();
  }
}