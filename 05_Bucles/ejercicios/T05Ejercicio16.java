
/**
 * Evalua si un numero introducido por teclado es primo o no
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio16
 */
import java.util.Scanner;

public class T05Ejercicio16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.print("Introduce un numero entero positivo: ");
    numero = sc.nextInt();

    boolean esPrimo = true;

    for (int i = 2; i < numero; i++) {
      if (numero % i == 0) {
        esPrimo = false;
      }
    }
    if (!esPrimo) {
      System.out.println("No es primo");
    } else {
      System.out.println("Es primo");
    }

    sc.close();
  }
}