
/**
 * T04Ejemplo04
 */
/**
 * Solicita edad y dice si es menor, mayor o jubilado
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;

public class T04Ejemplo04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int edad;

    System.out.print("¿Que edad tienes?");
    edad = sc.nextInt();

    if (edad >= 0 && edad < 18) {
      System.out.println("Eres menor de edad");
    } else if (edad >= 18 && edad <= 63) {
      System.out.println("Eres mayor de edad");
    } else {
      System.out.println("Eres jubilado");
    }
    sc.close();
  }
}