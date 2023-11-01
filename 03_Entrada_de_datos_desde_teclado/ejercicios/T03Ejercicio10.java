
/**
 * T03Ejercicio10
 */
/**
 * Conversor de Mb a Kb
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;

public class T03Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Mb;

    System.out.print(" Introduce una cantidad de Mb: ");
    Mb = sc.nextInt();

    int Kb = Mb * 1024;

    System.out.println(Mb + " Mb son " + Kb + " Kb.");
    sc.close();
  }
}