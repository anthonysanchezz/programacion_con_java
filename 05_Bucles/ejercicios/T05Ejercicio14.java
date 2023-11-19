
/**
 * Pide una base y un exponente y hace la potencia
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio14
 */
import java.util.Scanner;

public class T05Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double base;

    System.out.print("Introduce la base de tu potencia: ");
    base = sc.nextInt();

    double exp;

    System.out.print("Introduce el exponente de tu potencia: ");
    exp = sc.nextInt();

    double pot = 1;

    for (int i = 1; i <= exp; i++) {
      pot *= base;
    }

    System.out.println(base + " ^ " + exp + " = " + pot);

    sc.close();
  }
}