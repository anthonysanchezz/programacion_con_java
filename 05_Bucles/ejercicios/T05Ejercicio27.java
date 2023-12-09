/**
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio27
 */
import java.util.Scanner;
public class T05Ejercicio27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Dime un número entero: ");
    int numero = sc.nextInt();                              // Pide un número entero

    for (int i = 1; i <= numero; i++) {                     // Bucle que empieza en 1 y acaba en el número introducido, va sumando la iteración de 1 en 1
      if (i % 3 == 0) {                                     // Si la iteración es divisible entre 3
        System.out.println(i);                              // Imprime la iteración
      }
    }

    sc.close();
  }
}