
/**
 * T03Ejercicio07
 */
/**
 * Calcula el total de una factura a partir de la base imponible.
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;

public class T03Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double baseImponible;

    System.out.print("Introduce la base imponible: ");
    baseImponible = sc.nextDouble();

    double total = baseImponible * 1.21;

    System.out.printf("El total de la factura es %.2f €", total);

    sc.close();
  }
}