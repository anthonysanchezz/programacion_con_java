//  NO FUNCIONA TODAVÍA
/**
 * Realiza un programa que diga los dígitos que aparecen y los que no aparecen
 * en un número entero introducido por teclado. El orden es el que se muestra en
 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
 * largos.
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio48
 */
import java.util.Scanner;
public class T05Ejercicio48 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un número entero: ");
    int numero = sc.nextInt();

    int longitud = 0;
    int num = numero;

    while (numero != 0) {
      numero /= 10;
      longitud++;
    }

    int control = 0;
    String aparecen = "";
    String noAparecen = "";

    for (int i = 0; i < longitud; i++) {
      control = num % 10;
      for (int j = 0; j < 10; j++) {
        if (control == j) {
          aparecen = aparecen + control + " ";
        } else {
          noAparecen = noAparecen + control + " ";
        }
      }
    }
    System.out.println(aparecen);
    System.out.println(noAparecen);

    sc.close();
  }
}