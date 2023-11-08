
/**
 * Explica tu codigo aqui
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio09
 */
import java.util.Scanner;

public class T04Ejercicio09 {
  public static void main(String[] args) {
    System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax2 + bx + c = 0");

    Scanner sc = new Scanner(System.in);
    double a;

    System.out.print("Por favor, introduzca el valor de a: ");
    a = sc.nextDouble();

    double b;

    System.out.print("Ahora introduzca el valor de b: ");
    b = sc.nextDouble();

    double c;

    System.out.print("Por último, introduzca el valor de c: ");
    c = sc.nextDouble();

    double discriminante = Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5);

    if (a == 0) {
      if (discriminante < 0) {
        System.out.println("No tiene solución.");
      }
    } else {
      double x1 = ((-b) + discriminante) / (2 * a);
      double x2 = ((-b) - discriminante) / (2 * a);
      System.out.printf("x1 = %.2f\n", x1);
      System.out.printf("x2 = %.2f\n", x2);
    }
    sc.close();
  }
}