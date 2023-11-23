
/**
 * Imprime una L con la altura introducida y longitud de la mitad mas 1
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio31
 */
import java.util.Scanner;

public class T05Ejercicio31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la altura de la L: ");
    int h = sc.nextInt();

    for (int i = 1; i < h; i++) {
      System.out.println("*");
    }
    for (int j = 1; j <= ((h / 2) + 1); j++) {
      System.out.print("* ");
    }

    // int numero;

    // System.out.print();
    // numero = sc.nextInt();

    sc.close();
  }
}