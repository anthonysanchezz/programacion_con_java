/**
 * Prueba funciones externas de otro directorio
 * 
 * @author Antonio Sánchez
 */
/**
 * T08Ejemplo02
 */

import java.util.Scanner;
import matematicas.Varias;

public class T08Ejemplo02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un número entero positivo: ");
    int num = sc.nextInt();

    if (matematicas.Varias.esPrimo(num)) {
      System.out.println("El " + num + " es primo.");
      } else {
      System.out.println("El " + num + " no es primo.");
      }
      sc.close();
    }
}