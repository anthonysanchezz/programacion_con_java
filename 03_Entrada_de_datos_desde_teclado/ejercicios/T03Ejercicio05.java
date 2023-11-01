
/**
 * T03Ejercicio05
 */
/**
 * Calcula el área de un rectángulo
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;

public class T03Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int base;
    int altura;

    System.out.print("Introduce la base de tu rectángulo (m): ");
    base = sc.nextInt();

    System.out.print("Introduce la altura de tu rectángulo (m): ");
    altura = sc.nextInt();

    int area = base * altura;

    System.out.println("El área de tu rectángulo es " + area + " m2");

    sc.close();
  }
}