
/**
 * T04Ejemplo06
 */
/**
 * Otra manera de hacer el ultimo ejercicio 
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;

public class T04Ejemplo06v2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;

    System.out
        .println("Que quieres calcular?\nArea de un cuadrado (1)\nArea de un rectángulo (2)\nArea de un triangulo (3)");
    opcion = sc.nextInt();

    switch (opcion) {
      case 1:
        System.out.print("Introduce la base de tu cuadrado (m): ");
        int base = sc.nextInt();

        int area = base * base;
        System.out.println("El area de tu cuadrado es " + area + " m2");
        break;
      case 2:
        System.out.print("Introduce la base de tu rectángulo (m): ");
        int baserec = sc.nextInt();

        System.out.print("Introduce la altura de tu rectángulo (m): ");
        int altura = sc.nextInt();

        int arearec = baserec * altura;
        System.out.println("El area de tu rectángulo es " + arearec + " m2.");
        break;
      case 3:
        System.out.print("Introduce la base de tu triángulo (m): ");
        int basetri = sc.nextInt();

        System.out.print("Introduce la altura de tu triángulo (m): ");
        int alturatri = sc.nextInt();

        double areatri = (double) (basetri * alturatri) / 2;
        System.out.println("El area de tu triángulo es " + areatri + " m2.");
        break;
      default:
        System.out.println("Esta no es una opcion");
        break;
    }
    sc.close();
  }
}