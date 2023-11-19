
/**
 * 13. Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio13
 */
import java.util.Scanner;

public class T05Ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n;
    int pos = 0;
    int neg = 0;

    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un número: ");
      n = sc.nextDouble();

      if (n > 0) {
        pos++;
      } else if (n < 0) {
        neg++;
      }
    }
    System.out.println("Has introducido " + pos + " números positivos y " + neg + " números negativos");
    sc.close();
  }
}