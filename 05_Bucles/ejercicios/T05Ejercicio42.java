/**
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los 5 números consecutivos a partir del número
 * introducido. Al lado de cada número se debe indicar si se trata de un primo
 * o no.
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio42
 */
import java.util.Scanner;
public class T05Ejercicio42 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numero = sc.nextInt();

    boolean esPrimo = true;

    for (int i = numero; i < (numero + 5); i++) {
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        System.out.println(i + " es primo");
      } else {
        System.out.println(i + " no es primo");
      }
      esPrimo = true;
    }

    sc.close();
  }
}