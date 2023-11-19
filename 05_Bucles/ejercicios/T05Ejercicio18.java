
/**
 * Introduce dos numeros, evalua si son distintos e imprime los enteros comprendidos entre ellos de 7 en 7
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio18
 */
import java.util.Scanner;

public class T05Ejercicio18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce dos números e iré incrementando de 7 en 7 desde el más pequeño al más grande.");

    System.out.print("Introduce un número: ");
    double num1 = sc.nextDouble();

    System.out.print("Introduce otro número: ");
    double num2 = sc.nextDouble();

    if (num1 != num2) {
      if (num1 < num2) {
        for (int i = (int) (num1); i <= num2; i += 7) {
          System.out.print(i + " ");
        }
      } else {
        for (int i = (int) (num2); i <= num1; i += 7) {
          System.out.print(i + " ");
        }
      }
    } else {
      System.out.println("Los números deben ser distintos.");
    }

    sc.close();
  }
}