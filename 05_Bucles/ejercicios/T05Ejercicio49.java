// No consigo sacar el mínimo
/**
 * Realiza un programa que calcule el máximo, el mínimo y la media de una serie
 * de números enteros positivos introducidos por teclado. El programa terminará
 * cuando el usuario introduzca un número primo. Este último número no se
 * tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
 * números ha introducido el usuario (sin contar el primo que sirve para salir).
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio49
 */
import java.util.Scanner;
public class T05Ejercicio49 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean esPrimo = false;
    System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: ");

    int contador = 0;
    int maximo = 0;
    int minimo = maximo;
    double suma = 0;

    while (!esPrimo) {
      int numero = sc.nextInt();
      esPrimo = true;
      for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
          esPrimo = false;
        }
      }
      if (!esPrimo) {
        if (numero > maximo) {
          maximo = numero;
        }
        if (numero < minimo) {
          minimo = numero;
        }
        suma += numero;
        contador++;
      } 
    }

    double media = suma / contador;

    System.out.println("Has introducido " + contador + " números no primos.");
    System.out.println("Máximo: " + maximo);
    System.out.println("Mínimo: " + minimo);
    System.out.println("Media: " + media);

    sc.close();
  }
}