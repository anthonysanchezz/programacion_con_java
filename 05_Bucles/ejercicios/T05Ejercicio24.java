/**
 * Imprime una pirámide de números tan alta como el número introducido
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio24
 */
import java.util.Scanner;
public class T05Ejercicio24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la altura de tu pirámide: ");
    int num = sc.nextInt();

    int h = 1;
    int i= 0;
    int espacios = num - 1;

    while (h <= num) {
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      for (i = 1; i < h; i++) {
        System.out.print(i);
      }
      for (i = h; i > 0; i--) {
        System.out.print(i);
      }
      System.out.println();
      h++;
      espacios--;
    }
    sc.close();
  }
}