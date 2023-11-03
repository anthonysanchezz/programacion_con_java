
/**
 * T03Ejercicio02
 */
/**
 * Conversor de euros a pesetas
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;

public class T03Ejercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double euro;

    System.out.print("Introduce una cantidad de euros: ");
    euro = sc.nextDouble();

    int peseta = (int) (euro * 166.386);

    System.out.printf("%.2f €", euro);
    System.out.print(" son ");
    System.out.printf("%d", peseta);
    System.out.print(" pesetas.");

    sc.close();
  }
}