
/**
 * LeeDatosScanner02
 */

import java.util.Scanner;

/**
 * Lee numeros
 * 
 * @author Antonio Sánchez
 */
public class LeeDatosScanner02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce tu nombre y tu edad (separados por un espacio): ");
    String nombre = sc.next();
    int edad = sc.nextInt();

    System.out.println("Te llamas " + nombre + " y tienes " + edad + " años.");
    sc.close();
  } // Cambio de prueba
}