/**
 * Explica tu codigo aqui
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio39
 */
import java.util.Scanner;
public class T05Ejercicio39 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un número entero positivo: ");
    int numero = sc.nextInt();

    int fact = 1;

    for (int i = 1; i <= numero; i++) {
      for (int j = 1; j <= i; j++) {
        fact *= j;
      }
      System.out.println(i + "! = " + fact);
      fact = 1;
    }

    sc.close();
  }
}