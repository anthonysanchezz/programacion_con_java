
/**
 * Explica tu codigo aqui
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio19
 */
import java.util.Scanner;

public class T05Ejercicio19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un carácter: ");
    String car = sc.nextLine();

    System.out.print("Introduce la altura de la pirámide: ");
    int h = sc.nextInt();

    int nivel = 1;
    int linea = 1;
    int espacio = h - 1;

    while (nivel <= h) {
      for (int i = 1; i <= espacio; i++) {
        System.out.print(" ");
      }
      for (int i = 1; i <= linea; i++) {
        System.out.print(car);
      }
      System.out.println();

      nivel++;
      espacio--;
      linea += 2;
    }

    sc.close();
  }
}