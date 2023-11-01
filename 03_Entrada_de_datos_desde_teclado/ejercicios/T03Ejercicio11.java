
/**
 * T03Ejercicio11
 */
/**
 * Conversor de Kb a Mb
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;

public class T03Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Kb;

    System.out.print("Introduce una cantidad de Kb: ");
    Kb = sc.nextInt();

    double Mb = (double) (Kb / 1024);

    System.out.println(Kb + " Kb son " + Mb + " Kb.");

    sc.close();
  }
}