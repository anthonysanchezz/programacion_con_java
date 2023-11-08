
/**
 * Calcula e imprime la media de tres examanes 
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio07
 */
import java.util.Scanner;

public class T04Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n1;

    System.out.print("Da la primera nota: ");
    n1 = sc.nextDouble();

    double n2;

    System.out.print("Da la segunda nota: ");
    n2 = sc.nextDouble();

    double n3;

    System.out.print("Da la tercera nota: ");
    n3 = sc.nextDouble();

    double media = (n1 + n2 + n3) / 3;

    System.out.printf("La media es %.2f", media);

    sc.close();
  }
}
