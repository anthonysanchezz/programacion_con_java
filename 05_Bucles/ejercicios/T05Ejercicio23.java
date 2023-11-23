
/**
 * Explica tu codigo aqui
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio23
 */
import java.util.Scanner;

public class T05Ejercicio23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double num = 0;
    double suma = 0;
    int cont = 0;

    while (suma < 10000) {
      System.out.print("Introduce un número: ");
      num = sc.nextDouble();
      suma += num;
      cont++;
    }

    System.out.printf("El total acomulado es %.2f\n", suma);
    System.out.println("Has introducido " + cont);
    System.out.printf("Y la media de ellos es %.2f", (suma / cont));

    sc.close();
  }
}