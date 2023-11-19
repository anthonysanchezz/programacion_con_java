
/**
 * Imprime todas las potencias hasta el exponente introducido
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio15
 */
import java.util.Scanner;

public class T05Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double base;

    System.out.print("Introduce la base: ");
    base = sc.nextDouble();

    int exp;

    System.out.print("Introduce el exponente: ");
    exp = sc.nextInt();

    double pot = 1;

    for (int i = 1; i <= exp; i++) {
      pot *= base;
      System.out.println(base + " ^ " + i + " = " + pot);
    }

    sc.close();
  }
}