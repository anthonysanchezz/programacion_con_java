
/**
 * LeeDatosScanner
 */

import java.util.Scanner;

/**
 * Lectura de datos desde el teclado usando la clase Scanner
 * 
 * @author Antonio Sánchez
 */
public class LeeDatosScanner01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");

    System.out.print("Introduce tu nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Introduce tu edad: ");
    String edad = sc.nextLine();

    System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años.");
    sc.close();
  }
}