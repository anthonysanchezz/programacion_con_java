
/**
 * Calcula la media de N numeros introducidos, para cuando se introduce un numero negativo
 * 
 * @author Antonio Sánchez
 */

import java.util.Scanner;

/**
 * T05Ejercicio10
 */
public class T05Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num = 0;
    double suma = 0;
    int i = 0;
    System.out.println("Introduce números, calculré la media de ellos (introduce un número negativo para acabar) ");
    do {
      System.out.print("Número: ");
      num = sc.nextInt();
      if (num > 0) {
        i++;
        suma += num;
      }
    } while (num >= 0);
    double media = suma / i;
    System.out.printf("La media es %.2f", media);
    sc.close();
  }
}