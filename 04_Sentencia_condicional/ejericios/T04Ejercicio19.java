
/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo. Se permiten números de hasta 5 dígito
 * 
 * @author Antonio Sánchez
 */
/**
 * T04Ejercicio19
 */
import java.util.Scanner;

public class T04Ejercicio19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.print("Dime un numero: ");
    numero = sc.nextInt();

    int digControl = 0;

    if (numero > 10000) {
      digControl += 1;
      numero = numero - ((numero / 10000) * 10000);
    }
    if (numero > 1000) {
      digControl += 1;
      numero = numero - ((numero / 1000) * 1000);
    }
    if (numero > 100) {
      digControl += 1;
      numero = numero - ((numero / 100) * 100);
    }
    if (numero > 10) {
      digControl += 1;
      numero = numero - ((numero / 10) * 10);
    }
    if (numero < 10) {
      digControl += 1;
    }

    System.out.println("El numero tiene " + digControl + " digitos.");

    sc.close();
  }
}