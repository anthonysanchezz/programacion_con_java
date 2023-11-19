
/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y
 * el cubo de los 5 primeros números enteros a partir de uno que se
 * introduce por teclado. * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio11
 */
import java.util.Scanner;

public class T05Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.print("Introduce un numero: ");
    numero = sc.nextInt();

    for (int i = numero; i < (numero + 5); i++) {
      System.out.println(i + " " + (int) (Math.pow(i, 2)) + " " + (int) (Math.pow(i, 3)));
    }

    sc.close();
  }
}