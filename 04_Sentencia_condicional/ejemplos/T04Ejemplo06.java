
/**
 * T04Ejemplo06
 */
/**
 * Áreas 
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;

public class T04Ejemplo06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;

    System.out
        .println("Que quieres calcular?\nArea de un cuadrado (1)\nArea de un rectángulo (2)\nArea de un triangulo (3)");
    opcion = sc.nextInt();

    if (opcion == 1) {

      System.out.print("Introduce la base de tu cuadrado (m): ");
      int base = sc.nextInt();

      int area = base * base;
      System.out.println("El area de tu cuadrado es " + area + " m2.");

    } else if (opcion == 2) {

      System.out.print("Introduce la base de tu rectángulo (m): ");
      int base = sc.nextInt();

      System.out.print("Introduce la altura de tu rectángulo (m): ");
      int altura = sc.nextInt();

      int area = base * altura;
      System.out.println("El area de tu rectángulo es " + area + " m2.");

    } else if (opcion == 3) {

      System.out.print("Introduce la base de tu triángulo (m): ");
      int base = sc.nextInt();

      System.out.print("Introduce la altura de tu triángulo (m): ");
      int altura = sc.nextInt();

      double area = (double) (base * altura) / 2;
      System.out.println("El area de tu triángulo es " + area + " m2.");

    } else {
      System.out.println("Esta no es una opcion");
    }
    sc.close();
  }
}