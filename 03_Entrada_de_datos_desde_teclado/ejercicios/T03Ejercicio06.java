
/**
 * T03Ejercicio06
 */
/**
 * Calcula el área de un triángulo
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;

public class T03Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int base;
    int altura;

    System.out.print("Introduce la base de tu triángulo (m): ");
    base = sc.nextInt();

    System.out.print("Introduce la altura de tu triángulo (m): ");
    altura = sc.nextInt();

    double area = (double) ((base * altura) / 2);

    System.out.println("El área de tu triángulo es " + area + " m2");

    sc.close();
  }
}