
/**
 * Dice si un numero es par y/o divisible entre 5
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio14
 */
import java.util.Scanner;

public class T04Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.print("Dame un número: ");
    numero = sc.nextInt();

    double div2 = (double) (numero) % 2;
    double div5 = (double) (numero) % 5;

    if (div2 == 0) {
      if (div5 == 0) {
        System.out.println(numero + " es par y divisible entre 5.");
      } else {
        System.out.println(numero + " es par.");
      }
    } else if (div5 == 0) {
      System.out.println(numero + " es divisible entre 5.");
    } else {
      System.out.println(numero + " no es par ni divisible entre 5.");
    }

    sc.close();
  }
}