
/**
 * T04Ejemplo02
 */

import java.util.Scanner;

/**
 * Uso de operadores lógicos
 * 
 * @author Antonio Sánchez
 */
public class T04Ejemplo02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.print("Introduce un numero entre el 1 y el 100: ");
    numero = sc.nextInt();

    if ((numero >= 1) && (numero <= 100)) {
      System.out.println("Enhorabuena el valor esta en el rango indicado!");
    } else {
      System.out.println("Te he dicho un valor entre 1 y 100!");
    }
    sc.close();
  }
}
