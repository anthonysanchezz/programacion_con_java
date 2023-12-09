/**
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio29
 */
import java.util.Scanner;
public class T05Ejercicio29 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un número entero positivo: ");
    int maximo = sc.nextInt();                                                              // Pide el número hasta el que se va a llegar

    System.out.print("Introduce el número entre el que no quieres que sea divisible: ");
    int divisor = sc.nextInt();                                                             // Pide el que queremos que no sea divisor de nuestra solución

    System.out.print("Los números del 1 al " + maximo + " no divisible entre " + divisor + " son: ");

    for (int i = 1; i <= maximo; i++) {                                                     // Bucle que se repite del 1 al maximo introducido
      if (i % divisor != 0) {                                                               // Si la iteración NO es divisible entre el divisor introducido
        System.out.print(i + " ");                                                          // Se imprime la iteración
      }
    }    

    sc.close();
  }
}