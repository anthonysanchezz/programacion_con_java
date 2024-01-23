/**
 * Funcion para mostrar si un numero es primo o no
 * 
 * @author Antonio Sánchez
 */
import java.util.Scanner;
public class T08Ejemplo01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un número: ");
    int num = sc.nextInt();

    if (esPrimo(num)) {                                 // Comprueba si la funcion esPrimo es verdadera con el parametro introducido
      System.out.println("El número es primo");
    } else {
      System.out.println("El número NO es primo");
    }
    sc.close();
  }

  public static boolean esPrimo(int x) {                // Declara función esPrimo, declarando el parámetro x, para comprobarlo
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {                               // En caso de ser primo
        return false;                                   // Devuelve la función como falsa
      }
    }                                                   // En caso contrario

    return true;                                        // Devuelve la función como verdadera
  }
}
