
/**
 * T03Ejercicio03
 */
/**
 * Conversor de pesetas a euros
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;

public class T03Ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int peseta;

    System.out.print("Introduce una cantidad de pesetas: ");
    peseta = sc.nextInt();

    double euro = (double) (peseta / 166.386);

    System.out.print(peseta + " pesetas son ");
    System.out.printf("%.2f", euro);
    System.out.println("€");

    sc.close();
  }
}