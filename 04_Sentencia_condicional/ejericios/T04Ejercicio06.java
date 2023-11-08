
/**
 * Calcula e imprime el tiempo que tarda un objeto en caer desde una altura determinada
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio06
 */
import java.util.Scanner;

public class T04Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double h;

    System.out.print("¿Desde qué altura cae el objeto? ");
    h = sc.nextDouble();

    final double G = 9.81;

    double t = Math.pow(((2 * h) / G), 0.5);

    System.out.print("El tiempo que un objeto tarda en caer desde " + h + " metros es ");
    System.out.printf("%.2f\"", t);

    sc.close();
  }
}