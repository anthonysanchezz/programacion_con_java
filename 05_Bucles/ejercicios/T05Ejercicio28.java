/**
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio28
 */
import java.util.Scanner;
public class T05Ejercicio28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número entero: ");           
    int numero = sc.nextInt();                                              // Pide un número entero

    int factorial = 1;                                                      // Inicializa el factorial en 1 para luego ir multiplicándolo

    for (int i = 1; i <= numero; i++) {                                     // Bucle que se repite desde 1 hasta el número introducido
      factorial *= i;                                                       // Multiplica el factorial por la iteración
    }
    
    System.out.println("6! = " + factorial);                                // Imprime el factorial

    sc.close();
  }
}