
/**
 * Numero capicuo
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio20
 */
import java.util.Scanner;

public class T04Ejercicio20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;
    boolean capicua = false;

    System.out.print("Dame un numero (max 5 cifras): ");
    numero = sc.nextInt();

    if (numero < 10) {
      capicua = true;
    }
    if (numero >= 10 && numero < 100) {
      if (numero / 10 == numero % 10) {
        capicua = true;
      }
    }
    if (numero >= 100 && numero < 1000) {
      if (numero % 10 == numero / 100) {
        capicua = true;
      }
    }
    if (numero >= 1000 && numero < 10000) {
      if (((numero / 1000) == (numero % 10)) && (((numero / 100) % 10) == ((numero % 100) / 10))) {
        capicua = true;
      }
    }
    if (numero >= 10000 && numero < 100000) {
      if (((numero / 10000) == (numero % 10)) && ((numero / 1000) % 10) == ((numero % 100) / 10)) {
        capicua = true;
      }
    }

    // capicua == true <--> capicua

    if (capicua) {
      System.out.println("El numero " + numero + " es capicúo");
    } else {
      System.out.println("El numero " + numero + " no es capicúo");
    }

    sc.close();
  }
}