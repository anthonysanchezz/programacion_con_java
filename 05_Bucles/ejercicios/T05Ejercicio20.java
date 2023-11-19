
/**
 * Imprime piramide vacia
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio20
 */
import java.util.Scanner;

public class T05Ejercicio20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un caracter: ");
    String car = sc.nextLine();

    System.out.print("Introduce un caracter: ");
    int h = sc.nextInt();

    int espaciosDelante = h - 1;
    int nivel = 1;
    int espaciosDentro = 0;

    while (nivel < h) {
      for (int i = 1; i <= espaciosDelante; i++) {
        System.out.print(" ");
      }
      System.out.print(car);
      for (int i = 1; i < espaciosDentro; i++) {
        System.out.print(" ");
      }
      if (nivel > 1) {
        System.out.print(car);
      }
      System.out.println();
      nivel++;
      espaciosDelante--;
      espaciosDentro += 2;
    }
    for (int i = 1; i < nivel * 2; i++) {
      System.out.print(car);
    }

    sc.close();
  }
}