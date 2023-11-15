
/**
 * Cuenta cuantas cifras tiene un numero entero
 * 
 * @author Antonio Sánchez
 */

import java.util.Scanner;

/**
 * T05Ejercicio09
 */
public class T05Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long numeroIntroducido;
    int numeroCifras = 1; // En caso de no entrar en el siguiente bucle el numero es de una cifra

    System.out.print("Introduzca un número entero y te diré cuántas cifras tiene: ");
    numeroIntroducido = sc.nextLong();
    long n = numeroIntroducido;

    while (n >= 10) {
      numeroCifras++;
      n /= 10;
    }
    System.out.println("Tu número tiene " + numeroCifras + " cifras");
    sc.close();
  }
}