
/**
 * Calcula cual es el primer dígito de un número (hasta el numero 99999)
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio18
 */
import java.util.Scanner;

public class T04Ejercicio18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.print("Introduce un numero entero: ");
    numero = sc.nextInt();

    int primerDigito = 0;

    if (numero < 10) {
      primerDigito = numero;
    } else if (numero < 100 && numero >= 10) {
      primerDigito = numero / 10;
    } else if (numero < 1000 && numero >= 100) {
      primerDigito = numero / 100;
    } else if (numero < 10000 && numero >= 1000) {
      primerDigito = numero / 1000;
    } else if (numero < 100000) {
      primerDigito = numero / 10000;
    } else {
      System.out.println("Demasiado grande :(");
    }

    System.out.println("El primer dígito es: " + primerDigito);

    sc.close();
  }
}