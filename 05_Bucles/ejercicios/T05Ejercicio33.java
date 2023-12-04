
/**
 * Imprime una U
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio33
 */
import java.util.Scanner;

public class T05Ejercicio33 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h;

    System.out.print("Introduce la altura de la U: ");
    h = sc.nextInt();

    for (int i = 1; i < h; i++) {
      System.out.print("* ");
      for (int j = 2; j < h; j++) {
        System.out.print("  ");
      }
      System.out.println("*");
    }
    System.out.print("  ");
    for (int i = 2; i < h; i++) {
      System.out.print("* ");
    }

    sc.close();
  }
}