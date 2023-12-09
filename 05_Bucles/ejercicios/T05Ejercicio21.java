
/**
 * Contador de numeros hasta introducir numero negativo, calcula la media de los impares y dice cual es el mayor de los pares.
 * 
 * @author Antonio Sánchez
 */
/**
 * T05Ejercicio21
 */
import java.util.Scanner;

public class T05Ejercicio21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double num = 0;
    int cont = 0;
    int impares = 0;
    double sumaImpares = 0;
    double mayor = 0;

    System.out.println("Introduce números (número negativo para acabar): ");

    while (num >= 0) {                                                              // Lo repite hasta que sea negativo
      System.out.print("Introduce un número: ");
      num = sc.nextDouble();
      if (num >= 0) {                                                               // Si es mayor que 0 el contador aumenta
        cont++;
        if (num % 2 != 0) {                                                         // Si es impar
          sumaImpares += num;                                                       // A la suma de los impares se le suma el número
          impares++;                                                                // Y el contador de impares también aumenta
        }
        if (num % 2 == 0 && num > mayor) {                                          // Si es par y además más grande que el mayor de los pares
          mayor = num;                                                              // El número introducido es guardado como el mayor de ellos
        }
      }
    }
    System.out.println("Has introducido " + cont + " números");
    System.out.printf("La media de los impares es %.2f\n", (sumaImpares / impares));
    System.out.printf("El mayor de los pares es %.2f\n", mayor);

    sc.close();
  }
}