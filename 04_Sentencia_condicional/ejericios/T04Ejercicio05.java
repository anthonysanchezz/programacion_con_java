
/**
 * Resuelve ecucaciones de primer grado tipo ax + b = 0
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio05
 */
import java.util.Scanner;

public class T04Ejercicio05 {
  public static void main(String[] args) {
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");

    Scanner sc = new Scanner(System.in);
    double a;

    System.out.print("Por favor, introduzca el valor de a: ");
    a = sc.nextDouble();

    double b;

    System.out.print("Ahora introduzca el valor de b: ");
    b = sc.nextDouble();

    double x;
    if (a != 0) {
      x = (-b) / a;
      System.out.printf("x = %.2f", x);
    } else {
      System.out.println("Esa ecuación no tiene solución real.");
    }
    sc.close();
  }
}